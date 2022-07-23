package dev.Lanpingner.VoidStorage.abstracts;

import dev.Lanpingner.VoidStorage.VoidStorage;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
public class vsblockitem extends BlockItem {
    public static Properties BlockItemProperties = null;
    public vsblockitem(Block ABlock) {
        super(ABlock, new Item.Properties().tab(VoidStorage.TAB));
    }
}
