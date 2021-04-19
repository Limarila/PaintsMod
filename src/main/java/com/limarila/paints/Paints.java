package com.limarila.paints;

import com.limarila.paints.registry.ModBlocks;
import com.limarila.paints.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Paints implements ModInitializer {

    public static final String MOD_ID = "paints";

    @Override
    public void onInitialize(){
        ModItems.registerItems();
        ModBlocks.registerItems();
    }
}
