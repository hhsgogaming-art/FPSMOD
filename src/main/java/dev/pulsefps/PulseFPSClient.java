package dev.pulsefps;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Minimal client entrypoint. Intentionally avoids mixins and renderer hooks
 * so it does not interfere with Sodium or alter PvP/gameplay behavior.
 */
public final class PulseFPSClient implements ClientModInitializer {
    public static final String MOD_ID = "pulsefps";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("PulseFPS loaded. Safe starter mode enabled; no combat or renderer hooks are active.");
    }
}
