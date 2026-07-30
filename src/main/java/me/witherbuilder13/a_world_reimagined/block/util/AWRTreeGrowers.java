package me.witherbuilder13.a_world_reimagined.block.util;

import me.witherbuilder13.a_world_reimagined.world.feature.AWRTreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.Feature;

import java.util.function.Consumer;

public class AWRTreeGrowers {
    
    public static final TreeGrower CEDAR = new TreeGrower(
            "cedar",
            weightedList(b -> b
                    .add(AWRTreeFeatures.CEDAR)
                    .add(AWRTreeFeatures.CEDAR_CANOPY)
                    .add(AWRTreeFeatures.CEDAR_FANCY)
            ),
            WeightedList.of(),
            WeightedList.of(),
            AWRTreeFeatures.CEDAR_CANOPY
    );
    public static final TreeGrower FIR = new TreeGrower(
            "fir",
            weightedList(b -> b
                    .add(AWRTreeFeatures.FIR)
                    .add(AWRTreeFeatures.FIR_FANCY)
            ),
            WeightedList.of(),
            WeightedList.of(),
            AWRTreeFeatures.FIR
    );
    public static final TreeGrower HEMLOCK = new TreeGrower(
            "hemlock",
            weightedList(b -> b
                    .add(AWRTreeFeatures.HEMLOCK)
                    .add(AWRTreeFeatures.HEMLOCK_FANCY)
            ),
            WeightedList.of(),
            WeightedList.of(),
            AWRTreeFeatures.HEMLOCK
    );
    public static final TreeGrower LARCH = new TreeGrower(
            "larch",
            weightedList(b -> b
                    .add(AWRTreeFeatures.LARCH)
                    .add(AWRTreeFeatures.LARCH_FANCY)
            ),
            WeightedList.of(),
            WeightedList.of(),
            AWRTreeFeatures.LARCH
    );
    public static final TreeGrower PINE = new TreeGrower(
            "pine",
            weightedList(b -> b
                    .add(AWRTreeFeatures.PINE)
                    .add(AWRTreeFeatures.PINE_TOP)
                    .add(AWRTreeFeatures.PINE_FANCY)
            ),
            weightedList(b -> b
                    .add(AWRTreeFeatures.PINE_MEGA)
                    .add(AWRTreeFeatures.PINE_TOP_MEGA)
            ),
            WeightedList.of(),
            AWRTreeFeatures.PINE
    );
    public static final GiantTreeGrower REDWOOD = new GiantTreeGrower(
            "redwood",
            WeightedList.of(AWRTreeFeatures.REDWOOD),
            WeightedList.of(),
            AWRTreeFeatures.REDWOOD
    );
    public static final GiantTreeGrower SEQUOIA = new GiantTreeGrower(
            "sequoia",
            WeightedList.of(),
            WeightedList.of(AWRTreeFeatures.SEQUOIA),
            AWRTreeFeatures.SEQUOIA
    );

    private static WeightedList<ResourceKey<Feature>> weightedList(Consumer<WeightedList.Builder<ResourceKey<Feature>>> consumer) {
        WeightedList.Builder<ResourceKey<Feature>> builder = new WeightedList.Builder<>();
        consumer.accept(builder);

        return builder.build();
    }
}
