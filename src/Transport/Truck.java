package Transport;

public class Truck extends Transport implements Competing, com.sun.jdi.connect.Transport {
    public Truck(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public boolean diagnostics() {
        return Math.random() > 0.6;
    }

    @Override
    public String pitStop() {
        return "Заезжаю на Пит-Стор";
    }

    @Override
    public String bestLapTime() {
        return "Лучшее время круга - " + getBestLapTime();
    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость - " + getMaxSpeed();
    }

    @Override
    public String name() {
        return null;
    }

    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен.");
    }
}
