package dev.Lanpingner.VoidStorage;

import dev.Lanpingner.VoidStorage.blocks.vsControllerBlock;
import dev.Lanpingner.VoidStorage.init.VSBlockItemRegister;
import dev.Lanpingner.VoidStorage.init.VSBlockRegister;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.fml.common.Mod;
@Mod(value = VoidStorage.MODID)
@Mod.EventBusSubscriber(modid = VoidStorage.MODID)
public class VoidStorage {
	public static final String MODID = "voidstorage";
    private static final Logger LOGGER = LogUtils.getLogger();
    public VoidStorage()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        VSBlockRegister.OWNBLOCKS.register(bus);
        VSBlockItemRegister.OWNBLOCKITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(vsControllerBlock.class);
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(VSBlockRegister.VSCONTROLLER_BLOCK.get());
        }
    };
}
