package dev.Lanpingner.VoidStorage.abstracts;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class vsblock extends Block{

    public vsblock(Properties blcokbehavier) {

        super(Properties
                .of(Material.AMETHYST)
                .friction(0.5f));
    }
}
