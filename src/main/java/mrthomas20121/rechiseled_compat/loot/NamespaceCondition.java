package mrthomas20121.rechiseled_compat.loot;


import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import mrthomas20121.rechiseled_compat.RechiseledCompat;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import net.minecraftforge.registries.RegisterEvent;

/*
 {
      "condition": "forge:loot_table_id",
      "loot_table_id": "rechiseled_compat:blocks/quark_yellow_stained_planks_woven_connecting"
    }

*/

public class NamespaceCondition implements LootItemCondition {

    public static final String CONDITION_ID = "loot_table_namespace";
    private static final LootItemConditionType LOOT_TABLE_NAMESPACE = new LootItemConditionType(new NamespaceCondition.Serializer());


    private final String namespace;

    private NamespaceCondition(String namespace) {
        this.namespace = namespace;
    }

    public static Builder builder(final String namespace) {
        return new Builder(namespace);
    }

    public static void register(RegisterEvent event) {
        if (!event.getRegistryKey().equals(Registry.LOOT_ITEM_REGISTRY))
            return;

        event.register(Registry.LOOT_ITEM_REGISTRY, new ResourceLocation(RechiseledCompat.MOD_ID, CONDITION_ID), () -> NamespaceCondition.LOOT_TABLE_NAMESPACE);
    }

    @Override
    public LootItemConditionType getType() {
        return LOOT_TABLE_NAMESPACE;
    }

    @Override
    public boolean test(LootContext context) {
        return context.getQueriedLootTableId().getNamespace().equals(namespace);
    }

    public static class Builder implements LootItemCondition.Builder {
        private final String namespace;

        public Builder(String namespace) {
            if (namespace == null) throw new IllegalArgumentException("Target namespace must not be null");
            this.namespace = namespace;
        }

        @Override
        public NamespaceCondition build() {
            return new NamespaceCondition(this.namespace);
        }

    }

    public static class Serializer implements net.minecraft.world.level.storage.loot.Serializer<NamespaceCondition> {
        @Override
        public void serialize(JsonObject object, NamespaceCondition instance, JsonSerializationContext ctx) {
            object.addProperty(CONDITION_ID, instance.namespace);
        }

        @Override
        public NamespaceCondition deserialize(JsonObject object, JsonDeserializationContext ctx) {

            return new NamespaceCondition(GsonHelper.getAsString(object, CONDITION_ID));
        }
    }
}
