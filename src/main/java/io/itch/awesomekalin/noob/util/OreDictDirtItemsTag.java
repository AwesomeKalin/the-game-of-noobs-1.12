
package io.itch.awesomekalin.noob.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.itch.awesomekalin.noob.block.BlockDirtWood;
import io.itch.awesomekalin.noob.block.BlockDirtLog;
import io.itch.awesomekalin.noob.ElementsNoobMod;

@ElementsNoobMod.ModElement.Tag
public class OreDictDirtItemsTag extends ElementsNoobMod.ModElement {
	public OreDictDirtItemsTag(ElementsNoobMod instance) {
		super(instance, 63);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("dirt_log", new ItemStack(BlockDirtWood.block, (int) (1)));
		OreDictionary.registerOre("dirt_log", new ItemStack(BlockDirtLog.block, (int) (1)));
	}
}
