package Entities;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int document;
    private Dog dog;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, int document, Dog dog) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.document = document;
        this.dog = dog;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", document=" + document +
                ", dog=" + dog +
                '}';
    }
}
