package cloud.lagrange.assassin;

public class Config {
    public static boolean instaKill;

    public static boolean freeze;

    public static boolean compass;

    public Config(Assassin parent) {
        parent.getConfig().options().copyDefaults(true);
        parent.saveConfig();
        instaKill = (boolean) parent.getConfig(false).get("assassins-insta-kill-speedrunner");
        compass = (boolean) parent.getConfig(true).get("compass-tracking");
        freeze = (boolean) parent.getConfig(false).get("freeze-assassin-when-seen");
    }
}
