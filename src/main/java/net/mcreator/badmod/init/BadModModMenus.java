
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.badmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.badmod.world.inventory.RefineryGUI1Menu;
import net.mcreator.badmod.BadModMod;

public class BadModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, BadModMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<RefineryGUI1Menu>> REFINERY_GUI_1 = REGISTRY.register("refinery_gui_1", () -> IMenuTypeExtension.create(RefineryGUI1Menu::new));
}
