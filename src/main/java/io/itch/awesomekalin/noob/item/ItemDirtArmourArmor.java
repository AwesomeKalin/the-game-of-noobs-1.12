
package io.itch.awesomekalin.noob.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import io.itch.awesomekalin.noob.creativetab.TabNoobTab;
import io.itch.awesomekalin.noob.ElementsNoobMod;

@ElementsNoobMod.ModElement.Tag
public class ItemDirtArmourArmor extends ElementsNoobMod.ModElement {
	@GameRegistry.ObjectHolder("noob:dirt_armour_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("noob:dirt_armour_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("noob:dirt_armour_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("noob:dirt_armour_armorboots")
	public static final Item boots = null;
	public ItemDirtArmourArmor(ElementsNoobMod instance) {
		super(instance, 45);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DIRT_ARMOUR_ARMOR", "noob:dirtarmour", 2, new int[]{0, 1, 1, 0}, 1,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("dirt_armour_armorhelmet")
				.setRegistryName("dirt_armour_armorhelmet").setCreativeTab(TabNoobTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("dirt_armour_armorbody")
				.setRegistryName("dirt_armour_armorbody").setCreativeTab(TabNoobTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("dirt_armour_armorlegs")
				.setRegistryName("dirt_armour_armorlegs").setCreativeTab(TabNoobTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("dirt_armour_armorboots")
				.setRegistryName("dirt_armour_armorboots").setCreativeTab(TabNoobTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("noob:dirt_armour_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("noob:dirt_armour_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("noob:dirt_armour_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("noob:dirt_armour_armorboots", "inventory"));
	}
}
