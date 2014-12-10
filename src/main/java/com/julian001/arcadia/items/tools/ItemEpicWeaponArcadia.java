package com.julian001.arcadia.items.tools;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.items.ItemsArcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEpicWeaponArcadia extends ItemSword {

	private static float weaponDamage = 10;
	public static ToolMaterial toolEPIC = EnumHelper.addToolMaterial("Epic", 3, 100, 20F, weaponDamage, 25);
    public float efficiencyOnProperMaterial;
	//private static float weaponDamage;
	private float critDamage;
	public ItemEpicWeaponArcadia(String name, ToolMaterial material) {
		super(material);
		setCreativeTab(arcadia.tabArcadiaItems);
		setUnlocalizedName(References.ID + "_" + name);
		setTextureName(References.ID + ":" + name);
		GameRegistry.registerItem(this, name);
		this.weaponDamage = 40 + material.getDamageVsEntity();
		this.critDamage = 100;
		this.efficiencyOnProperMaterial = material.getEfficiencyOnProperMaterial();
		MinecraftForge.EVENT_BUS.register(this);
		
	}
		
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase entity, EntityLivingBase par3EntityLiving) {
		if(par1ItemStack.getItem() == ItemsArcadia.epicWeaponRuby) {
			World world = entity.worldObj;
			if (!world.isRemote) {
				Random rand = entity.worldObj.rand;
				if (rand.nextFloat() < 1) {
					float var7 = (float) MathHelper.floor_double(entity.boundingBox.minY);
					for (int var3 = 0; (float) var3 < 1.0F + entity.width * 20.0F; ++var3) {
						float var8 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
						float var5 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
						for (int i = -1; i < 2; i++) {
							if (i != 0)
								((WorldServer) entity.worldObj).func_147487_a("lava", entity.posX + (double) var8, (double) (var7 + 1.0F), entity.posZ + (double) var5, 1, 0F, (float) i, 0F, 0);
							else
								((WorldServer) entity.worldObj).func_147487_a("lava", entity.posX + (double) var8, (double) (var7 + 1.0F), entity.posZ + (double) var5, 1, -0.7F, 0.3F, 1.0F, 0);
						}
					}
				}
			}
			entity.setFire(5 * 20);
		}
		
		if(par1ItemStack.getItem() == ItemsArcadia.epicWeaponSapphire) {
			Random rand = entity.worldObj.rand;
			if (rand.nextFloat() <= 0.25) {
				float var7 = (float) MathHelper.floor_double(entity.boundingBox.minY);
				for (int var3 = 0; (float) var3 < 1.0F + entity.width * 20.0F; ++var3) {
					float var8 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
					float var5 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
					for (int i = -1; i < 2; i++) {
						if (i != 0)
							((WorldServer) entity.worldObj).func_147487_a("magicCrit", entity.posX
									+ (double) var8, (double) (var7 + 1.0F),
									entity.posZ + (double) var5, 1, 0F, (float) i, 0F, 0);
						else
							((WorldServer) entity.worldObj).func_147487_a("magicCrit", entity.posX
									+ (double) var8, (double) (var7 + 1.0F),
									entity.posZ + (double) var5, 1, -0.7F, 0.3F, 1.0F, 0);
					}
				}
				return true;
			}
			if (rand.nextFloat() > 0.25) {
				float var7 = (float) MathHelper
						.floor_double(entity.boundingBox.minY);

				for (int var3 = 0; (float) var3 < 1.0F + entity.width * 20.0F; ++var3) {
					float var8 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
					float var5 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
					for (int i = -1; i < 2; i++) {
						if (i != 0)
							((WorldServer) entity.worldObj).func_147487_a("dripWater", entity.posX
									+ (double) var8, (double) (var7 + 1.0F),
									entity.posZ + (double) var5, 1, 0F, (float) i, 0F, 0);
						if (i != 1)
							((WorldServer) entity.worldObj).func_147487_a("bubble", entity.posX
									- entity.motionX * (double) var7, entity.posY
									- entity.motionY * (double) var7, entity.posZ
									- entity.motionZ * (double) var7,
									1, entity.motionX, entity.motionY, entity.motionZ, 0);
						else
							((WorldServer) entity.worldObj).func_147487_a("reddust", entity.posX
									+ (double) var8, (double) (var7 + 1.0F),
									entity.posZ + (double) var5, 1, -0.7F, 0.3F, 1.0F, 0);
					}
				}
				return true;
			}
			return true;
		
		}
		if(par1ItemStack.getItem() == ItemsArcadia.epicWeaponLifeDrain) {
			World world = entity.worldObj;
			if (!world.isRemote) {
				Random rand = entity.worldObj.rand;
				if (rand.nextFloat() < 1) {
					float var7 = (float) MathHelper.floor_double(entity.boundingBox.minY);
					for (int var3 = 0; (float) var3 < 1.0F + entity.width * 20.0F; ++var3) {
						float var8 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
						float var5 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
						for (int i = -1; i < 2; i++) {
							if (i != 0)
								((WorldServer) entity.worldObj).func_147487_a("portal", entity.posX + (double) var8, (double) (var7 + 1.0F), entity.posZ + (double) var5, 5, 0F, (float) i, 0F, 0.3);
							else
								((WorldServer) entity.worldObj).func_147487_a("witchMagic", entity.posX + (double) var8, (double) (var7 + 1.0F), entity.posZ + (double) var5, 5, -0.7F, 0.3F, 1.0F, 0);
						}
					}
				}
			}
			//float dmg = getDamageVsEntity(par3EntityLiving);
			float dmg1 = (1 + ItemsArcadia.toolSHADOWSTEEL.getDamageVsEntity()) /2;
			System.out.println(dmg1);
			par3EntityLiving.heal(dmg1);
		}
		if(par1ItemStack.getItem() == ItemsArcadia.epicWeaponShadowSteel) {
			World world = entity.worldObj;
			if (!world.isRemote) {
				Random rand = entity.worldObj.rand;
				if (rand.nextFloat() < 1) {
					float var7 = (float) MathHelper.floor_double(entity.boundingBox.minY);
					for (int var3 = 0; (float) var3 < 1.0F + entity.width * 20.0F; ++var3) {
						float var8 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
						float var5 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
						for (int i = -1; i < 2; i++) {
							if (i != 0)
								((WorldServer) entity.worldObj).func_147487_a("smoke", entity.posX + (double) var8, (double) (var7 + 1.0F), entity.posZ + (double) var5, 3, 0F, (float) i, 0F, 0);
							else
								((WorldServer) entity.worldObj).func_147487_a("witchMagic", entity.posX + (double) var8, (double) (var7 + 1.0F), entity.posZ + (double) var5, 1, -0.7F, 0.3F, 1.0F, 0);
						}
					}
				}
			}
			entity.addPotionEffect(new PotionEffect(Potion.wither.id, 4 * 20, 1));
		}
		System.out.println(weaponDamage);
		par1ItemStack.damageItem(1, par3EntityLiving);
		return true;
	}
	
	
