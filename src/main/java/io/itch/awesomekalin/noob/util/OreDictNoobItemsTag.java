
package io.itch.awesomekalin.noob.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.itch.awesomekalin.noob.block.BlockNoobWood;
import io.itch.awesomekalin.noob.block.BlockNoobLog;
import io.itch.awesomekalin.noob.ElementsNoobMod;

@ElementsNoobMod.ModElement.Tag
public class OreDictNoobItemsTag extends ElementsNoobMod.ModElement {
	public OreDictNoobItemsTag(ElementsNoobMod instance) {
		super(instance, 79);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("noob_log", new ItemStack(BlockNoobWood.block, (int) (1)));
		OreDictionary.registerOre("noob_log", new ItemStack(BlockNoobLog.block, (int) (1)));
	}
}
