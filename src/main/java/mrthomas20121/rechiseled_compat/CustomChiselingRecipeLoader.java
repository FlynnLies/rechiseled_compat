package mrthomas20121.rechiseled_compat;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.supermartijn642.rechiseled.chiseling.ChiselingRecipeLoader;
import net.minecraft.client.resources.JsonReloadListener;
import net.minecraft.profiler.IProfiler;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, modid = RechiseledCompat.MOD_ID)
public class CustomChiselingRecipeLoader extends ChiselingRecipeLoader {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onAddReloadListener(AddReloadListenerEvent e){
        e.addListener(new CustomChiselingRecipeLoader());
    }

    public CustomChiselingRecipeLoader(){
        super();
    }

    @Override
    protected void apply(@Nonnull Map<ResourceLocation, JsonElement> entries, @Nonnull IResourceManager resourceManager, @Nonnull IProfiler profilerFiller) {
        Map<ResourceLocation, JsonElement> copy = new HashMap<>();
        for(Map.Entry<ResourceLocation,JsonElement> entry : entries.entrySet()){
            JsonObject object = entry.getValue().getAsJsonObject();
            if(object.has("mod_id")) {
                if(ModList.get().isLoaded(object.get("mod_id").getAsString())) {
                    copy.put(entry.getKey(), entry.getValue());
                }
            }
            else {
                copy.put(entry.getKey(), entry.getValue());
            }
        }
        super.apply(copy, resourceManager, profilerFiller);
    }
}
