package mrthomas20121.rechiseled_compat;

import mrthomas20121.rechiseled_compat.compat.*;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(RechiseledCompat.MOD_ID)
public class RechiseledCompat {

	public static final String MOD_ID = "rechiseled_compat";
	public static final Logger LOGGER = LogManager.getLogger();

	public RechiseledCompat() {
		if(ModList.get().isLoaded("atmospheric")) {
			AtmosphericBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			AtmosphericItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("atum")) {
			AtumBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			AtumItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("bayou_blues")) {
			BayouBluesBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			BayouBluesItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("betterendforge")) {
			BetterendforgeBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			BetterendforgeItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("betternether")) {
			BetternetherBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			BetternetherItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("biomesoplenty")) {
			BiomesoplentyBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			BiomesoplentyItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("blue_skies")) {
			BlueSkiesBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			BlueSkiesItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("byg")) {
			BygBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			BygItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("druidcraft")) {
			DruidcraftBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			DruidcraftItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("endergetic")) {
			EndergeticBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			EndergeticItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("environmental")) {
			EnvironmentalBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			EnvironmentalItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("genericeco")) {
			GenericecoBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			GenericecoItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("outer_end")) {
			OuterEndBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			OuterEndItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("quark")) {
			QuarkBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			QuarkItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("traverse")) {
			TraverseBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			TraverseItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("tropicraft")) {
			TropicraftBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			TropicraftItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("twilightforest")) {
			TwilightforestBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			TwilightforestItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		if(ModList.get().isLoaded("undergarden")) {
			UndergardenBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
			UndergardenItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
	}
}
