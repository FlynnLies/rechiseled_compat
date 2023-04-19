package mrthomas20121.rechiseled_compat.datagen;

import mrthomas20121.rechiseled_compat.RechiseledCompat;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;


public class CompatBlockTagsProvider extends BlockTagsProvider implements ICompatTagsProvider<Block> {


    protected CompatBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, future, RechiseledCompat.MOD_ID, existingFileHelper);
    }

    @Override
    public void addOptionalTag(TagKey<Block> tag, ResourceLocation location) {
        this.tag(tag).addOptionalTag(location);
    }

    @Override
    public void addTags(@NotNull HolderLookup.Provider provider) {
        ICompatTagsProvider.super.addTags(provider);
    }
}


