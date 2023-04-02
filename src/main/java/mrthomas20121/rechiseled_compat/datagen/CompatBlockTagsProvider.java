package mrthomas20121.rechiseled_compat.datagen;

import mrthomas20121.rechiseled_compat.RechiseledCompat;
import mrthomas20121.rechiseled_compat.compat.Mod;
import mrthomas20121.rechiseled_compat.core.Core;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;


public class CompatBlockTagsProvider extends CompatForgeTagsProvider<Block> {

    public CompatBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, ForgeRegistries.BLOCKS, RechiseledCompat.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        for (Mod mod : Core.MOD_LIST) {
            mod.addTags(this);
        }
    }
}


