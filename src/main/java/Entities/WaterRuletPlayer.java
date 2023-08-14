package Entities;

public class WaterRuletPlayer {

    private int id;
    private String name;
    private boolean isWet;

    public WaterRuletPlayer(int id) {
        this.id = id;
        this.name = "Player " + id;
        this.isWet = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWet() {
        return isWet;
    }

    public void setWet(boolean wet) {
        isWet = wet;
    }

    public void shoot(WaterGun waterGun) {
        if (waterGun.fireGun()) {
            setWet(true);
        }
        waterGun.nextStream();
        System.out.println(waterGun.getCurrentPosition() + " - " + waterGun.getWaterPosition());
    }
}
