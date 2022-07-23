package dev.Lanpingner.VoidStorage.world.ores;

import com.google.common.base.Suppliers;
import dev.Lanpingner.VoidStorage.VoidStorage;
import dev.Lanpingner.VoidStorage.common.blocknames;
import dev.Lanpingner.VoidStorage.init.VSBlockRegister;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.NewRegistryEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

import static net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration.*;

public class VSConfigureFeatures {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURE_DEFFERED_REGISTER =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, VoidStorage.MODID);

    //Void Ore
    //Ore Suppliers
    public static final Supplier<List<TargetBlockState>> OVERWORLD_VOID_ORES;

    static {
        OVERWORLD_VOID_ORES = Suppliers.memoize(() -> List.of(
                target(OreFeatures.STONE_ORE_REPLACEABLES, VSBlockRegister.VS_VOIDORE_BLOCK.get().defaultBlockState())
        ));
    }

    //Registering ores
    public static final RegistryObject<ConfiguredFeature<?,?>> VOID_ORE = CONFIGURED_FEATURE_DEFFERED_REGISTER.register(blocknames.VSORE_VOID_ORE_NAME,
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_VOID_ORES.get(),30)));
}
