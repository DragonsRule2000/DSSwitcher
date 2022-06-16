
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.dragonsmod.item.DimensionSwitcherItem;
import net.mcreator.dragonsmod.DragonsModMod;

public class DragonsModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DragonsModMod.MODID);
	public static final RegistryObject<Item> DIMENSION_SWITCHER = REGISTRY.register("dimension_switcher", () -> new DimensionSwitcherItem());
}
