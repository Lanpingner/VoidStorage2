package dev.Lanpingner.VoidStorage.world.ores;

import dev.Lanpingner.VoidStorage.VoidStorage;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class VSPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE_DEFERRED_REGISTER =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, VoidStorage.MODID);

    public static final RegistryObject<PlacedFeature> VOID_ORE_PLACEMENT = PLACED_FEATURE_DEFERRED_REGISTER.register("void_ore_placed"
            , () -> new PlacedFeature(VSConfigureFeatures.VOID_ORE.getHolder().get(),
                    commonOrePlacement(30,HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        System.out.println("Block placed asdasdsa aasdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" );
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

}
