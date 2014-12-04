package com.julian001.arcadia.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
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
				case 52: name = "AntiVision";break;
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
			case 51: name = "normalCombinedAntiVision";break;
			case 52: name = "extendedCombinedAntiVision";break;
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
				player.addPotionEffect(new PotionEffect(Potion.weakness.id, 110 * 20, 1));break;
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
				//TODO player.addPotionEffect(new PotionEffect(Potion.jump.id, 20 * 20, 151));
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
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
		switch(itemStack.getItemDamage()) {
			case  0: list.add("Haste (3:00)");break;
			case  1: list.add("Haste (8:00)");break;
			case  2: list.add("Haste II (1:30)");break;
			case  3: list.add("Mining Fatigue (3:00)");break;
			case  4: list.add("Mining Fatigue (8:00)");break;
			case  5: list.add("Mining Fatigue II (1:30)");break;
			case  6: list.add("Jump Boost (3:00)");break;
			case  7: list.add("Jump Boost (8:00)");break;
			case  8: list.add("Jump Boost II (1:30)");break;
			case  9: list.add("Nausea (3:00)");break;
			case 10: list.add("Nausea (8:00)");break;
			case 11: list.add("Resistance (3:00)");break;
			case 12: list.add("Resistance (8:00)");break;
			case 13: list.add("Resistance II (1:30)");break;
			case 14: list.add("Blindness (3:00)");break;
			case 15: list.add("Blindness (8:00)");break;
			case 16: list.add("Wither (0:45)");break;
			case 17: list.add("Wither (2:00)");break;
			case 18: list.add("Wither II (0:22)");break;
			case 19: list.add("Health Boost III (3:00)");break;
			case 20: list.add("Health Boost III (8:00)");break;
			case 21: list.add("Health Boost V (1:30)");break;
			case 22: list.add("Absorption III (3:00)");break;
			case 23: list.add("Absorption III (8:00)");break;
			case 24: list.add("Absorption V (1:30)");break;
			
			case 25: list.add("Regeneration (0:50)");
				list.add("Instant Health III");break;
			case 26: list.add("Regeneration (2:10)");
				list.add("Instant Health III");break;
			case 27: list.add("Regeneration II (0:30)");
				list.add("Instant Health IV");break;
			case 28: list.add("Regeneration (1:00)");
				list.add("Health Boost III (3:10)");
				list.add("Instant Health V");break;
			case 29: list.add("Regeneration (2:30)");
				list.add("Health Boost III (8:20)");
				list.add("Instant Health V");break;
			case 30: list.add("Regeneration II (0:40)");
				list.add("Health Boost V (1:40)");
				list.add("Instant Health VII");break;
			case 31: list.add("Speed (3:10)");
				list.add("Haste (3:10)");break;
			case 32: list.add("Speed (8:20)");
				list.add("Haste (8:20)");break;
			case 33: list.add("Speed II (1:40)");
				list.add("Haste II (1:40)");break;
			case 34: list.add("Speed (3:20)");
				list.add("Haste (3:20)");
				list.add("Jump Boost (3:20)");break;
			case 35: list.add("Speed (8:40)");
				list.add("Haste (8:40)");
				list.add("Jump Boost (8:40)");break;
			case 36: list.add("Speed II (1:50)");
				list.add("Haste II (1:50)");
				list.add("Jump Boost II (1:50)");break;
			case 37: list.add("Speed (3:30)");
				list.add("Haste (3:30)");
				list.add("Jump Boost (3:30)");
				list.add("Invisibility (3:30)");break;
			case 38: list.add("Speed (9:00)");
				list.add("Haste (9:00)");
				list.add("Jump Boost (9:00)");
				list.add("Invisibility (9:00)");break;
			case 39: list.add("Speed II (2:00)");
				list.add("Haste II (2:00)");
				list.add("Jump Boost II (2:00)");
				list.add("Invisibility (2:00)");break;
			case 40: list.add("Night Vision (3:10)");
				list.add("Water Breathing (3:10)");break;
			case 41: list.add("Night Vision (8:20)");
				list.add("Water Breathing (8:20)");break;
			case 42: list.add("Absorption III (3:10)");
				list.add("Fire Resistance (3:10)");break;
			case 43: list.add("Absorption III (8:20)");
				list.add("Fire Resistance (8:20)");break;
			case 44: list.add("Absorption V (1:40)");
				list.add("Fire Resistance (1:40)");break;
			case 45: list.add("Absorption III (3:20)");
				list.add("Fire Resistance (3:20)");
				list.add("Resistance (3:20)");break;
			case 46: list.add("Absorption III (8:40)");
				list.add("Fire Resistance (8:40)");
				list.add("Resistance (8:40)");break;
			case 47: list.add("Absorption III (1:50)");
				list.add("Fire Resistance (1:50)");
				list.add("Resistance II (1:50)");break;
			case 48: list.add("Absorption III (3:30)");
				list.add("Fire Resistance (3:30)");
				list.add("Resistance (3:30)");
				list.add("Strength (3:30)");break;
			case 49: list.add("Absorption III (9:00)");
				list.add("Fire Resistance (9:00)");
				list.add("Resistance (9:00)");
				list.add("Strength (9:00)");break;
			case 50: list.add("Absorption III (2:00)");
				list.add("Fire Resistance (2:00)");
				list.add("Resistance II (2:00)");
				list.add("Strength II (2:00)");break;
			case 51: list.add("Blindness (3:10)");
				list.add("Nausea (3:10)");break;
			case 52: list.add("Blindness (8:20)");
				list.add("Nausea (8:20)");break;
			case 53: list.add("Blindness (3:20)");
				list.add("Nausea (3:20)");
				list.add("Weakness (3:20)");break;
			case 54: list.add("Blindness (8:40)");
				list.add("Nausea (8:40)");
				list.add("Weakness (8:40)");break;
			case 55: list.add("Blindness (1:50)");
				list.add("Nausea (1:50)");
				list.add("Weakness II (1:50)");break;
			case 56: list.add("Wither (0:30)");
				list.add("Poison (0:30)");break;
			case 57: list.add("Wither (1:05)");
				list.add("Poison (1:05)");break;
			case 58: list.add("Wither II (0:15)");
				list.add("Poison II (0:15)");break;
			case 59: list.add("Wither (0:35)");
				list.add("Poison (0:35)");
				list.add("Hunger (0:35)");break;
			case 60: list.add("Wither (1:10)");
				list.add("Poison (1:10)");
				list.add("Hunger (1:10)");break;
			case 61: list.add("Wither II (0:20)");
				list.add("Poison II (0:20)");
				list.add("Hunger II (0:20)");break;
			case 62: list.add("Slowness (3:10)");
				list.add("Mining Fatigue (3:10)");break;
			case 63: list.add("Slowness (8:20)");
				list.add("Mining Fatigue (8:20)");break;
			case 64: list.add("Slowness II (1:40)");
				list.add("Mining Fatigue II (1:40)");break;
			case 65: list.add("Feather Falling (3:00)");break;
			case 66: list.add("Feather Falling (8:00)");break;
			case 67: list.add("Stunned (0:20)");break;
		}
		list.add("");
        list.add(EnumChatFormatting.DARK_PURPLE + StatCollector.translateToLocal("potion.effects.whenDrank"));
        switch(itemStack.getItemDamage()) {
        	case  0:
        	case  1: list.add(EnumChatFormatting.BLUE + "+20% Digging Speed");break;
        	case  2: list.add(EnumChatFormatting.BLUE + "+40% Digging Speed");break;
        	case  3:
        	case  4: list.add(EnumChatFormatting.RED + "-20% Digging Speed");break;
        	case  5: list.add(EnumChatFormatting.RED + "-40% Digging Speed");break;
        	case  6:
        	case  7: list.add(EnumChatFormatting.BLUE + "+1/2 Block Jump Hight");break;
        	case  8: list.add(EnumChatFormatting.BLUE + "+1 Block Jump Hight");break;
        	case  9:
        	case 10: list.add(EnumChatFormatting.RED + "You feel sick!");break;
        	case 11:
        	case 12: list.add(EnumChatFormatting.BLUE + "+20% Damage Reduction");break;
        	case 13: list.add(EnumChatFormatting.BLUE + "+40% Damage Reduction");break;
        	case 14:
        	case 15: list.add(EnumChatFormatting.RED + "You can't see anymore!");break;
        	case 16:
        	case 17: list.add(EnumChatFormatting.RED + "-0.25 Hearts per Second");break;
        	case 18: list.add(EnumChatFormatting.RED + "-0.5 Hearts per Second");break;
        	case 19:
        	case 20: list.add(EnumChatFormatting.BLUE + "+6 Hearts Base Health");break;
        	case 21: list.add(EnumChatFormatting.BLUE + "+10 Hearts Base Health");break;
        	case 22:
        	case 23: list.add(EnumChatFormatting.BLUE + "+6 Hearts Absorption Health");break;
        	case 24: list.add(EnumChatFormatting.BLUE + "+10 Hearts Absorption Health");break;
    		
        	case 25:
        	case 26: list.add(EnumChatFormatting.BLUE + "+0.5 Hearts per 2.5 Seconds");
    			list.add(EnumChatFormatting.BLUE + "+4 Hearts");break;
        	case 27: list.add(EnumChatFormatting.BLUE + "+0.25 Hearts per 2.5 Seconds");
				list.add(EnumChatFormatting.BLUE + "+6 Hearts");break;
        	case 28:
        	case 29: list.add(EnumChatFormatting.BLUE + "+0.5 Hearts per 2.5 Seconds");
				list.add(EnumChatFormatting.BLUE + "+6 Hearts Base Health");
				list.add(EnumChatFormatting.BLUE + "+6 Hearts");break;
        	case 30: list.add(EnumChatFormatting.BLUE + "+0.25 Hearts per 2.5 Seconds");
				list.add(EnumChatFormatting.BLUE + "+10 Hearts Base Health");
				list.add(EnumChatFormatting.BLUE + "+10 Hearts");break;
        	case 31:
        	case 32: list.add(EnumChatFormatting.BLUE + "+20% Speed");
				list.add(EnumChatFormatting.BLUE + "+20% Digging Speed");break;
        	case 33: list.add(EnumChatFormatting.BLUE + "+40% Speed");
				list.add(EnumChatFormatting.BLUE + "+40% Digging Speed");break;
        	case 34:
        	case 35: list.add(EnumChatFormatting.BLUE + "+20% Speed");
				list.add(EnumChatFormatting.BLUE + "+20% Digging Speed");
				list.add(EnumChatFormatting.BLUE + "+1/2 Block Jump Hight");break;
        	case 36: list.add(EnumChatFormatting.BLUE + "+40% Speed");
				list.add(EnumChatFormatting.BLUE + "+40% Digging Speed");
				list.add(EnumChatFormatting.BLUE + "+1 Block Jump Hight");break;
        	case 37:
        	case 38: list.add(EnumChatFormatting.BLUE + "+20% Speed");
				list.add(EnumChatFormatting.BLUE + "+20% Digging Speed");
				list.add(EnumChatFormatting.BLUE + "+1/2 Block Jump Hight");
				list.add(EnumChatFormatting.BLUE + "You will be invisible!");break;
        	case 39: list.add(EnumChatFormatting.BLUE + "+40% Speed");
				list.add(EnumChatFormatting.BLUE + "+40% Digging Speed");
				list.add(EnumChatFormatting.BLUE + "+1 Block Jump Hight");
				list.add(EnumChatFormatting.BLUE + "You will be invisible!");break;
        	case 40: list.add(EnumChatFormatting.BLUE + "You can see more!");
    			list.add(EnumChatFormatting.BLUE + "+100% Air Regeneration");break;
        	case 41: list.add(EnumChatFormatting.BLUE + "You can see more!");
				list.add(EnumChatFormatting.BLUE + "+100% Air Regeneration");break;
        	case 42:
        	case 43: list.add(EnumChatFormatting.BLUE + "+6 Hearts Absorption Health");
    			list.add(EnumChatFormatting.BLUE + "You are able to resist high heat!");break;
        	case 44: list.add(EnumChatFormatting.BLUE + "+10 Hearts Absorption Health");
				list.add(EnumChatFormatting.BLUE + "You are able to resist high heat!");break;
        	case 45:
        	case 46: list.add(EnumChatFormatting.BLUE + "+6 Hearts Absorption Health");
    			list.add(EnumChatFormatting.BLUE + "You are able to resist high heat!");
    			list.add(EnumChatFormatting.BLUE + "+20% Damage Reduction");break;
        	case 47: list.add(EnumChatFormatting.BLUE + "+10 Hearts Absorption Health");
				list.add(EnumChatFormatting.BLUE + "You are able to resist high heat!");
				list.add(EnumChatFormatting.BLUE + "+40% Damage Reduction");break;
        	case 48:
        	case 49: list.add(EnumChatFormatting.BLUE + "+6 Hearts Absorption Health");
    			list.add(EnumChatFormatting.BLUE + "You are able to resist high heat!");
    			list.add(EnumChatFormatting.BLUE + "+20% Damage Reduction");
    			list.add(EnumChatFormatting.BLUE + "+130% Attack Damage");break;
        	case 50: list.add(EnumChatFormatting.BLUE + "+10 Hearts Absorption Health");
				list.add(EnumChatFormatting.BLUE + "You are able to resist high heat!");
				list.add(EnumChatFormatting.BLUE + "+40% Damage Reduction");
    			list.add(EnumChatFormatting.BLUE + "+260% Attack Damage");break;
        	case 51:
        	case 52: list.add(EnumChatFormatting.RED + "You can't see anymore!");
        		list.add(EnumChatFormatting.RED + "You feel sick!");break;
        	case 53:
        	case 54: list.add(EnumChatFormatting.RED + "You can't see anymore!");
        		list.add(EnumChatFormatting.RED + "You feel sick!");
        		list.add(EnumChatFormatting.RED + "-50% Attack Damage");break;
        	case 55: list.add(EnumChatFormatting.RED + "You can't see anymore!");
	    		list.add(EnumChatFormatting.RED + "You feel sick!");
	    		list.add(EnumChatFormatting.RED + "-100% Attack Damage");break;
        	case 56:
        	case 57: list.add(EnumChatFormatting.RED + "-0.25 Hearts per Second");
        		list.add(EnumChatFormatting.RED + "-0.5 Hearts per 1.25 Seconds");break;
        	case 58: list.add(EnumChatFormatting.RED + "-0.5 Hearts per Second");
        		list.add(EnumChatFormatting.RED + "-1 Heart per 1.25 Seconds");break;
        	case 59:
        	case 60: list.add(EnumChatFormatting.RED + "-0.25 Hearts per Second");
        		list.add(EnumChatFormatting.RED + "-0.5 Hearts per 1.25 Seconds");
        		list.add(EnumChatFormatting.RED + "-0.5 Food Meters per Second");break;
        	case 61: list.add(EnumChatFormatting.RED + "-0.5 Hearts per Second");
        		list.add(EnumChatFormatting.RED + "-1 Heart per 1.25 Seconds");
        		list.add(EnumChatFormatting.RED + "-1 Food Meter per Second");break;
        	case 62:
        	case 63: list.add(EnumChatFormatting.RED + "-15% Speed");
        		list.add(EnumChatFormatting.RED + "-20% Digging Speed");break;
        	case 64: list.add(EnumChatFormatting.RED + "-30% Speed");
        		list.add(EnumChatFormatting.RED + "-40% Digging Speed");break;
        	case 65:
        	case 66: list.add(EnumChatFormatting.BLUE + "No Fall Damage!");break;
        	case 67: list.add(EnumChatFormatting.BLUE + "Unable to Move and Mine!");break;
        }
    }
}