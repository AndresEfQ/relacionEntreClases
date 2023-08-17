package Services;

import Entities.Dog;
import Entities.Person;
import Enum.Race;
import Enum.Size;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonDogService {

    ArrayList<Dog> dogs;
    ArrayList<Person> persons;
    Scanner sc;

    public PersonDogService() {
        dogs = new ArrayList<>();
        persons = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void loadPersons(int numberOfpersons) {

        for (int i = 1; i <= numberOfpersons; i++) {
            Person person = new Person();
            System.out.println("Set the person " + i + " data");

            System.out.print("First name: ");
            person.setFirstName(sc.nextLine());

            System.out.print("Last name: ");
            person.setLastName(sc.nextLine());

            System.out.print("Age: ");
            person.setAge(Integer.parseInt(sc.nextLine()));

            System.out.print("Document: ");
            person.setDocument(Integer.parseInt(sc.nextLine()));

            persons.add(person);
        }
    }

    public void loadDogs(int numberOfDogs) {

        for (int i = 1; i <= numberOfDogs; i++) {
            Dog dog = new Dog();
            System.out.println("Set de dog " + i + " data");

            System.out.print("Name: ");
            dog.setName(sc.nextLine());

            System.out.print("Race: ");
            dog.setRace(chooseRace(sc.nextLine()));

            System.out.print("Age: ");
            dog.setAge(Integer.parseInt(sc.nextLine()));

            System.out.print("Size: ");
            dog.setSize(chooseSize(sc.nextLine()));

            dogs.add(dog);
        }
    }
    
    private Race chooseRace(String race) {
        for (Race aux: Race.values()) {
            if (aux.name().equals(race)) {
                return aux;
            }
        }
        System.out.println("The race " + race + " is not an option, race will remain empty");
        return null;
    }

    private Size chooseSize(String size) {
        for (Size aux: Size.values()) {
            if (aux.name().equals(size)) {
                return aux;
            }
        }
        System.out.println("The size " + size + " is not an option, size will remain empty");
        return null;
    }

    private Person getPerson (String firstName, String lastName) {
        for (Person aux : persons) {
            if (aux.getFirstName().equals(firstName) && aux.getLastName().equals(lastName)) {
                return aux;
            }
        }
        System.out.println(firstName + " " + lastName + " is not in the system.");
        return null;
    }

    private void assignDog(Person person, String dogName) {

        Iterator<Dog> dogsIterator = dogs.iterator();
        while (dogsIterator.hasNext()) {
            Dog dog = dogsIterator.next();

            if (dog.getName().equals(dogName)) {
                dogs.remove(dog);
                person.setDog(dog);
                return;
            }
        }
        System.out.println("The dog " + dogName + " isn't available for adoption");
    }

    public void assignDogToPerson(String personFirstName, String personLastName, String dogName) {
        Person person = getPerson(personFirstName, personLastName);
        if (person == null) {
            return;
        }
        assignDog(person, dogName);
    }

    public void showPeopleAndDogs() {
        for (Person aux : persons) {
            System.out.println(aux);
        }
    }
}
