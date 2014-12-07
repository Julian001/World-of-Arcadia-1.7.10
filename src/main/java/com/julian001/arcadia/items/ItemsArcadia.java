package com.julian001.arcadia.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.julian001.arcadia.items.armor.ItemArmorArcadia;
import com.julian001.arcadia.items.armor.ItemArmorSpeedArcadia;
import com.julian001.arcadia.items.tools.ItemAxeArcadia;
import com.julian001.arcadia.items.tools.ItemEpicWeaponArcadia;
import com.julian001.arcadia.items.tools.ItemHoeArcadia;
import com.julian001.arcadia.items.tools.ItemMysticalGloveArcadia;
import com.julian001.arcadia.items.tools.ItemPickaxeArcadia;
import com.julian001.arcadia.items.tools.ItemShearsArcadia;
import com.julian001.arcadia.items.tools.ItemShovelArcadia;
import com.julian001.arcadia.items.tools.ItemSwordArcadia;

public class ItemsArcadia {

	public static ToolMaterial toolSILVER = EnumHelper.addToolMaterial("Silver", 2, 80, 10F, 3F, 18);
	public static ToolMaterial toolBRONZE = EnumHelper.addToolMaterial("Bronze", 2, 500, 6.5F, 2F, 15);
    public static ToolMaterial toolRUBY = EnumHelper.addToolMaterial("Ruby", 2, 800, 11F, 4F, 18);
    public static ToolMaterial toolSAPPHIRE = EnumHelper.addToolMaterial("Sapphire", 2, 2000, 8F, 2F, 16);
    public static ToolMaterial toolSHADOWSTEEL = EnumHelper.addToolMaterial("ShadowSteel", 3, 1000, 15F, 6F, 25);
    public static ToolMaterial toolMYSTICAL = EnumHelper.addToolMaterial("Mystical", 3, 100, 20F, 3F, 25);
    public static ArmorMaterial armorSILVER = EnumHelper.addArmorMaterial("Silver", 10, new int[]{2, 5, 4, 1}, 18);
    public static ArmorMaterial armorBRONZE = EnumHelper.addArmorMaterial("Bronze", 18, new int[]{2, 6, 5, 2}, 15);
    public static ArmorMaterial armorRUBY = EnumHelper.addArmorMaterial("Ruby", 22, new int[]{4, 8, 6, 4}, 18);
    public static ArmorMaterial armorSAPPHIRE = EnumHelper.addArmorMaterial("Sapphire", 44, new int[]{3, 8, 6, 3}, 16);
    public static ArmorMaterial armorSHADOWSTEEL = EnumHelper.addArmorMaterial("ShadowSteel", 30, new int[]{4, 9, 6, 4}, 25);
	
	
	public static Item swordSilver;
	public static Item swordBronze;
    public static Item swordRuby;
    public static Item swordSapphire;
    public static Item swordShadowSteel; 
    
    public static Item pickaxeSilver;
	public static Item pickaxeBronze;
    public static Item pickaxeRuby;
    public static Item pickaxeSapphire;
    public static Item pickaxeShadowSteel; 
    
    public static Item shovelSilver;
	public static Item shovelBronze;
    public static Item shovelRuby;
    public static Item shovelSapphire;
    public static Item shovelShadowSteel; 
    
    public static Item axeSilver;
	public static Item axeBronze;
    public static Item axeRuby;
    public static Item axeSapphire;
    public static Item axeShadowSteel; 
    
    public static Item hoeSilver;
	public static Item hoeBronze;
    public static Item hoeRuby;
    public static Item hoeSapphire;
    public static Item hoeShadowSteel; 
    
    public static Item shearsSilver;
	public static Item shearsBronze;
    public static Item shearsRuby;
    public static Item shearsSapphire;
    public static Item shearsShadowSteel; 
    
    public static Item helmetSilver;
	public static Item helmetBronze;
    public static Item helmetRuby;
    public static Item helmetSapphire;
    public static Item helmetShadowSteel; 
    
