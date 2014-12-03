package com.julian001.arcadia.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPotionArcadia extends ItemMetadataArcadia{

	private IIcon[] icons;
	public ItemPotionArcadia(String name, int maxMeta) {
		super(maxMeta);
		setMaxStackSize(1);
		setCreativeTab(arcadia.tabArcadiaPotions);
		setUnlocalizedName(References.ID + "_" + name);
		GameRegistry.registerItem(this, name);
		icons = new IIcon[maxMeta];
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		for(int i = 0; i < icons.length; i++) {
			String name = "";
			switch(i) {
				case  0:
				case  1:
				case  2: name = "Haste";break;
				case  3:
				case  4:
				case  5: name = "MiningFatigue";break;
				case  6:
				case  7:
				case  8: name = "JumpBoost";break;
				case  9:
				case 10: name = "Nausea";break;
				case 11:
				case 12:
				case 13: name = "Resistance";break;
				case 14:
				case 15: name = "Blindness";break;
				case 16:
				case 17:
				case 18: name = "Wither";break;
				case 19:
				case 20:
				case 21: name = "HealthBoost";break;
				case 22:
				case 23:
				case 24: name = "Absorption";break;
				
				case 25:
				case 26:
				case 27: name = "Health";break;
				case 28:
				case 29:
				case 30: name = "Life";break;
				case 31:
				case 32:
				case 33: name = "Speed";break;
				case 34:
				case 35:
				case 36: name = "Movement";break;
				case 37:
				case 38:
				case 39: name = "Ninja";break;
				case 40:
				case 41: name = "Vision";break;
				case 42:
				case 43:
				case 44: name = "Protection";break;
				case 45:
				case 46:
				case 47: name = "Defense";break;
				case 48:
				case 49:
				case 50: name = "AttackAndDefense";break;
				case 51:
				case 52: name = "AnitVision";break;
				case 53:
				case 54:
				case 55: name = "Defenseless";break;
				case 56:
				case 57:
				case 58: name = "Pain";break;
				case 59:
				case 60:
				case 61: name = "Suffer";break;
				case 62:
				case 63:
				case 64: name = "Slowdown";break;
				case 65:
				case 66: name = "AntiFallDammage";break;
				case 67:
				case 68: name = "Stun";break;
				
				default: name = "Broken";			
			}
			icons[i] = iconRegister.registerIcon(References.ID + ":potion" + name);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		return icons[meta];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		String name = "";
		switch(itemStack.getItemDamage()) {
			case  0: name = "normalHaste";break;
			case  1: name = "extendedHaste";break;
			case  2: name = "upgradedHaste";break;
			case  3: name = "normalMiningFatigue";break;
			case  4: name = "extendedMiningFatigue";break;
			case  5: name = "upgradedMiningFatigue";break;
			case  6: name = "normalJumpBoost";break;
			case  7: name = "extendedJumpBoost";break;
			case  8: name = "upgradedJumpBoost";break;
			case  9: name = "normalNausea";break;
			case 10: name = "extendedNausea";break;
			case 11: name = "normalResistance";break;
			case 12: name = "extendedResistance";break;
			case 13: name = "upgradedResistance";break;
			case 14: name = "normalBlindness";break;
			case 15: name = "extendedBlindness";break;
			case 16: name = "normalWither";break;
			case 17: name = "extendedWither";break;
			case 18: name = "upgradedWither";break;
			case 19: name = "normalHealthBoost";break;
			case 20: name = "extendedHealthBoost";break;
			case 21: name = "upgradedHealthBoost";break;
			case 22: name = "normalAbsorption";break;
			case 23: name = "extendedAbsorption";break;
			case 24: name = "upgradedAbsorption";break;
			
			case 25: name = "normalCombinedHealth";break;
			case 26: name = "extendedCombinedHealth";break;
			case 27: name = "upgradedCombinedHealth";break;
			case 28: name = "normalCombinedLife";break;
			case 29: name = "extendedCombinedLife";break;
			case 30: name = "upgradedCombinedLife";break;
			case 31: name = "normalCombinedSpeed";break;
			case 32: name = "extendedCombinedSpeed";break;
			case 33: name = "upgradedCombinedSpeed";break;
			case 34: name = "normalCombinedMovement";break;
			case 35: name = "extendedCombinedMovement";break;
			case 36: name = "upgradedCombinedMovement";break;
			case 37: name = "normalCombinedNinja";break;
			case 38: name = "extendedCombinedNinja";break;
			case 39: name = "upgradedCombinedNinja";break;
			case 40: name = "normalCombinedVision";break;
			case 41: name = "extendedCombinedVision";break;
			case 42: name = "normalCombinedProtection";break;
			case 43: name = "extendedCombinedProtection";break;
			case 44: name = "upgradedCombinedProtection";break;
			case 45: name = "normalCombinedDefense";break;
			case 46: name = "extendedCombinedDefense";break;
			case 47: name = "upgradedCombinedDefense";break;
			case 48: name = "normalCombinedAttackAndDefense";break;
			case 49: name = "extendedCombinedAttackAndDefense";break;
			case 50: name = "upgradedCombinedAttackAndDefense";break;
			case 51: name = "normalCombinedAnitVision";break;
			case 52: name = "extendedCombinedAnitVision";break;
			case 53: name = "normalCombinedDefenseless";break;
			case 54: name = "extendedCombinedDefenseless";break;
			case 55: name = "upgradedCombinedDefenseless";break;
			case 56: name = "normalCombinedPain";break;
			case 57: name = "extendedCombinedPain";break;
			case 58: name = "upgradedCombinedPain";break;
			case 59: name = "normalCombinedSuffer";break;
			case 60: name = "extendedCombinedSuffer";break;
			case 61: name = "upgradedCombinedSuffer";break;
			case 62: name = "normalCombinedSlowdown";break;
			case 63: name = "extendedCombinedSlowdown";break;
			case 64: name = "upgradedCombinedSlowdown";break;
			case 65: name = "normalSpecialAntiFallDamage";break;
			case 66: name = "extendedSpecialAntiFallDamage";break;
			case 67: name = "normalSpecialStun";break;
			
			default: name = "Broken";
		}
		return getUnlocalizedName() + "." + name;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack itemStack) {
		return true;
	}
	
	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {
		PotionEffect effect = null;
		switch(itemStack.getItemDamage()) {
			case  0: effect = new PotionEffect(Potion.digSpeed.id, 180 * 20, 0);break;
			case  1: effect = new PotionEffect(Potion.digSpeed.id, 480 * 20, 0);break;
			case  2: effect = new PotionEffect(Potion.digSpeed.id,  90 * 20, 1);break;
			case  3: effect = new PotionEffect(Potion.digSlowdown.id, 180 * 20, 0);break;
			case  4: effect = new PotionEffect(Potion.digSlowdown.id, 480 * 20, 0);break;
			case  5: effect = new PotionEffect(Potion.digSlowdown.id,  90 * 20, 1);break;
			case  6: effect = new PotionEffect(Potion.jump.id, 180 * 20, 0);break;
			case  7: effect = new PotionEffect(Potion.jump.id, 480 * 20, 0);break;
			case  8: effect = new PotionEffect(Potion.jump.id,  90 * 20, 1);break;
			case  9: effect = new PotionEffect(Potion.confusion.id, 180 * 20, 0);break;
			case 10: effect = new PotionEffect(Potion.confusion.id, 480 * 20, 0);break;
			case 11: effect = new PotionEffect(Potion.resistance.id, 180 * 20, 0);break;
			case 12: effect = new PotionEffect(Potion.resistance.id, 480 * 20, 0);break;
			case 13: effect = new PotionEffect(Potion.resistance.id,  90 * 20, 1);break;
			case 14: effect = new PotionEffect(Potion.blindness.id, 180 * 20, 0);break;
			case 15: effect = new PotionEffect(Potion.blindness.id, 480 * 20, 0);break;
			case 16: effect = new PotionEffect(Potion.wither.id,  45 * 20, 0);break;
			case 17: effect = new PotionEffect(Potion.wither.id, 120 * 20, 0);break;
			case 18: effect = new PotionEffect(Potion.wither.id,  22 * 20, 1);break;
			case 19: effect = new PotionEffect(Potion.field_76434_w.id, 180 * 20, 2);break;
			case 20: effect = new PotionEffect(Potion.field_76434_w.id, 480 * 20, 2);break;
			case 21: effect = new PotionEffect(Potion.field_76434_w.id,  90 * 20, 4);break;
			case 22: effect = new PotionEffect(Potion.field_76444_x.id, 180 * 20, 2);break;
			case 23: effect = new PotionEffect(Potion.field_76444_x.id, 480 * 20, 2);break;
			case 24: effect = new PotionEffect(Potion.field_76444_x.id,  90 * 20, 4);break;
			
			case 25: effect = new PotionEffect(Potion.regeneration.id, 50 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.heal.id, 2));break;
			case 26: effect = new PotionEffect(Potion.regeneration.id, 130 * 20, 0);
 				player.addPotionEffect(new PotionEffect(Potion.heal.id, 2));break;
			case 27: effect = new PotionEffect(Potion.regeneration.id, 30 * 20, 1);
				player.addPotionEffect(new PotionEffect(Potion.heal.id, 3));break;
			case 28: effect = new PotionEffect(Potion.regeneration.id, 60 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, 190 * 20, 2));
				player.addPotionEffect(new PotionEffect(Potion.heal.id, 4));break;
			case 29: effect = new PotionEffect(Potion.regeneration.id, 150 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, 500 * 20, 2));
				player.addPotionEffect(new PotionEffect(Potion.heal.id, 4));break;
			case 30: effect = new PotionEffect(Potion.regeneration.id, 40 * 20, 1);
				player.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, 100 * 20, 4));
				player.addPotionEffect(new PotionEffect(Potion.heal.id, 6));break;
			case 31: effect = new PotionEffect(Potion.moveSpeed.id, 190 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 190 * 20, 0));break;
			case 32: effect = new PotionEffect(Potion.moveSpeed.id, 500 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 500 * 20, 0));break;
			case 33: effect = new PotionEffect(Potion.moveSpeed.id, 100 * 20, 1);
		 		player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100 * 20, 1));break;
			case 34: effect = new PotionEffect(Potion.moveSpeed.id, 200 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 200 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 200 * 20, 0));break;
			case 35: effect = new PotionEffect(Potion.moveSpeed.id, 520 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 520 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 520 * 20, 0));break;
			case 36: effect = new PotionEffect(Potion.moveSpeed.id, 110 * 20, 1);
		 		player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 110 * 20, 1));
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 110 * 20, 1));break;
			case 37: effect = new PotionEffect(Potion.moveSpeed.id, 210 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 210 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 210 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 210 * 20, 0));break;
			case 38: effect = new PotionEffect(Potion.moveSpeed.id, 540 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 540 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 540 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 540 * 20, 0));break;
			case 39: effect = new PotionEffect(Potion.moveSpeed.id, 120 * 20, 1);
		 		player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 120 * 20, 1));
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 120 * 20, 1));
				player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 120 * 20, 0));break;
			case 40: effect = new PotionEffect(Potion.nightVision.id, 190 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 190 * 20, 0));break;
			case 41: effect = new PotionEffect(Potion.nightVision.id, 500 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 500 * 20, 0));break;
			case 42: effect = new PotionEffect(Potion.field_76444_x.id, 190 * 20, 2);
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 190 * 20, 0));break;
			case 43: effect = new PotionEffect(Potion.field_76444_x.id, 500 * 20, 2);
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 500 * 20, 0));break;
			case 44: effect = new PotionEffect(Potion.field_76444_x.id, 100 * 20, 4);
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 100 * 20, 0));break;
			case 45: effect = new PotionEffect(Potion.field_76444_x.id, 200 * 20, 2);
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 200 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 200 * 20, 0));break;
			case 46: effect = new PotionEffect(Potion.field_76444_x.id, 520 * 20, 2);
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 520 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 520 * 20, 0));break;
			case 47: effect = new PotionEffect(Potion.field_76444_x.id, 110 * 20, 4);
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 110 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 110 * 20, 1));break;
			case 48: effect = new PotionEffect(Potion.field_76444_x.id, 210 * 20, 2);
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 210 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 210 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 210 * 20, 0));break;
			case 49: effect = new PotionEffect(Potion.field_76444_x.id, 540 * 20, 2);
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 540 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 540 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 540 * 20, 0));break;
			case 50: effect = new PotionEffect(Potion.field_76444_x.id, 120 * 20, 4);
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 120 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 120 * 20, 1));
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 120 * 20, 1));break;
			case 51: effect = new PotionEffect(Potion.blindness.id, 190 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 190 * 20, 0));break;
			case 52: effect = new PotionEffect(Potion.blindness.id, 500 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 500 * 20, 0));break;
			case 53: effect = new PotionEffect(Potion.blindness.id, 200 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 200 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.weakness.id, 200 * 20, 0));break;
			case 54: effect = new PotionEffect(Potion.blindness.id, 520 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 520 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.weakness.id, 520 * 20, 0));break;
			case 55: effect = new PotionEffect(Potion.blindness.id, 200 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 200 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.weakness.id, 110 * 20, 0));break;
			case 56: effect = new PotionEffect(Potion.wither.id, 30 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.poison.id, 30 * 20, 0));break;
			case 57: effect = new PotionEffect(Potion.wither.id, 65 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.poison.id, 65 * 20, 0));break;
			case 58: effect = new PotionEffect(Potion.wither.id, 15 * 20, 1);
				player.addPotionEffect(new PotionEffect(Potion.poison.id, 15 * 20, 1));break;
			case 59: effect = new PotionEffect(Potion.wither.id, 35 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.poison.id, 35 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.hunger.id, 35 * 20, 0));break;
			case 60: effect = new PotionEffect(Potion.wither.id, 70 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.poison.id, 70 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.hunger.id, 70 * 20, 0));break;
			case 61: effect = new PotionEffect(Potion.wither.id, 20 * 20, 1);
				player.addPotionEffect(new PotionEffect(Potion.poison.id, 20 * 20, 1));
				player.addPotionEffect(new PotionEffect(Potion.hunger.id, 20 * 20, 1));break;
			case 62: effect = new PotionEffect(Potion.moveSlowdown.id, 190 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 190 * 20, 0));break;
			case 63: effect = new PotionEffect(Potion.moveSlowdown.id, 500 * 20, 0);
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 500 * 20, 0));break;
			case 64: effect = new PotionEffect(Potion.moveSlowdown.id, 100 * 20, 1);
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 100 * 20, 1));break;
			case 65: effect = new PotionEffect(Potion.jump.id, 180 * 20, 255);break;
			case 66: effect = new PotionEffect(Potion.jump.id, 480 * 20, 255);break;
			case 67: effect = new PotionEffect(Potion.moveSlowdown.id, 20 * 20, 7);
				//TODOplayer.addPotionEffect(new PotionEffect(Potion.jump.id, 20 * 20, 151));
				player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 10 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 20 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 20 * 20, 5));break;
		}
		player.addPotionEffect(effect);
		
	    if (!player.capabilities.isCreativeMode)
        {
	    	itemStack.stackSize--;
            if (itemStack.stackSize <= 0)
            {
                return new ItemStack(Items.glass_bottle);
            }

            player.inventory.addItemStackToInventory(new ItemStack(Items.glass_bottle));
        }
	
	    return itemStack;
	}
	
	public int getMaxItemUseDuration(ItemStack itemStack) {
        return 32;
    }
	
	public EnumAction getItemUseAction(ItemStack itemStack) {
        return EnumAction.drink;
    }
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		player.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
		return itemStack;
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
            par3List.add("\u00a77" + "Blindness (0:30)");                
        
    }
}