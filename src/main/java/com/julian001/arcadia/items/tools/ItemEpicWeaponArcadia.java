package com.julian001.arcadia.items.tools;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.items.ItemsArcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemEpicWeaponArcadia extends ItemSword {

	private float weaponDamage;
	private float critDamage;
	public ItemEpicWeaponArcadia(String name, ToolMaterial material) {
		super(material);
		setCreativeTab(arcadia.tabArcadiaItems);
		setUnlocalizedName(References.ID + "_" + name);
		setTextureName(References.ID + ":" + name);
		GameRegistry.registerItem(this, name);
		this.weaponDamage = 4 + material.getDamageVsEntity();
		this.critDamage = 100;
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
								((WorldServer) entity.worldObj).func_147487_a("portal", entity.posX + (double) var8, (double) (var7 + 1.0F), entity.posZ + (double) var5, 5, 0F, (float) i, 0F, 0.3);
							else
								((WorldServer) entity.worldObj).func_147487_a("witchMagic", entity.posX + (double) var8, (double) (var7 + 1.0F), entity.posZ + (double) var5, 5, -0.7F, 0.3F, 1.0F, 0);
						}
					}
				}
			}
			//float dmg = getDamageVsEntity(par3EntityLiving);
			float dmg1 = ItemsArcadia.toolSHADOWSTEEL.getDamageVsEntity()/2;
			System.out.println(dmg1);
			par3EntityLiving.heal(dmg1);
		}
		par1ItemStack.damageItem(1, par3EntityLiving);
		return true;
	}
	
	public float getDamageVsEntity(Entity entity) {
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
			return critDamage;
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
			return weaponDamage;
		}
		return weaponDamage;
	}
}