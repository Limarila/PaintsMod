package com.limarila.paints.registry;

import com.limarila.paints.Paints;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final BlockItem PINK_OAK_PLANKS = new BlockItem(ModBlocks.PINK_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BLACK_OAK_PLANKS = new BlockItem(ModBlocks.BLACK_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BLUE_OAK_PLANKS = new BlockItem(ModBlocks.BLUE_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BROWN_OAK_PLANKS = new BlockItem(ModBlocks.BROWN_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem CYAN_OAK_PLANKS = new BlockItem(ModBlocks.CYAN_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem GRAY_OAK_PLANKS = new BlockItem(ModBlocks.GRAY_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem GREEN_OAK_PLANKS = new BlockItem(ModBlocks.GREEN_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem LIGHT_BLUE_OAK_PLANKS = new BlockItem(ModBlocks.LIGHT_BLUE_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem LIGHT_GRAY_OAK_PLANKS = new BlockItem(ModBlocks.LIGHT_GRAY_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem LIME_OAK_PLANKS = new BlockItem(ModBlocks.LIME_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MAGENTA_OAK_PLANKS = new BlockItem(ModBlocks.MAGENTA_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ORANGE_OAK_PLANKS = new BlockItem(ModBlocks.ORANGE_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PURPLE_OAK_PLANKS = new BlockItem(ModBlocks.PURPLE_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem RED_OAK_PLANKS = new BlockItem(ModBlocks.RED_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem WHITE_OAK_PLANKS = new BlockItem(ModBlocks.WHITE_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem YELLOW_OAK_PLANKS = new BlockItem(ModBlocks.YELLOW_OAK_PLANKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "pink_oak_planks"), PINK_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "black_oak_planks"), BLACK_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "blue_oak_planks"), BLUE_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "brown_oak_planks"), BROWN_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "cyan_oak_planks"), CYAN_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "gray_oak_planks"), GRAY_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "green_oak_planks"), GREEN_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "light_blue_oak_planks"), LIGHT_BLUE_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "light_gray_oak_planks"), LIGHT_GRAY_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "lime_oak_planks"), LIME_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "magenta_oak_planks"), MAGENTA_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "orange_oak_planks"), ORANGE_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "purple_oak_planks"), PURPLE_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "red_oak_planks"), RED_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "white_oak_planks"), WHITE_OAK_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Paints.MOD_ID, "yellow_oak_planks"), YELLOW_OAK_PLANKS);
    }
}
