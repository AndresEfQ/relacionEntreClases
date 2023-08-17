package Entities;

import java.util.ArrayList;

public class Cinema {

    private Film film;
    private ScreenRoom screenRoom;
    private double ticketPrice;

    public Cinema() {
    }

    public Cinema(Film film, double ticketPrice) {
        this.film = film;
        this.screenRoom = new ScreenRoom();
        this.ticketPrice = ticketPrice;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public ScreenRoom getScreenRoom() {
        return screenRoom;
    }

    public void setScreenRoom(ScreenRoom screenRoom) {
        this.screenRoom = screenRoom;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void sellTickets(ArrayList<Spectator> spectators) {
        for (Spectator spectator : spectators) {
            if (spectator.getAge() < film.getMinimumAge()) {
                System.out.println("Sorry, you don't have the required age");
                continue;
            }
            if (spectator.getMoney() < ticketPrice) {
                System.out.println("Sorry, you don't have enough money");
                continue;
            }
            screenRoom.lookForSeat();
        }
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "film='" + film + '\'' +
                ", screenRoom=" + screenRoom +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
