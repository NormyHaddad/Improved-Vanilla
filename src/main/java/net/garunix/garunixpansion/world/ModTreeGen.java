package net.garunix.garunixpansion.world;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.garunix.garunixpansion.world.gen.treedecorator.PassionflowerTrunkDecorator;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import static net.garunix.garunixpansion.Garunixpansion.MOD_ID;

public class ModTreeGen {
    public static final TreeDecoratorType<PassionflowerTrunkDecorator> PASSIONFLOWER_TRUNK_DECORATOR = registerTreeDecorator("passionflower_trunk_decorator", PassionflowerTrunkDecorator.CODEC);

    private static <P extends TreeDecorator> TreeDecoratorType<P> registerTreeDecorator(String id, MapCodec<P> codec) {
        return (TreeDecoratorType) Registry.register(Registries.TREE_DECORATOR_TYPE,  Identifier.of(MOD_ID, id), new TreeDecoratorType(codec));
    }

    public static void init() {}
}
