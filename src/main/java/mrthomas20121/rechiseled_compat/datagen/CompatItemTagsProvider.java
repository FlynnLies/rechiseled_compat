package mrthomas20121.rechiseled_compat.datagen;

import mrthomas20121.rechiseled_compat.RechiseledCompat;
import mrthomas20121.rechiseled_compat.compat.Mod;
import mrthomas20121.rechiseled_compat.compat.Quark;
import mrthomas20121.rechiseled_compat.core.Core;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;


public class CompatItemTagsProvider extends CompatForgeTagsProvider<Item> {

    public CompatItemTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, ForgeRegistries.ITEMS, RechiseledCompat.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        for (Mod mod : Core.MOD_LIST) {
            mod.addTags(this);
        }
    }


}



