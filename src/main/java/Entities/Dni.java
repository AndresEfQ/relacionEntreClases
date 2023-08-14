package Entities;

public class Dni {
    private char series;
    private int number;

    public Dni(char series, int number) {
        this.series = series;
        this.number = number;
    }

    public Dni() {
    }

    public char getSeries() {
        return series;
    }

    public void setSeries(char series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
