package Entities;

import java.util.ArrayList;
import java.util.Iterator;

public class WaterRuleteGame {

    private ArrayList<WaterRuletPlayer> players;
    private WaterGun waterGun;

    public WaterRuleteGame(ArrayList<WaterRuletPlayer> players, WaterGun wg) {
        fillGame(players, wg);
    }

    public void fillGame(ArrayList<WaterRuletPlayer> players, WaterGun wg) {
        this.players = players;
        this.waterGun = wg;
    }

    public void round() {
        Iterator<WaterRuletPlayer> plIt = players.iterator();
        while (true) {
            if (plIt.hasNext()) {
                WaterRuletPlayer player = plIt.next();
                player.shoot(this.waterGun);

                if (player.isWet()) {
                    System.out.println(player.getName() + " got wet, ¡Game Over!");
                    return;
                }
            } else {
                plIt = players.iterator();
            }
        }
    }
}
