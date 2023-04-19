package mrthomas20121.rechiseled_compat.datagen;

import com.mojang.datafixers.util.Pair;
import mrthomas20121.rechiseled_compat.RechiseledCompat;
import mrthomas20121.rechiseled_compat.compat.Mod;
import mrthomas20121.rechiseled_compat.core.Core;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;
import org.openjdk.nashorn.internal.ir.Block;

import java.lang.reflect.ParameterizedType;

public interface ICompatTagsProvider<T>  {

    void addOptionalTag(TagKey<T> tag, ResourceLocation location);

    default Class<T> getType() {
        // Return the type parameter of the class
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    default void addTags(HolderLookup.@NotNull Provider provider) {
        for (Mod mod : Core.MOD_LIST) {
            mod.getBlockTags().forEach(this::addTagsPair);
            mod.getItemTags().forEach(this::addTagsPair);
        }
    }

    private void addTagsPair(Pair<String[] ,String[]> pair){
        String[] tags = pair.getFirst();
        String[] values = pair.getSecond();

        for (String tagName : tags) {
            TagKey<T> key;
            ResourceLocation location = new ResourceLocation(tagName);

            Class<?> type = this.getType();
            if (type == Item.class){
                key = (TagKey<T>) ItemTags.create(location);

            } else if (type == Block.class) {
                key = (TagKey<T>) BlockTags.create(location);

            } else {
                System.out.println("Cannot add tags for type " + type.toString());
                return;
            }

            for (String id : values) {
                this.addOptionalTag(  key, new ResourceLocation(RechiseledCompat.MOD_ID, id));
            }
        }
    }
}
