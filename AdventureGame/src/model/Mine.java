package model;

public class Mine extends BattleLocation{
    public Mine(Player player) {
        super(player, "Mine", new Snake(), "random", 5, 6);
    }
}