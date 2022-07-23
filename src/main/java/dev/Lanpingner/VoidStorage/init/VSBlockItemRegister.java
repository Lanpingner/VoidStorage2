package dev.Lanpingner.VoidStorage.init;

import dev.Lanpingner.VoidStorage.VoidStorage;
import dev.Lanpingner.VoidStorage.abstracts.vsblockitem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockCollisions;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static dev.Lanpingner.VoidStorage.common.blocknames.*;

public class VSBlockItemRegister {
    public static final DeferredRegister<Item> OWNBLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VoidStorage.MODID);
    public static final RegistryObject<BlockItem> VSCONTROLLER_BLOCK_ITEM = OWNBLOCKITEMS.register(VSCONTROLLER_BLOCK_NAME
            ,() -> new vsblockitem(VSBlockRegister.VSCONTROLLER_BLOCK.get()));
    public static final RegistryObject<BlockItem> VSDISK_DRIVE_BLOCK_ITEM = OWNBLOCKITEMS.register(VSDISK_DRIVE_BLOCK_NAME
            ,() -> new vsblockitem(VSBlockRegister.VSDISK_DRIVE_BLOCK.get()));
    public static final RegistryObject<BlockItem> VS_VOIDORE_BLOCK_ITEM = OWNBLOCKITEMS.register(VSORE_VOID_ORE_NAME
            ,() -> new vsblockitem(VSBlockRegister.VS_VOIDORE_BLOCK.get()));
}
