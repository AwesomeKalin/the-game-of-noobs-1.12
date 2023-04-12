
package io.itch.awesomekalin.noob.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockFence;
import net.minecraft.block.Block;

import io.itch.awesomekalin.noob.creativetab.TabNoobTab;
import io.itch.awesomekalin.noob.ElementsNoobMod;

@ElementsNoobMod.ModElement.Tag
public class BlockNoobFence extends ElementsNoobMod.ModElement {
	@GameRegistry.ObjectHolder("noob:noob_fence")
	public static final Block block = null;
	public BlockNoobFence(ElementsNoobMod instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("noob_fence"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("noob:noob_fence", "inventory"));
	}
	public static class BlockCustom extends BlockFence {
		public BlockCustom() {
			super(Material.WOOD, Material.WOOD.getMaterialMapColor());
			setUnlocalizedName("noob_fence");
			setSoundType(SoundType.WOOD);
			setHardness(1F);
			setResistance(1.5F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabNoobTab.tab);
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 3;
		}
	}
}
