package io.github.plainsvillager.infinitymendingbow;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfinityMendingBow implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("infinitymendingbow");

	@Override
	public void onInitialize() {
		LOGGER.info("InfinityMendingBow mod loaded!");
	}
}
