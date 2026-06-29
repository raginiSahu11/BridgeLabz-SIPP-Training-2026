abstract class Vehicle {
    public abstract double fuelCost(double km);
}

class Car extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 6.0;
    }
}

class Bus extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 12.0;
    }
}

class Bike extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 2.5;
    }
}

// Added later without modifying existing classes
class ElectricCar extends Vehicle {
    @Override
    public double fuelCost(double km) {
        return km * 1.2;
    }
}

public class TransportCompany {
    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        double km = 100;

        for (Vehicle v : fleet) {
            System.out.println(
                    v.getClass().getSimpleName() +
                            " Fuel Cost: ₹" +
                            v.fuelCost(km)
            );

            // instanceof before casting
            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println(" -> This is a Car");
            } else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println(" -> This is a Bus");
            } else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println(" -> This is a Bike");
            } else if (v instanceof ElectricCar) {
                ElectricCar ec = (ElectricCar) v;
                System.out.println(" -> This is an ElectricCar");
            }
        }
    }
}