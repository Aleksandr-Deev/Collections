package Transport.Drivers;

import Transport.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String driverName, char driverLicense, int drivingExperience, Truck car) {
        super(driverName, 'C', drivingExperience, car);
    }
}
