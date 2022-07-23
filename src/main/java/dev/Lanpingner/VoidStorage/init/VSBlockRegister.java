package dev.Lanpingner.VoidStorage.init;

import dev.Lanpingner.VoidStorage.VoidStorage;
import dev.Lanpingner.VoidStorage.blocks.vsControllerBlock;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import dev.Lanpingner.VoidStorage.abstracts.vsblock;

import static dev.Lanpingner.VoidStorage.common.blocknames.*;

public class VSBlockRegister {
	public static final DeferredRegister<Block> OWNBLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VoidStorage.MODID);

	public static final RegistryObject<Block> VSCONTROLLER_BLOCK = OWNBLOCKS.register(VSCONTROLLER_BLOCK_NAME,
			vsControllerBlock::new);
	public static final RegistryObject<Block> VSDISK_DRIVE_BLOCK = OWNBLOCKS.register(VSDISK_DRIVE_BLOCK_NAME,
			() -> new vsblock(null));

	public static final RegistryObject<Block> VS_VOIDORE_BLOCK = OWNBLOCKS.register(VSORE_VOID_ORE_NAME,() ->new vsblock(null));
}
