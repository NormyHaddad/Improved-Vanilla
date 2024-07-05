package net.garunix.garunixpansion.world.gen.treedecorator;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.block.*;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class ModTreeDecorator extends TreeDecorator {

    @Override
    protected abstract TreeDecoratorType<?> getType();

    //@Override
    public abstract void generate(Generator generator);

    public static final class Generator {
        private final TestableWorld world;
        private final BiConsumer<BlockPos, BlockState> replacer;
        private final Random random;
        private final ObjectArrayList<BlockPos> logPositions;
        private final ObjectArrayList<BlockPos> leavesPositions;
        private final ObjectArrayList<BlockPos> rootPositions;

        public Generator(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, Set<BlockPos> logPositions, Set<BlockPos> leavesPositions, Set<BlockPos> rootPositions) {
            this.world = world;
            this.replacer = replacer;
            this.random = random;
            this.rootPositions = new ObjectArrayList(rootPositions);
            this.logPositions = new ObjectArrayList(logPositions);
            this.leavesPositions = new ObjectArrayList(leavesPositions);
            this.logPositions.sort(Comparator.comparingInt(Vec3i::getY));
            this.leavesPositions.sort(Comparator.comparingInt(Vec3i::getY));
            this.rootPositions.sort(Comparator.comparingInt(Vec3i::getY));
        }

        public void replaceWithVine(Block block, BlockPos pos, BooleanProperty faceProperty) {
            this.replace(pos, (BlockState) Blocks.VINE.getDefaultState().with(faceProperty, true));
        }

        public void replace(BlockPos pos, BlockState state) {
            this.replacer.accept(pos, state);
        }

        public boolean isAir(BlockPos pos) {
            return this.world.testBlockState(pos, AbstractBlock.AbstractBlockState::isAir);
        }

        public TestableWorld getWorld() {
            return this.world;
        }

        public Random getRandom() {
            return this.random;
        }

        public ObjectArrayList<BlockPos> getLogPositions() {
            return this.logPositions;
        }

        public ObjectArrayList<BlockPos> getLeavesPositions() {
            return this.leavesPositions;
        }

        public ObjectArrayList<BlockPos> getRootPositions() {
            return this.rootPositions;
        }
    }
}
