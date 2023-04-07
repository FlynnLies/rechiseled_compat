package mrthomas20121.rechiseled_compat.compat;

import mrthomas20121.rechiseled_compat.core.Core;
import mrthomas20121.rechiseled_compat.datagen.CompatForgeTagsProvider;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public abstract class Mod {

    private static final Map<Class<? extends Mod>, Mod> instances = new HashMap<>();

    protected Mod() {
    } // needs to be protected to be able to be used in the constructor of subclasses

    /**
     * Get a singleton instance of this mod.
     * This also registers this mod in {Core.MOD_LIST}
     *
     * @param tClass Class of the mod.
     * @return Instance of the mod.
     */
    public static <T extends Mod> T getInstance(Class<T> tClass) {
        return tClass.cast(instances.computeIfAbsent(tClass, key -> {
            try {
                Constructor<T> constructor = tClass.getDeclaredConstructor();
                constructor.setAccessible(true);
                T instance = constructor.newInstance();

                Core.addMod(instance); // add the mod to a list in Core
                return instance;
            } catch (IllegalAccessException | InvocationTargetException | InstantiationException |
                     NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }));
    }

    public abstract String getModId();

    public abstract void registerBlocks();

    public abstract <T extends IForgeRegistryEntry<T>> void addTags(CompatForgeTagsProvider<T> provider);

}
