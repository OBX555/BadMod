package net.mcreator.badmod.init;

import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.bus.api.SubscribeEvent;

import net.mcreator.badmod.configuration.ServerConfigConfiguration;
import net.mcreator.badmod.configuration.ClientConfigConfiguration;
import net.mcreator.badmod.BadModMod;

@EventBusSubscriber(modid = BadModMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class BadModModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ClientConfigConfiguration.SPEC, "grimm\\badmod\\client.toml");
			ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ServerConfigConfiguration.SPEC, "grimm\\badmod\\server.toml");
		});
	}
}
