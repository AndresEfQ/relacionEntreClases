import Entities.Dog;
import Entities.Person;
import Entities.Player;
import Entities.Team;
import Enumeraciones.Race;
import Enumeraciones.Size;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // Guide exercise 2
        Player player1 = new Player("Andres", "Quintero", "GoalKeeper", 1);
        Player player2 = new Player("Ricardo", "Sierra", "Defense right", 5);
        Player player3 = new Player("Edwin", "Marin", "Defense left", 7);
        Player player4 = new Player("Luis", "Vasco", "Middle", 10);
        Player player5 = new Player("Luis", "Soto", "Attack left", 13);
        Player player6 = new Player("Diego", "Ospina", "Attack right", 1);

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);

        Team theBest = new Team(players);

        // Enum video
        String razaInput = "BEAGLE";
        for (Race race : Race.values()) {

            if (race.toString().equals(razaInput)) {
                System.out.println("Raza input es igual al enum " + race);
            }
        }

        // Exercise 1
        Dog d1 = new Dog();
        d1.setName("Pelucita");
        d1.setAge(5);
        d1.setRace(Race.FRENCH_PUDDLE);
        d1.setSize(Size.SMALL);

        System.out.println(d1);

        Person p1 = new Person();
        p1.setFirstName("Andrés");
        p1.setLastName("Quintero");
        p1.setAge(35);
        p1.setDocument(1036930798);
        p1.setDog(d1);

        Dog d2 = new Dog();
        d2.setName("Petete");
        d2.setAge(2);
        d2.setRace(Race.CRIOLLO);
        d2.setSize(Size.SMALL);

        Person p2 = new Person();
        p2.setFirstName("Carol");
        p2.setLastName("Vélez");
        p2.setAge(37);
        p2.setDocument(1037575311);
        p2.setDog(d2);

        System.out.println("Perro persona1 = " + p1.getDog());
        System.out.println("Persona 1 = " + p1);
        System.out.println("Perro persona2 = " + p2.getDog());
        System.out.println("Persona 2 = " + p2);

    }
}
