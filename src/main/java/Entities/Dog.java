package Entities;

import Enum.Race;
import Enum.Size;

public class Dog {

    private String name;
    private Race race;
    private int age;
    private Size size;

    public Dog() {
    }

    public Dog(String name, Race race, int age, Size size) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "name= '" + name + "'\n";
    }
}
