package org.rbh.tfcadditions.Proxy;

import com.dunk.tfc.api.Util.KeyBindings;
import team.chisel.ctmlib.CTMRenderer;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.ItemStack;
import org.rbh.tfcadditions.Blocks.BlockSetup;
import org.rbh.tfcadditions.Core.CreativeTabs;
import org.rbh.tfcadditions.Handlers.ConfigHandler;
import org.rbh.tfcadditions.Handlers.KeyBindingHandler;
import org.rbh.tfcadditions.Utility.NotEnoughItemsHandler;

/**
 * Created by raymondbh on 15.07.2015.
 */
public class ClientProxy extends CommonProxy {

    public static int CTMRendrerID;

    @Override
    public void preInit(FMLPreInitializationEvent event){
        super.preInit(event);
        registerKeys();
        registerKeyBindingHandler();
    }

    @Override
    public void Init(FMLInitializationEvent event){
        super.Init(event);

        CTMRendrerID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new CTMRenderer(CTMRendrerID));

        //if(CarpentersBlocksHandler.isLoaded())
        //    CarpentersBlocksHandler.Init();

        //Hide vanilla blocks in NEI
        if(NotEnoughItemsHandler.isLoaded() && ConfigHandler.HideNEI)
            NotEnoughItemsHandler.HideNEIItems();

        //Setup Creative Tab Icon
        ((CreativeTabs) CreativeTabs.TFCAdditions_Tab).setTabIconItemStack(new ItemStack(BlockSetup.StoneMMDent, 1, 5));
    }

    @Override
    public void postInit(FMLPostInitializationEvent event){
        super.postInit(event);
    }

    private void registerKeys() {
        KeyBindings.addKeyBinding(KeyBindingHandler.Key_PrevChiselMode);
        KeyBindings.addIsRepeating(false);
        uploadKeyBindingsToGame();
    }

    private void uploadKeyBindingsToGame()
    {
        GameSettings settings = Minecraft.getMinecraft().gameSettings;
        KeyBinding[] tfcKeyBindings = KeyBindings.gatherKeyBindings();
        KeyBinding[] allKeys = new KeyBinding[settings.keyBindings.length + tfcKeyBindings.length];
        System.arraycopy(settings.keyBindings, 0, allKeys, 0, settings.keyBindings.length);
        System.arraycopy(tfcKeyBindings, 0, allKeys, settings.keyBindings.length, tfcKeyBindings.length);
        settings.keyBindings = allKeys;
        settings.loadOptions();
    }

    private void registerKeyBindingHandler()
    {
        FMLCommonHandler.instance().bus().register(new KeyBindingHandler());
    }

}
