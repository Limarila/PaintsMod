package com.limarila.paints.registry;

import com.limarila.paints.Paints;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {
    public static final Block PINK_OAK_PLANKS = new Block(FabricBlockSettings
        .of(Material.WOOD)
        .breakByHand(true)
        .breakByTool(FabricToolTags.AXES)
        .strength(2.0f, 15.0f)
        .sounds(BlockSoundGroup.WOOD));

    public static final Block BLACK_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block BLUE_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block BROWN_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block CYAN_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block GRAY_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block GREEN_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block LIGHT_BLUE_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block LIGHT_GRAY_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block LIME_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block MAGENTA_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block ORANGE_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block PURPLE_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block RED_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block WHITE_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));
    public static final Block YELLOW_OAK_PLANKS = new Block(FabricBlockSettings.copy(ModBlocks.PINK_OAK_PLANKS));


    public static void registerItems() {
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "pink_oak_planks"), PINK_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "black_oak_planks"), BLACK_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "blue_oak_planks"), BLUE_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "brown_oak_planks"), BROWN_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "cyan_oak_planks"), CYAN_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "gray_oak_planks"), GRAY_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "green_oak_planks"), GREEN_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "light_blue_oak_planks"), LIGHT_BLUE_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "light_gray_oak_planks"), LIGHT_GRAY_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "lime_oak_planks"), LIME_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "magenta_oak_planks"), MAGENTA_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "orange_oak_planks"), ORANGE_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "purple_oak_planks"), PURPLE_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "red_oak_planks"), RED_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "white_oak_planks"), WHITE_OAK_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Paints.MOD_ID, "yellow_oak_planks"), YELLOW_OAK_PLANKS);
    }
}
