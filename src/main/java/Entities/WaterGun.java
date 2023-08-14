package Entities;

public class WaterGun {
    private int currentPosition;
    private int waterPosition;

    public WaterGun() {
        fillWaterGun();
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(int waterPosition) {
        this.waterPosition = waterPosition;
    }

    public void fillWaterGun() {
        setWaterPosition((int) (Math.random() * 6) + 1);
        setCurrentPosition((int) (Math.random() * 6) + 1);
    }

    public boolean fireGun() {
        return getCurrentPosition() == getWaterPosition();
    }

    public void nextStream() {
        if (getCurrentPosition() == 6) {
            setCurrentPosition(1);
        } else {
            setCurrentPosition(getCurrentPosition() + 1);
        }
    }

    @Override
    public String toString() {
        return "Current Position = " + getCurrentPosition() +
                "\nWater Position = " + getWaterPosition();
    }
}
