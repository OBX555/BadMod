package net.mcreator.badmod.configuration;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ServerConfigConfiguration {
	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final ModConfigSpec SPEC;
	static {

		SPEC = BUILDER.build();
	}

}
