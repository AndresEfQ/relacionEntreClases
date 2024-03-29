package Entities;

public class Player {
    private String firstName;
    private String lastName;
    private String position;
    private int number;

    public Player() {
    }

    public Player(String firstName, String lastName, String position, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
