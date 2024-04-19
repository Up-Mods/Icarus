package dev.cammiescorner.icarus;

import com.teamresourceful.resourcefulconfig.common.annotations.Config;
import com.teamresourceful.resourcefulconfig.common.annotations.ConfigEntry;
import com.teamresourceful.resourcefulconfig.common.config.EntryType;
import com.teamresourceful.resourcefulconfig.web.annotations.Link;
import com.teamresourceful.resourcefulconfig.web.annotations.WebInfo;

@WebInfo(
        title = "Icarus",
        description = "Adds a bunch of colourful and unique wings.",
        links = {
                @Link(
                        value = "https://modrinth.com/mod/Dw7M6XKW",
                        icon = "modrinth",
                        title = "Modrinth"
                ),
                @Link(
                        value = "https://curseforge.com/projects/428151",
                        icon = "curseforge",
                        title = "Curseforge"
                ),
                @Link(
                        value = "https://github.com/Up-Mods/Icarus",
                        icon = "github",
                        title = "Github"
                )
        }
)
@Config(Icarus.MODID)
public final class IcarusConfig {

    @ConfigEntry(id = "can_loop_de_loop", type = EntryType.BOOLEAN, translation = "config.icarus.can_loop_de_loop")
    public static boolean canLoopDeLoop = true;
    @ConfigEntry(id = "armor_slows", type = EntryType.BOOLEAN, translation = "config.icarus.armor_slows")
    public static boolean armorSlows = true;
    @ConfigEntry(id = "can_slow_fall", type = EntryType.BOOLEAN, translation = "config.icarus.can_slow_fall")
    public static boolean canSlowFall = false;
    @ConfigEntry(id = "max_slowed_multiplier", type = EntryType.FLOAT, translation = "config.icarus.max_slowed_multiplier")
    public static float maxSlowedMultiplier = 3F;
    @ConfigEntry(id = "wings_speed", type = EntryType.FLOAT, translation = "config.icarus.wings_speed")
    public static float wingsSpeed = 0.02F;
    @ConfigEntry(id = "wings_durability", type = EntryType.INTEGER, translation = "config.icarus.wings_durability")
    public static int wingsDurability = 0;
    @ConfigEntry(id = "exhaustion_amount", type = EntryType.FLOAT, translation = "config.icarus.exhaustion_amount")
    public static float exhaustionAmount = 0.03F;
    @ConfigEntry(id = "roll_amount", type = EntryType.FLOAT, translation = "config.icarus.roll_amount")
    public static float rollAmount = 1.0F;
    @ConfigEntry(id = "max_height_enabled", type = EntryType.BOOLEAN, translation = "config.icarus.max_height_enabled")
    public static boolean maxHeightEnabled = true;
    @ConfigEntry(id = "max_height_above_world", type = EntryType.INTEGER, translation = "config.icarus.max_height_above_world")
    public static int maxHeightAboveWorld = 64;
    @ConfigEntry(id = "flying_target_radius", type = EntryType.FLOAT, translation = "config.icarus.flying_target_radius")
    public static float flyingTargetRadius = 0.25f;
}
