package Transport.Drivers;

import Transport.Bus;


public class DriverD extends Driver<Bus> {
    public DriverD(String driverName, char driverLicense, int drivingExperience, Bus car) {
        super(driverName, 'D', drivingExperience, car);
    }
}
