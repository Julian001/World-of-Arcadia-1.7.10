package com.julian001.arcadia.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import com.julian001.arcadia.inventory.ContainerAnvilArcadia;
import com.julian001.arcadia.inventory.ContainerBagArcadia;
import com.julian001.arcadia.lib.References;

public class GuiAnvilArcadia extends GuiContainer {

	@SuppressWarnings("unused")
	private int x, y, z;
    @SuppressWarnings("unused")
	private EntityPlayer player;
    @SuppressWarnings("unused")
	private World world;
    private int xSize, ySize;
    private ResourceLocation backgroundImage = new ResourceLocation(References.ID.toLowerCase() + ":" + "textures/gui/anvil.png");
	public GuiAnvilArcadia(InventoryPlayer inventoryplayer, World world, int x, int y, int z) {
		super(new ContainerAnvilArcadia(inventoryplayer, world, x, y, z));
		this.x = x;
        this.y = y;
        this.z = z;
        //this.player = player;
        this.world = world;
        xSize = 190;
        ySize = 202;
	}
	
//	@Override
//    public void drawScreen(int mouseX, int mouseY, float renderPartialTicks) {
//        this.mc.getTextureManager().bindTexture(backgroundImage);
//        int x = (this.width - xSize) / 2;
//        int y = (this.height - ySize) / 2;
//        drawTexturedModalRect(x, y, 0, 0, xSize,  ySize);
//    }
	
	@Override
    public boolean doesGuiPauseGame() {
        return false;
    }

	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Anvil"), 8, this.ySize/2 - 114, 0x404040);
        this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 - 15, 0x404040);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		this.mc.getTextureManager().bindTexture(backgroundImage);
        int x = (this.width - xSize) / 2;
        int y = (this.height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize,  ySize);
	}
	
	public void initGui() {
		xSize = 190;
		ySize = 202;
		super.initGui();
	}
}