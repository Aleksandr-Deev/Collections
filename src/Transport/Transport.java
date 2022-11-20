package Transport;

import Transport.Drivers.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineCapacity;
    private double bestLapTime;
    private double maxSpeed;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();


    public Transport(String brand, String model, double engineCapacity) {

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null && !model.isBlank() && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if (engineCapacity <= 0) {
            this.engineCapacity = 0;
        } else {
            this.engineCapacity = engineCapacity;
        }

        setBestLapTime(bestLapTime);

        setMaxSpeed(maxSpeed);
    }

    public void start() {
        System.out.println("Начать движение");
    }

    public void finish() {
        System.out.println("Закончить движение");
    }

    public abstract boolean diagnostics();

    @Override
    public String toString() {
        return "Марка - " + this.getBrand() + ", модель - " + this.getModel() + ", объём двигателя - " + this.getEngineCapacity()
                + ", лучшее время - " + this.getBestLapTime() + ", максимальная скорость - " + this.getMaxSpeed();
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public double getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(double bestLapTime) {
        if (bestLapTime <= 0) {
            this.bestLapTime = 0;
        } else {
            this.bestLapTime = bestLapTime;
        }
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public abstract void repair();
}
