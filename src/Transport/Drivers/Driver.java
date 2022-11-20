package Transport.Drivers;

import com.sun.jdi.connect.Transport;

public class Driver<T extends Transport> {

    private final String driverName;
    private final char driverLicense;
    private final int drivingExperience;
    private T car;

    protected Driver(String driverName,char driverLicense, int drivingExperience, T car) {
        this.driverName = driverName;
        this.driverLicense = driverLicense;
        this.drivingExperience = drivingExperience;
        setCar(car);
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Остановились");
    }

    public void refuelCar() {
        System.out.println("Пора заправиться");
    }

    public void setCar(T car) {
        if (car == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        this.car = car;
    }

    public String getDriverName() {
        return driverName;
    }

    public char getDriverLicense() {
        return driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }
}
