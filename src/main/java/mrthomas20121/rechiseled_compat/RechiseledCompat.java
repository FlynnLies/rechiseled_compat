package mrthomas20121.rechiseled_compat;

import mrthomas20121.rechiseled_compat.compat.*;
import mrthomas20121.rechiseled_compat.core.Core;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@net.minecraftforge.fml.common.Mod(RechiseledCompat.MOD_ID)
public class RechiseledCompat {

	/**
	 * Load all the mods even when their base mod is not installed.
	 * most likely you will want to use this when generating data via
	 * {@link net.minecraft.data.DataGenerator} but you can also use it
	 * to simply unlock all the blocks.
	 */
	private static final Boolean RUN_DATA = false;

	public static final String MOD_ID = "rechiseled_compat";
	public static final Logger LOGGER = LogManager.getLogger();


	public RechiseledCompat() {

		load(Mod.getInstance(ArsNouveau.class));
		load(Mod.getInstance(Atmospheric.class));
		load(Mod.getInstance(Atum.class));
		load(Mod.getInstance(BayouBlue.class));
		load(Mod.getInstance(Betterendforge.class));
		load(Mod.getInstance(Betternether.class));
		load(Mod.getInstance(Biomesoplenty.class));
		load(Mod.getInstance(BlueSkies.class));
		load(Mod.getInstance(Byg.class));
		load(Mod.getInstance(Druidcraft.class));
		load(Mod.getInstance(Endergetic.class));
		load(Mod.getInstance(Environmental.class));
		load(Mod.getInstance(Genericeco.class));
		load(Mod.getInstance(Naturesaura.class));
		load(Mod.getInstance(OuterEnd.class));

		// Quark does not have stained planks in 1.19 and that's all this adds
		// Also leads to some visual glitches in the chisel gui if you try to add them
		// anyway
		// Either way I feel this is just cluttering the blocks for no good reason
		// Can't craft them in survival after all
		if (RUN_DATA) {
			load(Mod.getInstance(Quark.class));
		}

		load(Mod.getInstance(Tconstruct.class));
		load(Mod.getInstance(Traverse.class));
		load(Mod.getInstance(Tropicraft.class));
		load(Mod.getInstance(Twilightforest.class));
		load(Mod.getInstance(Undergarden.class));

		Core.register(FMLJavaModLoadingContext.get().getModEventBus(), MinecraftForge.EVENT_BUS);
	}

	private static void load(Mod mod) {
		if (Core.isModLoaded(mod.getModId()) || RUN_DATA) {
			mod.registerBlocks();
		}
	}
}
