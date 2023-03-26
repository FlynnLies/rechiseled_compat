package mrthomas20121.rechiseled_compat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.supermartijn642.rechiseled.chiseling.ChiselingRecipe;
import com.supermartijn642.rechiseled.chiseling.ChiselingRecipeLoader;
import com.supermartijn642.rechiseled.chiseling.ChiselingRecipes;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import org.apache.commons.lang3.reflect.FieldUtils;

import javax.annotation.Nonnull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, modid = RechiseledCompat.MOD_ID)
public class CustomChiselingRecipeLoader extends SimpleJsonResourceReloadListener {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onAddReloadListener(AddReloadListenerEvent e){
        e.addListener(new CustomChiselingRecipeLoader());
    }

    private static final Gson GSON = new GsonBuilder().setLenient().create();

    public CustomChiselingRecipeLoader(){
        super(GSON, "custom_chiseling_recipes");
    }

    @Override
    protected void apply(@Nonnull Map<ResourceLocation, JsonElement> entries, @Nonnull ResourceManager resourceManager, @Nonnull ProfilerFiller profilerFiller) {
        List<ChiselingRecipe> recipes = new ArrayList<>();
        for(Map.Entry<ResourceLocation,JsonElement> entry : entries.entrySet()){
            JsonObject object = entry.getValue().getAsJsonObject();
            if(object.has("mod_id")) {
                if(ModList.get().isLoaded(object.get("mod_id").getAsString())) {
                    recipes.add(ChiselingRecipe.Serializer.fromJson(entry.getKey(), object));
                }
            }
        }
        recipes.addAll(ChiselingRecipes.getAllRecipes());
        try {
            Method method = ChiselingRecipes.class.getDeclaredMethod("setRecipes", List.class);
            method.setAccessible(true);
            method.invoke(ChiselingRecipe.class, recipes);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            RechiseledCompat.LOGGER.error(e);
        }
    }
}
