import Entities.Cinema;
import Entities.Film;
import Entities.Spectator;

import java.util.ArrayList;

public class CinemaMain {

    public static void main(String[] args) {

        ArrayList<Spectator> spectators = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            spectators.add(new Spectator(
                    String.valueOf(i),
                    (int) (Math.random() * 99),
                    Math.random() * 100
            ));
        }

        Film film = new Film("Harry Potter and the Half Blood Prince", 210, 16, "David Yates");
        Cinema cinema = new Cinema(film, 25.63);

        cinema.sellTickets(spectators);
        System.out.println(cinema.getScreenRoom());
        System.out.println(spectators);
    }
}
