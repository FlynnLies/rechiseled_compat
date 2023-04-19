package mrthomas20121.rechiseled_compat.datagen;

import mrthomas20121.rechiseled_compat.RechiseledCompat;
import net.minecraft.Util;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.registries.VanillaRegistries;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = RechiseledCompat.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompatDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> future = CompletableFuture.supplyAsync(VanillaRegistries::createLookup, Util.backgroundExecutor());
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        CompatBlockTagsProvider blockTagsProvider   = new CompatBlockTagsProvider(output, future, existingFileHelper);
        CompatItemTagsProvider itemTagsProvider     = new CompatItemTagsProvider(output, future, blockTagsProvider, existingFileHelper);
        LootTableProvider lootProvider              = CompatLootProvider.create(output);

        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, itemTagsProvider);
        generator.addProvider(true, lootProvider);
    }
}
