package mrthomas20121.rechiseled_compat.datagen;

import mrthomas20121.rechiseled_compat.RechiseledCompat;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;


public class CompatItemTagsProvider extends ItemTagsProvider implements ICompatTagsProvider<Item> {


    public CompatItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> future, TagsProvider<Block> blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, future, blockTagsProvider, RechiseledCompat.MOD_ID, existingFileHelper);
    }

    @Override
    public void addOptionalTag(TagKey<Item> tag, ResourceLocation location) {

    }

    @Override
    public void addTags(@NotNull HolderLookup.Provider provider) {
        ICompatTagsProvider.super.addTags(provider);
    }
}



