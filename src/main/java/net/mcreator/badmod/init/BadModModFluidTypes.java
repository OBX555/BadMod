
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.badmod.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.badmod.fluid.types.PetroleumFluidType;
import net.mcreator.badmod.fluid.types.CruideOilFluidType;
import net.mcreator.badmod.fluid.types.BituminousBinderFluidType;
import net.mcreator.badmod.fluid.types.AsphaltCementFluidType;
import net.mcreator.badmod.BadModMod;

public class BadModModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, BadModMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> ASPHALT_CEMENT_TYPE = REGISTRY.register("asphalt_cement", () -> new AsphaltCementFluidType());
	public static final DeferredHolder<FluidType, FluidType> CRUIDE_OIL_TYPE = REGISTRY.register("cruide_oil", () -> new CruideOilFluidType());
	public static final DeferredHolder<FluidType, FluidType> PETROLEUM_TYPE = REGISTRY.register("petroleum", () -> new PetroleumFluidType());
	public static final DeferredHolder<FluidType, FluidType> BITUMINOUS_BINDER_TYPE = REGISTRY.register("bituminous_binder", () -> new BituminousBinderFluidType());
}
