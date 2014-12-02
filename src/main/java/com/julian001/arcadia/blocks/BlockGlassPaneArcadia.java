package com.julian001.arcadia.blocks;

import java.util.Random;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

import com.julian001.arcadia.arcadia;
import com.julian001.arcadia.lib.References;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGlassPaneArcadia extends BlockPane {
    @SideOnly(Side.CLIENT)
    private IIcon field_150102_N;
    

    public BlockGlassPaneArcadia(String name, String blockTexture, boolean droped) {
        super(name, blockTexture, Material.glass, droped);
        setStepSound(soundTypeGlass);
        setCreativeTab(arcadia.tabArcadiaBlocks);
		setBlockName(References.ID + "_" + name);
		//setBlockTextureName(References.ID + ":" + name);
		GameRegistry.registerBlock(this, name);
    }

    public int quantityDropped(Random random) {
        return 0;
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        //return this.blockMaterial == Material.glass ? 41 : 18; Render
    	return 18;
    }

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess blockacces, int i, int j, int k, int l)
    {
        return blockacces.getBlock(i, j, k) == this ? false : super.shouldSideBeRendered(blockacces, i, j, k, l);
    }

//    @Override
//    public final boolean canPaneConnectToBlock(Block block)
//    {
//        return block.func_149730_j() || block == this || block == Blocks.glass || block == Blocks.stained_glass || block == Blocks.stained_glass_pane || block instanceof BlockGlassPaneArcadia;
//    }
    
    protected boolean canSilkHarvest()
    {
        return true;
    }

    public boolean canPaneConnectTo(IBlockAccess world, int x, int y, int z, ForgeDirection dir)
    {
        return canPaneConnectToBlock(world.getBlock(x, y, z)) || 
                world.isSideSolid(x, y, z, dir.getOpposite(), false);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister)
    {
//        this.icons = new IIcon[textureNames.length];
//        this.sideIcons = new IIcon[textureNames.length];
//
//        for (int i = 0; i < this.icons.length; ++i)
//        {
//            this.icons[i] = iconRegister.registerIcon("tinker:" + folder + textureNames[i]);
//            this.sideIcons[i] = iconRegister.registerIcon("tinker:" + folder + textureNames[i] + "_side");
//        }
    	iconRegister.registerIcon(References.ID + ":" + textureName);
    }
}