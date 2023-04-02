package mrthomas20121.rechiseled_compat.datagen;

import mrthomas20121.rechiseled_compat.RechiseledCompat;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RechiseledCompat.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompatDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        System.out.println("Gathering data for " + RechiseledCompat.MOD_ID);

        generator.addProvider(true, new CompatBlockTagsProvider(generator, existingFileHelper));
        generator.addProvider(true, new CompatItemTagsProvider(generator, existingFileHelper));
        generator.addProvider(true, new CompatLootProvider(generator));
    }
}
