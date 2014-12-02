package com.julian001.arcadia.items.tools;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import com.google.common.collect.Multimap;
import com.julian001.arcadia.items.ItemArcadia;

public class ItemShearsArcadia extends ItemArcadia {

	private float damage;
	private final ToolMaterial toolMaterial;
    public ItemShearsArcadia(String name, ToolMaterial material) {
    	super(name);
    	this.toolMaterial = material;
        this.setMaxStackSize(1);
        this.setMaxDamage(material.getMaxUses());
        this.damage = 1.0F + material.getDamageVsEntity();
    }

    public boolean onBlockDestroyed(ItemStack itemStack, World world, Block block, int x, int y, int z, EntityLivingBase entityLivingBase) {
        if (block.getMaterial() != Material.leaves && block != Blocks.web && block != Blocks.tallgrass && block != Blocks.vine && block != Blocks.tripwire && !(block instanceof IShearable)) {
            return super.onBlockDestroyed(itemStack, world, block, x, y, z, entityLivingBase);
        }
        else {
            return true;
        }
    }

    public boolean func_150897_b(Block block) {
        return block == Blocks.web || block == Blocks.redstone_wire || block == Blocks.tripwire;
    }

    public float func_150893_a(ItemStack itemStack, Block block)
    {
        return block != Blocks.web && block.getMaterial() != Material.leaves ? (block == Blocks.wool ? toolMaterial.getEfficiencyOnProperMaterial() : super.func_150893_a(itemStack, block)) : 15.0F;
    }
    
    public float func_150931_i()
    {
        return this.toolMaterial.getDamageVsEntity();
    }

    /**
     * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
     */
    public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.damage, 0));
        return multimap;
    }
    
    /**
     * Returns true if the item can be used on the given entity, e.g. shears on sheep.
     */
    @Override
    public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase entity)
    {
        if (entity.worldObj.isRemote)
        {
            return false;
        }
        if (entity instanceof IShearable)
        {
            IShearable target = (IShearable)entity;
            if (target.isShearable(itemstack, entity.worldObj, (int)entity.posX, (int)entity.posY, (int)entity.posZ))
            {
                ArrayList<ItemStack> drops = target.onSheared(itemstack, entity.worldObj, (int)entity.posX, (int)entity.posY, (int)entity.posZ,
                        EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, itemstack));

                Random rand = new Random();
                for(ItemStack stack : drops)
                {
                    EntityItem ent = entity.entityDropItem(stack, 1.0F);
                    ent.motionY += rand.nextFloat() * 0.05F;
                    ent.motionX += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
                    ent.motionZ += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
                }
                itemstack.damageItem(1, entity);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer player)
    {
        if (player.worldObj.isRemote)
        {
            return false;
        }
        Block block = player.worldObj.getBlock(x, y, z);
        if (block instanceof IShearable)
        {
            IShearable target = (IShearable)block;
            if (target.isShearable(itemstack, player.worldObj, x, y, z))
            {
                ArrayList<ItemStack> drops = target.onSheared(itemstack, player.worldObj, x, y, z,
                        EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, itemstack));
                Random rand = new Random();

                for(ItemStack stack : drops)
                {
                    float f = 0.7F;
                    double d  = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                    double d1 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                    double d2 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                    EntityItem entityitem = new EntityItem(player.worldObj, (double)x + d, (double)y + d1, (double)z + d2, stack);
                    entityitem.delayBeforeCanPickup = 10;
                    player.worldObj.spawnEntityInWorld(entityitem);
                }

                itemstack.damageItem(1, player);
                player.addStat(StatList.mineBlockStatArray[Block.getIdFromBlock(block)], 1);
            }
        }
        return false;
    }
}