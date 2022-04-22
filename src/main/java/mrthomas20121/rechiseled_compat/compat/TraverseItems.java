package mrthomas20121.rechiseled_compat.compat;import mrthomas20121.rechiseled_compat.RechiseledCompat;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
public class TraverseItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(Item.class, RechiseledCompat.MOD_ID);

    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_BEAMS = ITEMS.register("traverse_fir_planks_beams", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_BEAMS.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_BEAMS_CONNECTING = ITEMS.register("traverse_fir_planks_beams_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_BEAMS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_BRICKS = ITEMS.register("traverse_fir_planks_bricks", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_BRICKS_CONNECTING = ITEMS.register("traverse_fir_planks_bricks_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_CRATE = ITEMS.register("traverse_fir_planks_crate", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_CRATE.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_CRATE_CONNECTING = ITEMS.register("traverse_fir_planks_crate_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_CRATE_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_DIAGONAL_STRIPES = ITEMS.register("traverse_fir_planks_diagonal_stripes", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_DIAGONAL_STRIPES.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_DIAGONAL_STRIPES_CONNECTING = ITEMS.register("traverse_fir_planks_diagonal_stripes_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_DIAGONAL_STRIPES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_DIAGONAL_TILES = ITEMS.register("traverse_fir_planks_diagonal_tiles", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_DIAGONAL_TILES.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_DIAGONAL_TILES_CONNECTING = ITEMS.register("traverse_fir_planks_diagonal_tiles_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_DIAGONAL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_DOTTED = ITEMS.register("traverse_fir_planks_dotted", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_DOTTED.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_DOTTED_CONNECTING = ITEMS.register("traverse_fir_planks_dotted_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_DOTTED_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_FLOORING = ITEMS.register("traverse_fir_planks_flooring", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_FLOORING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_FLOORING_CONNECTING = ITEMS.register("traverse_fir_planks_flooring_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_FLOORING_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_LARGE_TILES = ITEMS.register("traverse_fir_planks_large_tiles", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_LARGE_TILES.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_LARGE_TILES_CONNECTING = ITEMS.register("traverse_fir_planks_large_tiles_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_LARGE_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_PATTERN = ITEMS.register("traverse_fir_planks_pattern", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_PATTERN.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_PATTERN_CONNECTING = ITEMS.register("traverse_fir_planks_pattern_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_PATTERN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_SMALL_BRICKS = ITEMS.register("traverse_fir_planks_small_bricks", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_SMALL_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_SMALL_BRICKS_CONNECTING = ITEMS.register("traverse_fir_planks_small_bricks_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_SMALL_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_SMALL_TILES = ITEMS.register("traverse_fir_planks_small_tiles", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_SMALL_TILES.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_SMALL_TILES_CONNECTING = ITEMS.register("traverse_fir_planks_small_tiles_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_SMALL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_SQUARES = ITEMS.register("traverse_fir_planks_squares", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_SQUARES.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_SQUARES_CONNECTING = ITEMS.register("traverse_fir_planks_squares_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_SQUARES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_TILES = ITEMS.register("traverse_fir_planks_tiles", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_TILES.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_TILES_CONNECTING = ITEMS.register("traverse_fir_planks_tiles_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_WAVY = ITEMS.register("traverse_fir_planks_wavy", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_WAVY.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_WAVY_CONNECTING = ITEMS.register("traverse_fir_planks_wavy_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_WAVY_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_WOVEN = ITEMS.register("traverse_fir_planks_woven", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_WOVEN.get(), getProperties()));
    public static RegistryObject<Item> TRAVERSE_FIR_PLANKS_WOVEN_CONNECTING = ITEMS.register("traverse_fir_planks_woven_connecting", () -> new BlockItem(TraverseBlocks.TRAVERSE_FIR_PLANKS_WOVEN_CONNECTING.get(), getProperties()));

    public static Item.Properties getProperties() {
        return new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS);
    }
}