//	public float getDamageVsEntity(Entity entity) {
//		Random rand = entity.worldObj.rand;
//		if (rand.nextFloat() <= 0.25) {
//			float var7 = (float) MathHelper.floor_double(entity.boundingBox.minY);
//			for (int var3 = 0; (float) var3 < 1.0F + entity.width * 20.0F; ++var3) {
//				float var8 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
//				float var5 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
//				for (int i = -1; i < 2; i++) {
//					if (i != 0)
//						((WorldServer) entity.worldObj).func_147487_a("magicCrit", entity.posX
//								+ (double) var8, (double) (var7 + 1.0F),
//								entity.posZ + (double) var5, 1, 0F, (float) i, 0F, 0);
//					else
//						((WorldServer) entity.worldObj).func_147487_a("magicCrit", entity.posX
//								+ (double) var8, (double) (var7 + 1.0F),
//								entity.posZ + (double) var5, 1, -0.7F, 0.3F, 1.0F, 0);
//				}
//			}
//			return critDamage;
//		}
//		if (rand.nextFloat() > 0.25) {
//			float var7 = (float) MathHelper
//					.floor_double(entity.boundingBox.minY);
//
//			for (int var3 = 0; (float) var3 < 1.0F + entity.width * 20.0F; ++var3) {
//				float var8 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
//				float var5 = (rand.nextFloat() * 2.0F - 1.0F) * entity.width;
//				for (int i = -1; i < 2; i++) {
//					if (i != 0)
//						((WorldServer) entity.worldObj).func_147487_a("dripWater", entity.posX
//								+ (double) var8, (double) (var7 + 1.0F),
//								entity.posZ + (double) var5, 1, 0F, (float) i, 0F, 0);
//					if (i != 1)
//						((WorldServer) entity.worldObj).func_147487_a("bubble", entity.posX
//								- entity.motionX * (double) var7, entity.posY
//								- entity.motionY * (double) var7, entity.posZ
//								- entity.motionZ * (double) var7,
//								1, entity.motionX, entity.motionY, entity.motionZ, 0);
//					else
//						((WorldServer) entity.worldObj).func_147487_a("reddust", entity.posX
//								+ (double) var8, (double) (var7 + 1.0F),
//								entity.posZ + (double) var5, 1, -0.7F, 0.3F, 1.0F, 0);
//				}
//			}
//			return weaponDamage;
//		}
//		return weaponDamage;
//	}
//	
	@SubscribeEvent
	public void onBlockDrops(HarvestDropsEvent event) {
		if(event.harvester != null && event.block != null && event.drops.isEmpty() && event.harvester.getCurrentEquippedItem() != null && event.harvester.getCurrentEquippedItem().getItem() == ItemsArcadia.epicWeaponSapphire && event.block.canSilkHarvest(event.world, event.harvester, event.x, event.y, event.z, event.blockMetadata))
			if(event.block.getMaterial() == Material.ice || event.block.getMaterial() == Material.packedIce)
				event.drops.add(new ItemStack(event.block, 1, event.blockMetadata));
	}
	
	public float func_150893_a(ItemStack itemStack, Block block) {
		Material material = block.getMaterial();
		if(block == Blocks.web)
            return 15.0F;
		if(itemStack.getItem() == ItemsArcadia.epicWeaponSapphire)
			return material != Material.wood && material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd && material != Material.ice && material != Material.packedIce ? 1.0F : this.efficiencyOnProperMaterial;
        else
            return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : 1.5F;
		//return material != Material.wood && material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : this.efficiencyOnProperMaterial;
    }
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack) {
        return true;
    }
	
    public EnumRarity getRarity(ItemStack itemStack) {
        return EnumRarity.epic;
    }
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
		if(itemStack.getItem() == ItemsArcadia.epicWeaponRuby)
			list.add("Sets on Fire for 5 Seconds");
		if(itemStack.getItem() == ItemsArcadia.epicWeaponSapphire) {
			list.add("20% Critical Strike Chance");
			list.add("Can mine Ice");
		}
		if(itemStack.getItem() == ItemsArcadia.epicWeaponShadowSteel)
			list.add("Wither for 4 Seconds");
		if(itemStack.getItem() == ItemsArcadia.epicWeaponLifeDrain)
			list.add("50% Lifesteal");
	}
}