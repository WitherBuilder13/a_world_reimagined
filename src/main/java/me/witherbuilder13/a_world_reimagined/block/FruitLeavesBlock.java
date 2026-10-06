package me.witherbuilder13.a_world_reimagined.block;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TintedParticleLeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.phys.BlockHitResult;

public class FruitLeavesBlock extends TintedParticleLeavesBlock {
	
	public static final BooleanProperty FRUIT = BooleanProperty.create("fruit");
	private final ResourceKey<LootTable> loot;
	
	public FruitLeavesBlock(float leafParticleChance, Properties properties, ResourceKey<LootTable> loot) {
		super(leafParticleChance, properties);
		this.loot = loot;
		this.registerDefaultState(super.defaultBlockState().setValue(FRUIT, false));
	}
	
	@Override
	protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
		if (state.getValue(FRUIT)) {
			if (level instanceof ServerLevel serverLevel) {
				Block.dropFromBlockInteractLootTable(
						serverLevel,
						loot,
						pos,
						state,
						level.getBlockEntity(pos),
						null,
						player,
						(serverlvl, itemStack) -> Block.popResource(serverlvl, pos, itemStack)
				);
				serverLevel.playSound(
						null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + serverLevel.getRandom().nextFloat() * 0.4F
				);
				BlockState newState = state.setValue(FRUIT, false);
				serverLevel.setBlock(pos, newState, 2);
				serverLevel.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, newState));
			}
			
			return InteractionResult.SUCCESS;
		} else {
			return super.useWithoutItem(state, level, pos, player, hitResult);
		}
	}
	
	@Override
	protected void createBlockStateDefinition(final StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FRUIT);
	}
}
