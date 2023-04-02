package mrthomas20121.rechiseled_compat.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.tags.TagKey;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeRegistryTagsProvider;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.util.TriConsumer;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.ParameterizedType;

public class CompatForgeTagsProvider<T> extends ForgeRegistryTagsProvider<T> {

    public CompatForgeTagsProvider(DataGenerator generator, IForgeRegistry<T> forgeRegistry, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, forgeRegistry, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
    }

    public void addTag(TagKey<T> tag, T value) {
        this.tag(tag).add(value);
    }

    public Class<T> getType() {
        // Return the type parameter of the class
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @SuppressWarnings("unchecked")
    public <T> void whenType(Class<T> type, TriConsumer<CompatForgeTagsProvider<T>, String[], String[]> consumer, String[] blocks, String[] tags) {
        if (type.isAssignableFrom(getType())) {
            consumer.accept((CompatForgeTagsProvider<T>) this, blocks, tags);
        }
        // ...and so on for other classes that you want to support
    }
}
