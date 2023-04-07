package mrthomas20121.rechiseled_compat.event;

import mrthomas20121.rechiseled_compat.RechiseledCompat;
import mrthomas20121.rechiseled_compat.loot.CompatBlockLootModifier;
import mrthomas20121.rechiseled_compat.loot.NamespaceCondition;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = RechiseledCompat.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        Registry.register(Registry.LOOT_CONDITION_TYPE, new ResourceLocation(RechiseledCompat.MOD_ID,NamespaceCondition.CONDITION_ID), NamespaceCondition.LOOT_CONDITION_TYPE);

        event.getRegistry().register(
                new CompatBlockLootModifier.Serializer().setRegistryName(new ResourceLocation(RechiseledCompat.MOD_ID,"add_item"))
        );
    }
}