    public static Item chestplateSilver;
	public static Item chestplateBronze;
    public static Item chestplateRuby;
    public static Item chestplateSapphire;
    public static Item chestplateShadowSteel; 
    
    public static Item leggingsSilver;
	public static Item leggingsBronze;
    public static Item leggingsRuby;
    public static Item leggingsSapphire;
    public static Item leggingsShadowSteel;
    
    public static Item bootsSilver;
	public static Item bootsBronze;
    public static Item bootsRuby;
    public static Item bootsSapphire;
    public static Item bootsShadowSteel;
    
    public static Item epicWeaponRuby;
    public static Item epicWeaponSapphire;
    public static Item epicWeaponShadowSteel;
	
    public static Item friedEgg;
    public static Item sushi;
    public static Item sushiSoup;
    public static Item cheese;
    public static Item sandwich;
    
	public static Item arcadiaItem;
	public static Item ingotArcadia;
	public static Item bagArcadia;
	public static Item mysticalGlove;
	public static Item potionArcadia;
	public static Item mysticalPowder;
	
	
	public static void init() {
		
		arcadiaItem = new ItemArcadia("arcadiaItem");
		ingotArcadia = new ItemIngotArcadia("ingotArcadia", 9);
		bagArcadia = new ItemBagArcadia("bagArcadia", 3);
		mysticalGlove = new ItemMysticalGloveArcadia("mysticalGlove", 7F, toolMYSTICAL);
		potionArcadia = new ItemPotionArcadia("potionArcadia", 68);
		mysticalPowder = new ItemMysticalPowder("mysticalPowder");
		
		friedEgg = new ItemFoodArcadia("friedEgg", 6, 2F, false);
		sushi = new ItemFoodArcadia("sushi", 4, 0.4F, false);
		sushiSoup = new ItemFoodArcadia("sushiSoup", 8, 1.6F, false);
		cheese = new ItemFoodArcadia("cheese", 3, 0.6F, false);
		sandwich = new ItemFoodArcadia("sandwich", 10, 2F, true);
		
		swordSilver = new ItemSwordArcadia("swordSilver", toolSILVER);
		swordBronze = new ItemSwordArcadia("swordBronze", toolBRONZE);
		swordRuby = new ItemSwordArcadia("swordRuby", toolRUBY);
		swordSapphire = new ItemSwordArcadia("swordSapphire", toolSAPPHIRE);
		swordShadowSteel = new ItemSwordArcadia("swordShadowSteel", toolSHADOWSTEEL);
		
		pickaxeSilver = new ItemPickaxeArcadia("pickaxeSilver", toolSILVER);
		pickaxeBronze = new ItemPickaxeArcadia("pickaxeBronze", toolBRONZE);
		pickaxeRuby = new ItemPickaxeArcadia("pickaxeRuby", toolRUBY);
		pickaxeSapphire = new ItemPickaxeArcadia("pickaxeSapphire", toolSAPPHIRE);
		pickaxeShadowSteel = new ItemPickaxeArcadia("pickaxeShadowSteel", toolSHADOWSTEEL);
		
		shovelSilver = new ItemShovelArcadia("shovelSilver", toolSILVER);
		shovelBronze = new ItemShovelArcadia("shovelBronze", toolBRONZE);
		shovelRuby = new ItemShovelArcadia("shovelRuby", toolRUBY);
		shovelSapphire = new ItemShovelArcadia("shovelSapphire", toolSAPPHIRE);
		shovelShadowSteel = new ItemShovelArcadia("shovelShadowSteel", toolSHADOWSTEEL);
		
		axeSilver = new ItemAxeArcadia("axeSilver", toolSILVER);
		axeBronze = new ItemAxeArcadia("axeBronze", toolBRONZE);
		axeRuby = new ItemAxeArcadia("axeRuby", toolRUBY);
		axeSapphire = new ItemAxeArcadia("axeSapphire", toolSAPPHIRE);
		axeShadowSteel = new ItemAxeArcadia("axeShadowSteel", toolSHADOWSTEEL);
		
		hoeSilver = new ItemHoeArcadia("hoeSilver", toolSILVER);
		hoeBronze = new ItemHoeArcadia("hoeBronze", toolBRONZE);
		hoeRuby = new ItemHoeArcadia("hoeRuby", toolRUBY);
		hoeSapphire = new ItemHoeArcadia("hoeSapphire", toolSAPPHIRE);
		hoeShadowSteel = new ItemHoeArcadia("hoeShadowSteel", toolSHADOWSTEEL);
		
		shearsSilver = new ItemShearsArcadia("shearsSilver", toolSILVER);
		shearsBronze = new ItemShearsArcadia("shearsBronze", toolBRONZE);
		shearsRuby = new ItemShearsArcadia("shearsRuby", toolRUBY);
		shearsSapphire = new ItemShearsArcadia("shearsSapphire", toolSAPPHIRE);
		shearsShadowSteel = new ItemShearsArcadia("shearsShadowSteel", toolSHADOWSTEEL);
		
		helmetSilver = new ItemArmorArcadia("helmetSilver", armorSILVER, "silver", 0);
		helmetBronze = new ItemArmorArcadia("helmetBronze", armorBRONZE, "bronze", 0);
		helmetRuby = new ItemArmorArcadia("helmetRuby", armorRUBY, "ruby", 0);
		helmetSapphire = new ItemArmorArcadia("helmetSapphire", armorSAPPHIRE, "sapphire", 0);
		helmetShadowSteel = new ItemArmorArcadia("helmetShadowSteel", armorSHADOWSTEEL, "shadowsteel", 0);
		
		chestplateSilver = new ItemArmorArcadia("chestplateSilver", armorSILVER, "silver", 1);
		chestplateBronze = new ItemArmorArcadia("chestplateBronze", armorBRONZE, "bronze", 1);
		chestplateRuby = new ItemArmorArcadia("chestplateRuby", armorRUBY, "ruby", 1);
		chestplateSapphire = new ItemArmorArcadia("chestplateSapphire", armorSAPPHIRE, "sapphire", 1);
		chestplateShadowSteel = new ItemArmorArcadia("chestplateShadowSteel", armorSHADOWSTEEL, "shadowsteel", 1);
		
		leggingsSilver = new ItemArmorArcadia("leggingsSilver", armorSILVER, "silver", 2);
		leggingsBronze = new ItemArmorArcadia("leggingsBronze", armorBRONZE, "bronze", 2);
		leggingsRuby = new ItemArmorSpeedArcadia("leggingsRuby", armorRUBY, "ruby", 2);
		leggingsSapphire = new ItemArmorArcadia("leggingsSapphire", armorSAPPHIRE, "sapphire", 2);
		leggingsShadowSteel = new ItemArmorArcadia("leggingsShadowSteel", armorSHADOWSTEEL, "shadowsteel", 2);
		
		bootsSilver = new ItemArmorArcadia("bootsSilver", armorSILVER, "silver", 3);
		bootsBronze = new ItemArmorArcadia("bootsBronze", armorBRONZE, "bronze", 3);
		bootsRuby = new ItemArmorArcadia("bootsRuby", armorRUBY, "ruby", 3);
		bootsSapphire = new ItemArmorArcadia("bootsSapphire", armorSAPPHIRE, "sapphire", 3);
		bootsShadowSteel = new ItemArmorArcadia("bootsShadowSteel", armorSHADOWSTEEL, "shadowsteel", 3);
		
		epicWeaponRuby = new ItemEpicWeaponArcadia("epicWeaponRuby", toolRUBY);
		epicWeaponSapphire = new ItemEpicWeaponArcadia("epicWeaponSapphire", toolSAPPHIRE);
		epicWeaponShadowSteel = new ItemEpicWeaponArcadia("epicWeaponShadowSteel", toolSHADOWSTEEL);
		
	}
}