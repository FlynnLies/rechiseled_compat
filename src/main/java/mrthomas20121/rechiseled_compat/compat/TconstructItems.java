package mrthomas20121.rechiseled_compat.compat;import mrthomas20121.rechiseled_compat.RechiseledCompat;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
public class TconstructItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(Item.class, RechiseledCompat.MOD_ID);

    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_BEAMS = ITEMS.register("tconstruct_greenheart_planks_beams", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_BEAMS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_BEAMS_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_beams_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_BEAMS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_BRICKS = ITEMS.register("tconstruct_greenheart_planks_bricks", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_BRICKS_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_bricks_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_CRATE = ITEMS.register("tconstruct_greenheart_planks_crate", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_CRATE.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_CRATE_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_crate_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_CRATE_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_DIAGONAL_STRIPES = ITEMS.register("tconstruct_greenheart_planks_diagonal_stripes", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_DIAGONAL_STRIPES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_DIAGONAL_STRIPES_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_diagonal_stripes_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_DIAGONAL_STRIPES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_DIAGONAL_TILES = ITEMS.register("tconstruct_greenheart_planks_diagonal_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_DIAGONAL_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_DIAGONAL_TILES_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_diagonal_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_DIAGONAL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_DOTTED = ITEMS.register("tconstruct_greenheart_planks_dotted", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_DOTTED.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_DOTTED_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_dotted_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_DOTTED_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_FLOORING = ITEMS.register("tconstruct_greenheart_planks_flooring", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_FLOORING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_FLOORING_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_flooring_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_FLOORING_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_LARGE_TILES = ITEMS.register("tconstruct_greenheart_planks_large_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_LARGE_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_LARGE_TILES_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_large_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_LARGE_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_PATTERN = ITEMS.register("tconstruct_greenheart_planks_pattern", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_PATTERN.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_PATTERN_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_pattern_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_PATTERN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_SMALL_BRICKS = ITEMS.register("tconstruct_greenheart_planks_small_bricks", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_SMALL_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_SMALL_BRICKS_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_small_bricks_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_SMALL_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_SMALL_TILES = ITEMS.register("tconstruct_greenheart_planks_small_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_SMALL_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_SMALL_TILES_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_small_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_SMALL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_SQUARES = ITEMS.register("tconstruct_greenheart_planks_squares", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_SQUARES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_SQUARES_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_squares_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_SQUARES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_TILES = ITEMS.register("tconstruct_greenheart_planks_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_TILES_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_WAVY = ITEMS.register("tconstruct_greenheart_planks_wavy", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_WAVY.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_WAVY_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_wavy_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_WAVY_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_WOVEN = ITEMS.register("tconstruct_greenheart_planks_woven", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_WOVEN.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_GREENHEART_PLANKS_WOVEN_CONNECTING = ITEMS.register("tconstruct_greenheart_planks_woven_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_GREENHEART_PLANKS_WOVEN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_BEAMS = ITEMS.register("tconstruct_skyroot_planks_beams", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_BEAMS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_BEAMS_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_beams_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_BEAMS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_BRICKS = ITEMS.register("tconstruct_skyroot_planks_bricks", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_BRICKS_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_bricks_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_CRATE = ITEMS.register("tconstruct_skyroot_planks_crate", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_CRATE.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_CRATE_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_crate_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_CRATE_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_DIAGONAL_STRIPES = ITEMS.register("tconstruct_skyroot_planks_diagonal_stripes", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_DIAGONAL_STRIPES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_DIAGONAL_STRIPES_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_diagonal_stripes_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_DIAGONAL_STRIPES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_DIAGONAL_TILES = ITEMS.register("tconstruct_skyroot_planks_diagonal_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_DIAGONAL_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_DIAGONAL_TILES_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_diagonal_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_DIAGONAL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_DOTTED = ITEMS.register("tconstruct_skyroot_planks_dotted", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_DOTTED.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_DOTTED_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_dotted_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_DOTTED_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_FLOORING = ITEMS.register("tconstruct_skyroot_planks_flooring", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_FLOORING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_FLOORING_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_flooring_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_FLOORING_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_LARGE_TILES = ITEMS.register("tconstruct_skyroot_planks_large_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_LARGE_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_LARGE_TILES_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_large_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_LARGE_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_PATTERN = ITEMS.register("tconstruct_skyroot_planks_pattern", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_PATTERN.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_PATTERN_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_pattern_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_PATTERN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_SMALL_BRICKS = ITEMS.register("tconstruct_skyroot_planks_small_bricks", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_SMALL_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_SMALL_BRICKS_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_small_bricks_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_SMALL_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_SMALL_TILES = ITEMS.register("tconstruct_skyroot_planks_small_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_SMALL_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_SMALL_TILES_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_small_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_SMALL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_SQUARES = ITEMS.register("tconstruct_skyroot_planks_squares", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_SQUARES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_SQUARES_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_squares_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_SQUARES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_TILES = ITEMS.register("tconstruct_skyroot_planks_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_TILES_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_WAVY = ITEMS.register("tconstruct_skyroot_planks_wavy", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_WAVY.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_WAVY_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_wavy_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_WAVY_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_WOVEN = ITEMS.register("tconstruct_skyroot_planks_woven", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_WOVEN.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_SKYROOT_PLANKS_WOVEN_CONNECTING = ITEMS.register("tconstruct_skyroot_planks_woven_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_SKYROOT_PLANKS_WOVEN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_BEAMS = ITEMS.register("tconstruct_bloodshroom_planks_beams", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_BEAMS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_BEAMS_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_beams_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_BEAMS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_BRICKS = ITEMS.register("tconstruct_bloodshroom_planks_bricks", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_BRICKS_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_bricks_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_CRATE = ITEMS.register("tconstruct_bloodshroom_planks_crate", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_CRATE.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_CRATE_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_crate_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_CRATE_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_DIAGONAL_STRIPES = ITEMS.register("tconstruct_bloodshroom_planks_diagonal_stripes", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_DIAGONAL_STRIPES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_DIAGONAL_STRIPES_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_diagonal_stripes_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_DIAGONAL_STRIPES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_DIAGONAL_TILES = ITEMS.register("tconstruct_bloodshroom_planks_diagonal_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_DIAGONAL_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_DIAGONAL_TILES_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_diagonal_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_DIAGONAL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_DOTTED = ITEMS.register("tconstruct_bloodshroom_planks_dotted", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_DOTTED.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_DOTTED_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_dotted_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_DOTTED_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_FLOORING = ITEMS.register("tconstruct_bloodshroom_planks_flooring", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_FLOORING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_FLOORING_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_flooring_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_FLOORING_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_LARGE_TILES = ITEMS.register("tconstruct_bloodshroom_planks_large_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_LARGE_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_LARGE_TILES_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_large_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_LARGE_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_PATTERN = ITEMS.register("tconstruct_bloodshroom_planks_pattern", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_PATTERN.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_PATTERN_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_pattern_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_PATTERN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_SMALL_BRICKS = ITEMS.register("tconstruct_bloodshroom_planks_small_bricks", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_SMALL_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_SMALL_BRICKS_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_small_bricks_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_SMALL_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_SMALL_TILES = ITEMS.register("tconstruct_bloodshroom_planks_small_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_SMALL_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_SMALL_TILES_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_small_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_SMALL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_SQUARES = ITEMS.register("tconstruct_bloodshroom_planks_squares", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_SQUARES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_SQUARES_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_squares_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_SQUARES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_TILES = ITEMS.register("tconstruct_bloodshroom_planks_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_TILES_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_WAVY = ITEMS.register("tconstruct_bloodshroom_planks_wavy", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_WAVY.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_WAVY_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_wavy_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_WAVY_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_WOVEN = ITEMS.register("tconstruct_bloodshroom_planks_woven", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_WOVEN.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_BLOODSHROOM_PLANKS_WOVEN_CONNECTING = ITEMS.register("tconstruct_bloodshroom_planks_woven_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_BLOODSHROOM_PLANKS_WOVEN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_BEAMS = ITEMS.register("tconstruct_nahuatl_beams", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_BEAMS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_BEAMS_CONNECTING = ITEMS.register("tconstruct_nahuatl_beams_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_BEAMS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_BRICKS = ITEMS.register("tconstruct_nahuatl_bricks", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_BRICKS_CONNECTING = ITEMS.register("tconstruct_nahuatl_bricks_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_CRATE = ITEMS.register("tconstruct_nahuatl_crate", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_CRATE.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_CRATE_CONNECTING = ITEMS.register("tconstruct_nahuatl_crate_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_CRATE_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_DIAGONAL_STRIPES = ITEMS.register("tconstruct_nahuatl_diagonal_stripes", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_DIAGONAL_STRIPES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_DIAGONAL_STRIPES_CONNECTING = ITEMS.register("tconstruct_nahuatl_diagonal_stripes_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_DIAGONAL_STRIPES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_DIAGONAL_TILES = ITEMS.register("tconstruct_nahuatl_diagonal_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_DIAGONAL_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_DIAGONAL_TILES_CONNECTING = ITEMS.register("tconstruct_nahuatl_diagonal_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_DIAGONAL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_DOTTED = ITEMS.register("tconstruct_nahuatl_dotted", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_DOTTED.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_DOTTED_CONNECTING = ITEMS.register("tconstruct_nahuatl_dotted_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_DOTTED_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_FLOORING = ITEMS.register("tconstruct_nahuatl_flooring", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_FLOORING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_FLOORING_CONNECTING = ITEMS.register("tconstruct_nahuatl_flooring_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_FLOORING_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_LARGE_TILES = ITEMS.register("tconstruct_nahuatl_large_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_LARGE_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_LARGE_TILES_CONNECTING = ITEMS.register("tconstruct_nahuatl_large_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_LARGE_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_PATTERN = ITEMS.register("tconstruct_nahuatl_pattern", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_PATTERN.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_PATTERN_CONNECTING = ITEMS.register("tconstruct_nahuatl_pattern_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_PATTERN_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_SMALL_BRICKS = ITEMS.register("tconstruct_nahuatl_small_bricks", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_SMALL_BRICKS.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_SMALL_BRICKS_CONNECTING = ITEMS.register("tconstruct_nahuatl_small_bricks_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_SMALL_BRICKS_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_SMALL_TILES = ITEMS.register("tconstruct_nahuatl_small_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_SMALL_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_SMALL_TILES_CONNECTING = ITEMS.register("tconstruct_nahuatl_small_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_SMALL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_SQUARES = ITEMS.register("tconstruct_nahuatl_squares", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_SQUARES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_SQUARES_CONNECTING = ITEMS.register("tconstruct_nahuatl_squares_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_SQUARES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_TILES = ITEMS.register("tconstruct_nahuatl_tiles", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_TILES.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_TILES_CONNECTING = ITEMS.register("tconstruct_nahuatl_tiles_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_TILES_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_WAVY = ITEMS.register("tconstruct_nahuatl_wavy", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_WAVY.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_WAVY_CONNECTING = ITEMS.register("tconstruct_nahuatl_wavy_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_WAVY_CONNECTING.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_WOVEN = ITEMS.register("tconstruct_nahuatl_woven", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_WOVEN.get(), getProperties()));
    public static RegistryObject<Item> TCONSTRUCT_NAHUATL_WOVEN_CONNECTING = ITEMS.register("tconstruct_nahuatl_woven_connecting", () -> new BlockItem(TconstructBlocks.TCONSTRUCT_NAHUATL_WOVEN_CONNECTING.get(), getProperties()));

    public static Item.Properties getProperties() {
        return new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS);
    }
}