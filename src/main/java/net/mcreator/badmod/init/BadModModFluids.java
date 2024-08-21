
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.badmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.badmod.fluid.PetroleumFluid;
import net.mcreator.badmod.fluid.CruideOilFluid;
import net.mcreator.badmod.fluid.AsphaltCementFluid;
import net.mcreator.badmod.BadModMod;

public class BadModModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, BadModMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> ASPHALT_CEMENT = REGISTRY.register("asphalt_cement", () -> new AsphaltCementFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ASPHALT_CEMENT = REGISTRY.register("flowing_asphalt_cement", () -> new AsphaltCementFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> CRUIDE_OIL = REGISTRY.register("cruide_oil", () -> new CruideOilFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_CRUIDE_OIL = REGISTRY.register("flowing_cruide_oil", () -> new CruideOilFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> PETROLEUM = REGISTRY.register("petroleum", () -> new PetroleumFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_PETROLEUM = REGISTRY.register("flowing_petroleum", () -> new PetroleumFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ASPHALT_CEMENT.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ASPHALT_CEMENT.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CRUIDE_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CRUIDE_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(PETROLEUM.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PETROLEUM.get(), RenderType.translucent());
		}
	}
}
