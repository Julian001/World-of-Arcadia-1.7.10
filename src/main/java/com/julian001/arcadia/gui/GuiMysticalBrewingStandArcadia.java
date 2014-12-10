package com.julian001.arcadia.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import com.julian001.arcadia.inventory.ContainerMysticalBrewingStandArcadia;
import com.julian001.arcadia.lib.References;
import com.julian001.arcadia.tileentities.TileEntityMysticalBrewingStandArcadia;

public class GuiMysticalBrewingStandArcadia extends GuiContainer {

	private ResourceLocation backgroundImage = new ResourceLocation(References.ID.toLowerCase() + ":" + "textures/gui/mysticalBrewingStand.png");
	public GuiMysticalBrewingStandArcadia(InventoryPlayer inventoryplayer, World world, int x, int y, int z) {
		super(new ContainerMysticalBrewingStandArcadia(inventoryplayer, world, x, y, z));
	}

	@Override
    public boolean doesGuiPauseGame() {
        return false;
    }

	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		TileEntityMysticalBrewingStandArcadia tileEntity = ((ContainerMysticalBrewingStandArcadia) inventorySlots).tileEntity;
		String name = tileEntity.hasCustomInventoryName() ? tileEntity.getInventoryName() : StatCollector.translateToLocal(tileEntity.getInventoryName());
		this.fontRendererObj.drawString(StatCollector.translateToLocal(EnumChatFormatting.DARK_PURPLE + name),(this.xSize - fontRendererObj.getStringWidth(name))/2, this.ySize/2 - 78, 0x404040);
        this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize/2 - 10, 0x404040);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		this.mc.getTextureManager().bindTexture(backgroundImage);
        int x = (this.width - xSize) / 2;
        int y = (this.height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}

}