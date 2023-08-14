import Entities.WaterGun;
import Entities.WaterRuletPlayer;
import Entities.WaterRuleteGame;

import java.util.ArrayList;
import java.util.Scanner;

public class WaterRuleteMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pleas enter how many players want to play");
        int playersNum = Integer.parseInt(sc.nextLine());


        char op;
        do {
            ArrayList<WaterRuletPlayer> players = new ArrayList<>();
            for (int i = 1; i <= playersNum; i++) {
                players.add(new WaterRuletPlayer(i));
            }
            WaterGun waterGun = new WaterGun();
            System.out.println(waterGun.getCurrentPosition() + " " + waterGun.getWaterPosition());
            WaterRuleteGame game = new WaterRuleteGame(players, waterGun);
            game.round();

            System.out.println("Do you wanna play another round? (y/n)");
            do {
                op = sc.nextLine().charAt(0);
                if (op != 'y' && op != 'n') {
                    System.out.println("Please choose 'y' or 'n'");
                }
            } while (op != 'y' && op != 'n');
        } while (op == 'y');
    }
}
