
import Transport.Drivers.*;
import Transport.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Mechanic<Car> lev = new Mechanic<Car>("Лев", "Тонкий", "Тонкий-Толстый");
        Mechanic<Transport> tor = new Mechanic<Transport>("Тор", "Щекоткин", "Левый-Правый");
        Sponsor castrol = new Sponsor("Кастрол", 3_000_000);
        Sponsor pirelli = new Sponsor("Пирелли", 2_000_000);

        Car car = new Car("Лада", "Веста", 1.6);
        car.addDriver(new DriverB("Петров Петр Ильич", 'B', 11, car));
        car.addMechanic(lev);
        car.addSponsor(castrol, pirelli);

        Truck truck = new Truck("Камаз", "Пушинка", 9.5);
        truck.addDriver(new DriverC("Васильев Василий Васильевич", 'C', 12, truck));
        truck.addMechanic(tor);
        truck.addSponsor(castrol);

        Bus bus = new Bus("ВолгаБус", "Воробей", 4.6);
        bus.addDriver(new DriverD("Григорьев Григорий Григорьевич", 'D', 13, bus));
        bus.addMechanic(tor);
        bus.addSponsor(pirelli);

        List<Transport> transports = List.of(car, truck, bus);

//        for (Transport transport : transports) {
//            printInfo(transport);
//        }

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(car);
        serviceStation.addTruck(truck);
        serviceStation.service();
        serviceStation.service();
    }

    private static void printInfo(Transport transport) {
        System.out.println("Информация по автотранспорту " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители:");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getDriverName());
        }
        System.out.println("Спонсоры:");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName());
        }
        System.out.println("Механики:");
        for (Mechanic<?> mechanic: transport.getMechanics()) {
            System.out.println(mechanic.getFirstName() + " " + mechanic.getLastName() + " из " + mechanic.getCompany());
        }
    }

    private static void diagnostics(Transport... transports) {
        for (int i = 0; i < transports.length; i++) {
            if (!transports[i].diagnostics()) {
                throw new RuntimeException("Автомобить " + transports[i].getBrand()
                        + " " + transports[i].getModel() + " не прошел диагностику");
            }
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}