package Entities;

public class Spectator {

    private String name;
    private int age;
    private double money;

    public Spectator() {
    }

    public Spectator(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}' + '\'';
    }
}
