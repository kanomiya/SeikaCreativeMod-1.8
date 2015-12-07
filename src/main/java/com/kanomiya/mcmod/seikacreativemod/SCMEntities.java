package com.kanomiya.mcmod.seikacreativemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.kanomiya.mcmod.kanomiyacore.KanomiyaCore;
import com.kanomiya.mcmod.seikacreativemod.entity.EntitySandBag;
import com.kanomiya.mcmod.seikacreativemod.render.RenderSandBag;

public class SCMEntities {

	public static void preInit(FMLPreInitializationEvent event, KanomiyaCore core) {
		EntityRegistry.registerModEntity(EntitySandBag.class, "entitySandBag", 0, core.getModInstance(), 0, 1, false, 0xD48842, 0xDE9D68);

	}

	public static void init(FMLInitializationEvent event, KanomiyaCore core) {
		if (event.getSide().isClient()) {
			RenderManager manager = Minecraft.getMinecraft().getRenderManager();
			if (manager == null)  throw new RuntimeException("[NULL] Minecraft.getMinecraft().getRenderManager() is null. registerRenderer can't continue.");

			RenderingRegistry.registerEntityRenderingHandler(EntitySandBag.class, new RenderSandBag(manager));

		}

	}

	public static void postInit(FMLPostInitializationEvent event, KanomiyaCore core) {  }


}
