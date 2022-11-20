package Transport.Drivers;

import Transport.Car;
import com.sun.jdi.connect.Transport;

public class DriverB extends Driver<Car> implements Transport {
    public DriverB(String driverName, char driverLicense, int drivingExperience, Car car) {
        super(driverName, 'B', drivingExperience, car);
    }

    @Override
    public String name() {
        return null;
    }
}
