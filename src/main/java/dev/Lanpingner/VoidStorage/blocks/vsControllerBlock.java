package dev.Lanpingner.VoidStorage.blocks;

import dev.Lanpingner.VoidStorage.VoidStorage;
import dev.Lanpingner.VoidStorage.abstracts.vsblock;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraftforge.common.util.BlockSnapshot;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static net.minecraft.world.level.material.Material.*;

public class vsControllerBlock extends vsblock {
    public vsControllerBlock() {
        super(Properties
                .of(AMETHYST)
                .friction(0.5f));
    }
    @SubscribeEvent
    public static void onPlace(BlockEvent.EntityPlaceEvent event) {
        System.out.println("Placeesadasdd very good" + event.getPlacedBlock().getBlock().getName());
        event.setCanceled(true);
    }

}
