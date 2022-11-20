package Transport;

public class Bus extends Transport implements Competing, com.sun.jdi.connect.Transport {

    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public boolean diagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
        return true;
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
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен.");
    }
}
