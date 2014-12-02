package com.julian001.arcadia.items.tools;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import com.julian001.arcadia.arcadia;

import cpw.mods.fml.common.eventhandler.Event.Result;

public class ItemOmniToolArcadia extends ItemTool {
	
	protected ItemOmniToolArcadia(float dammage, ToolMaterial material, Set<Block> blocksEffectiveAgainst) {
		super(dammage, material, blocksEffectiveAgainst );
		setCreativeTab(arcadia.tabArcadiaItems);
	}

	public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_))
        {
            return false;
        }
        else
        {
            UseHoeEvent event = new UseHoeEvent(p_77648_2_, p_77648_1_, p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_);
            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return false;
            }

            if (event.getResult() == Result.ALLOW)
            {
                p_77648_1_.damageItem(1, p_77648_2_);
                return true;
            }

            Block block = p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_);

            if (p_77648_7_ != 0 && p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir(p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) && (block == Blocks.grass || block == Blocks.dirt))
            {
                Block block1 = Blocks.farmland;
                p_77648_3_.playSoundEffect((double)((float)p_77648_4_ + 0.5F), (double)((float)p_77648_5_ + 0.5F), (double)((float)p_77648_6_ + 0.5F), block1.stepSound.getStepResourcePath(), (block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getPitch() * 0.8F);

                if (p_77648_3_.isRemote)
                {
                    return true;
                }
                else
                {
                    p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block1);
                    p_77648_1_.damageItem(1, p_77648_2_);
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }
	
	public boolean canHarvestBlock(Block par1Block, ItemStack itemStack) 
	{
		return this.canHarvestBlockA(par1Block);
	}
	
	public boolean canHarvestBlockA(Block par1Block) 
	{
		return true;
	}
//	
//	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) 
//	{
//		float dmg = 1.0F;
//		for (int i = 0; i < ItemOmniToolArcadia.blocksEffectiveAgainst.length; ++i) 
//		{
//			if (ItemOmniToolArcadia.blocksEffectiveAgainst[i] == par2Block) 
//			{
//				return this.efficiencyOnProperMaterial;
//			}
//		}
//		/*if (par1ItemStack.itemID == this.itemID)
//			dmg = 8.0F;*/Blocks
//		return dmg;
//	}
	
	@Override
    public int getHarvestLevel(ItemStack stack, String toolClass)
    {
        int level = super.getHarvestLevel(stack, toolClass);
        if (level == -1 && toolClass != null && toolClass.equals(this))
        {
            return this.toolMaterial.getHarvestLevel();
        }
        else
        {
            return level;
        }
    }
	
	@Override
    public float getDigSpeed(ItemStack stack, Block block, int meta)
    {
        if (ForgeHooks.isToolEffective(stack, block, meta))
        {
            return efficiencyOnProperMaterial;
        }
        return super.getDigSpeed(stack, block, meta);
    }
}