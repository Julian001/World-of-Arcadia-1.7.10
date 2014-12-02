package com.julian001.arcadia.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.julian001.arcadia.inventory.ContainerBagArcadia;
import com.julian001.arcadia.inventory.InventoryBagArcadia;
import com.julian001.arcadia.lib.References;

public class GuiBagArcadia extends GuiContainer {

	private static ResourceLocation guiSmall = new ResourceLocation(References.ID, "textures/gui/bagSmall.png");
	private static ResourceLocation guiMedium = new ResourceLocation(References.ID, "textures/gui/bagMedium.png");
	private static ResourceLocation guiLarge = new ResourceLocation(References.ID, "textures/gui/bagLarge.png");
	private float mouseX;
	private float mouseY;
	public GuiBagArcadia(Container container) {
		super(container);
	}
	
	public void drawScreen(int par1, int par2, float par3) {
	         super.drawScreen(par1, par2, par3);
	         this.mouseX = (float)par1;
	         this.mouseY = (float)par2;
	}

	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
	         InventoryBagArcadia inventoryBagArcadia = ((ContainerBagArcadia) inventorySlots).inventoryBagArcadia;
	         String s = inventoryBagArcadia.hasCustomInventoryName() ? inventoryBagArcadia.getInventoryName() : I18n.format(inventoryBagArcadia.getInventoryName());
	         this.fontRendererObj.drawString(s, this.xSize / 2, 0, 0x404040);
	         this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, 102, 0x404040);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        switch(((ContainerBagArcadia) inventorySlots).inventoryBagArcadia.getSizeInventory()) {
        	case 9: this.mc.renderEngine.bindTexture(guiSmall); break;
        	case 27: this.mc.renderEngine.bindTexture(guiMedium); break;
        	case 54: this.mc.renderEngine.bindTexture(guiLarge); break;
        	//default: this.mc.renderEngine.bindTexture(guiSmall);
        }
		
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        
        //drawPlayerModel(k + 51, l + 75, 30, (float)(k + 51) - this.xSize_lo, (float)(l + 75 - 50) - this.ySize_lo, this.mc.thePlayer);
        drawPlayerModel(k - 21, l + 135 - 58, 30, (float)(k + 51) - this.mouseX, (float)(l + 75 - 50) - this.mouseY, this.mc.thePlayer);
	}
	
	@Override
	public void initGui() {
		if(((ContainerBagArcadia) inventorySlots).inventoryBagArcadia.getSizeInventory() == 54) {
			xSize = 176;
			ySize = 222;
		}
		super.initGui();
	}
	
	public static void drawPlayerModel(int par0, int par1, int par2, float par3, float par4, EntityLivingBase par5EntityLivingBase){
		GL11.glEnable(GL11.GL_COLOR_MATERIAL);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par0, (float)par1, 50.0F);
        GL11.glScalef((float)(-par2), (float)par2, (float)par2);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        float f2 = par5EntityLivingBase.renderYawOffset;
        float f3 = par5EntityLivingBase.rotationYaw;
        float f4 = par5EntityLivingBase.rotationPitch;
        float f5 = par5EntityLivingBase.prevRotationYawHead;
        float f6 = par5EntityLivingBase.rotationYawHead;
        GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-((float)Math.atan((double)(par4 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
        par5EntityLivingBase.renderYawOffset = (float)Math.atan((double)(par3 / 40.0F)) * 20.0F;
        par5EntityLivingBase.rotationYaw = (float)Math.atan((double)(par3 / 40.0F)) * 40.0F;
        par5EntityLivingBase.rotationPitch = -((float)Math.atan((double)(par4 / 40.0F))) * 20.0F;
        par5EntityLivingBase.rotationYawHead = par5EntityLivingBase.rotationYaw;
        par5EntityLivingBase.prevRotationYawHead = par5EntityLivingBase.rotationYaw;
        GL11.glTranslatef(0.0F, par5EntityLivingBase.yOffset, 0.0F);
        RenderManager.instance.playerViewY = 180.0F;
        RenderManager.instance.renderEntityWithPosYaw(par5EntityLivingBase, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
        par5EntityLivingBase.renderYawOffset = f2;
        par5EntityLivingBase.rotationYaw = f3;
        par5EntityLivingBase.rotationPitch = f4;
        par5EntityLivingBase.prevRotationYawHead = f5;
        par5EntityLivingBase.rotationYawHead = f6;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
	}
}