package Entities;

import Enum.CinemaRow;
import Enum.CinemaColumn;

import java.util.ArrayList;

public class ScreenRoom {

    private ArrayList<CinemaChair> chairs;
    private int availableSeats;

    public ScreenRoom() {
        chairs = new ArrayList<>();
        availableSeats = 48;
        for (CinemaRow row : CinemaRow.values()) {
            for (CinemaColumn col : CinemaColumn.values()) {
                chairs.add(new CinemaChair(row, col));
            }
        }
    }

    private boolean assignSeat(int row, String col) {
        for (CinemaChair chair : chairs) {
            if (chair.getRow().getValue() == row && chair.getColumn().name().equalsIgnoreCase(col)) {
                if (chair.isOccupied()) {
                    return false;
                }
                chair.setOccupied(true);
                availableSeats -= 1;
                return true;
            }
        }
        return false;
    }

    public void lookForSeat() {
        String[] possibleCols = {"A", "B", "C", "D", "E", "F"};
        if (availableSeats == 0) {
            System.out.println("The screen room is full");
            return;
        }
        boolean assignedSeat;
        do {
            int row = (int) (Math.random() * 8) + 1;
            int colNumber = (int) (Math.random() * 6);
            String col = possibleCols[colNumber];
            assignedSeat = assignSeat(row, col);
            if (assignedSeat) {
                System.out.println("Welcome to the movie, your seat is " + row + possibleCols[colNumber]);
            }
        } while (!assignedSeat);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        for (CinemaChair chair : chairs) {
            if (counter % 6 == 0) {
                result.append("\n");
            }
            result.append(chair.toString()).append("|");
            counter++;
        }
        return result.toString();
    }
}
