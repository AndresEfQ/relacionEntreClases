import Entities.Dog;
import Entities.Person;
import Entities.Player;
import Entities.Team;
import Enum.Race;
import Enum.Size;
import Services.PersonDogService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PersonDogService pss = new PersonDogService();
        pss.loadPersons(3);
        pss.loadDogs(2);
        pss.assignDogToPerson("Andres", "Quintero", "Pelucita");
        pss.assignDogToPerson("Carol", "Velez", "Killer");

        pss.showPeopleAndDogs();
    }
}
