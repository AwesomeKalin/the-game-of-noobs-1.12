
package io.itch.awesomekalin.noob.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import io.itch.awesomekalin.noob.block.BlockNoobChest;
import io.itch.awesomekalin.noob.ElementsTheGameofNoobs;

@ElementsTheGameofNoobs.ModElement.Tag
public class TabNoobTab extends ElementsTheGameofNoobs.ModElement {
	public TabNoobTab(ElementsTheGameofNoobs instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabnoobtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockNoobChest.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
