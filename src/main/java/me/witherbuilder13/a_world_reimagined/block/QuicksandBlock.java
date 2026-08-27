package me.witherbuilder13.a_world_reimagined.block;

import me.witherbuilder13.a_world_reimagined.item.AWRItems;
import me.witherbuilder13.a_world_reimagined.tag.AWREntityTypeTags;
import me.witherbuilder13.a_world_reimagined.tag.AWRItemTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jspecify.annotations.Nullable;

import java.util.Optional;

public class QuicksandBlock extends FallingBlock implements BucketPickup {
	
	private static final VoxelShape FALLING_COLLISION_SHAPE = Shapes.box(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
	
	public QuicksandBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	protected boolean skipRendering(final BlockState state, final BlockState neighborState, final Direction direction) {
		return neighborState.is(this) || super.skipRendering(state, neighborState, direction);
	}
	
	@Override
	protected void entityInside(
			final BlockState state,
			final Level level,
			final BlockPos pos,
			final Entity entity,
			final InsideBlockEffectApplier effectApplier,
			final boolean isPrecise
	) {
		if (!(entity instanceof LivingEntity) || entity.getInBlockState().is(this)) {
			entity.makeStuckInBlock(state, new Vec3(0.7F, 1.0, 0.7F));
			if (level.isClientSide()) {
				RandomSource random = level.getRandom();
				boolean isMoving = entity.xOld != entity.getX() || entity.zOld != entity.getZ();
				if (isMoving && random.nextBoolean()) {
					level.addParticle(
							new BlockParticleOption(ParticleTypes.FALLING_DUST, state),
							entity.getX(),
							pos.getY() + 1,
							entity.getZ(),
							Mth.randomBetween(random, -1.0F, 1.0F) * 0.083333336F,
							0.05F,
							Mth.randomBetween(random, -1.0F, 1.0F) * 0.083333336F
					);
				}
			}
		}
		
		if (entity instanceof LivingEntity livingEntity && level instanceof ServerLevel serverLevel) {
			BlockPos eyePos = BlockPos.containing(livingEntity.getEyePosition(1.0F));
			if (eyePos.equals(pos))
				livingEntity.hurtServer(serverLevel, level.damageSources().inWall(), 1.0F);
		}
	}
	
	@Override
	public void fallOn(final Level level, final BlockState state, final BlockPos pos, final Entity entity, final double fallDistance) {
		if (!(fallDistance < 4.0) && entity instanceof LivingEntity livingEntity) {
			LivingEntity.Fallsounds entityFallsounds = livingEntity.getFallSounds();
			SoundEvent fallSound = fallDistance < 7.0 ? entityFallsounds.small() : entityFallsounds.big();
			entity.playSound(fallSound, 1.0F, 1.0F);
		}
	}
	
	@Override
	protected VoxelShape getEntityInsideCollisionShape(final BlockState state, final BlockGetter level, final BlockPos pos, final Entity entity) {
		VoxelShape collisionShape = this.getCollisionShape(state, level, pos, CollisionContext.of(entity));
		return collisionShape.isEmpty() ? Shapes.block() : collisionShape;
	}
	
	@Override
	protected VoxelShape getCollisionShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
		if (!context.isPlacement() && context instanceof EntityCollisionContext entityCollisionContext) {
			Entity entity = entityCollisionContext.getEntity();
			if (entity != null) {
				if (entity.fallDistance > 2.5) {
					return FALLING_COLLISION_SHAPE;
				}
				
				boolean isFallingBlock = entity instanceof FallingBlockEntity;
				if (isFallingBlock || canEntityWalkOnQuicksand(entity) && context.isAbove(Shapes.block(), pos, false) && !context.isDescending()) {
					return super.getCollisionShape(state, level, pos, context);
				}
			}
		}
		
		return Shapes.empty();
	}
	
	@Override
	protected VoxelShape getVisualShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
		return Shapes.empty();
	}
	
	public static boolean canEntityWalkOnQuicksand(final Entity entity) {
		if (entity.is(AWREntityTypeTags.QUICKSAND_WALKABLE_MOBS)) {
			return true;
		} else {
			return entity instanceof LivingEntity livingEntity && livingEntity.getItemBySlot(EquipmentSlot.FEET).is(AWRItemTags.ALLOWS_WALKING_ON_QUICKSAND);
		}
	}
	
	@Override
	public ItemStack pickupBlock(final @Nullable LivingEntity user, final LevelAccessor level, final BlockPos pos, final BlockState state) {
		level.setBlock(pos, Blocks.AIR.defaultBlockState(), 11);
		if (!level.isClientSide()) {
			level.levelEvent(2001, pos, Block.getId(state));
		}
		
		return new ItemStack(AWRItems.QUICKSAND_BUCKET);
	}
	
	@Override
	public Optional<SoundEvent> getPickupSound() {
		return Optional.of(SoundEvents.BUCKET_FILL_POWDER_SNOW);
	}
	
	@Override
	protected boolean isPathfindable(final BlockState state, final PathComputationType type) {
		return true;
	}
	
	@Override
	public void tick(final BlockState state, final ServerLevel level, final BlockPos pos, final RandomSource random) {
		if (FallingBlock.isFree(level.getBlockState(pos.below())) && pos.getY() >= level.getMinY()) {
			FallingBlockEntity entity = FallingBlockEntity.fall(level, pos, state);
			entity.dropItem = false;
		}
	}
	
	@Override
	public int getDustColor(BlockState blockState, BlockGetter level, BlockPos pos) {
		return 14406560;
	}
}
