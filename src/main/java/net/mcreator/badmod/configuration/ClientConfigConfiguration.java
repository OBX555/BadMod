package net.mcreator.badmod.configuration;

public class ClientConfigConfiguration {
	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final ModConfigSpec SPEC;

	static {

		SPEC = BUILDER.build();
	}

}