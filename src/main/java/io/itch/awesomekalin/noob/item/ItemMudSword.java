
package io.itch.awesomekalin.noob.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

import io.itch.awesomekalin.noob.procedure.ProcedureMudAxeOnPlayerStoppedUsing;
import io.itch.awesomekalin.noob.procedure.ProcedureMudAxeMobIsHitWithTool;
import io.itch.awesomekalin.noob.creativetab.TabNoobTab;
import io.itch.awesomekalin.noob.ElementsTheGameofNoobs;

import com.google.common.collect.Multimap;

@ElementsTheGameofNoobs.ModElement.Tag
public class ItemMudSword extends ElementsTheGameofNoobs.ModElement {
	@GameRegistry.ObjectHolder("noob:mudsword")
	public static final Item block = null;
	public ItemMudSword(ElementsTheGameofNoobs instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSword(EnumHelper.addToolMaterial("MUDSWORD", 1, 10, 1f, -3.8f, 1)) {
			@Override
			public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot slot) {
				Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(slot);
				if (slot == EntityEquipmentSlot.MAINHAND) {
					multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
							new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double) this.getAttackDamage(), 0));
					multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(),
							new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -3, 0));
				}
				return multimap;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("sword", 1);
				return ret.keySet();
			}

			@Override
			public boolean hitEntity(ItemStack itemstack, EntityLivingBase entity, EntityLivingBase entity2) {
				super.hitEntity(itemstack, entity, entity2);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				World world = entity.world;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ProcedureMudAxeMobIsHitWithTool.executeProcedure($_dependencies);
				}
				return true;
			}

			@Override
			public void onPlayerStoppedUsing(ItemStack itemstack, World world, EntityLivingBase entity, int time) {
				super.onPlayerStoppedUsing(itemstack, world, entity, time);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("world", world);
					ProcedureMudAxeOnPlayerStoppedUsing.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("mudsword").setRegistryName("mudsword").setCreativeTab(TabNoobTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("noob:mudsword", "inventory"));
	}
}
