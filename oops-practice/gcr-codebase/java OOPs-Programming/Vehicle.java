class Vehicle {

    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for(Vehicle v : vehicles) {
            if(v.vehicleType.equalsIgnoreCase("Car"))
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for(Vehicle v : vehicles) {
            if(v.vehicleType.equalsIgnoreCase("Bike"))
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0]=new Vehicle("UP01","A","Car");
        vehicles[1]=new Vehicle("UP02","B","Bike");
        vehicles[2]=new Vehicle("UP03","C","Car");
        vehicles[3]=new Vehicle("UP04","D","Bike");
        vehicles[4]=new Vehicle("UP05","E","Car");
        vehicles[5]=new Vehicle("UP06","F","Bike");
        vehicles[6]=new Vehicle("UP07","G","Car");
        vehicles[7]=new Vehicle("UP08","H","Bike");
        vehicles[8]=new Vehicle("UP09","I","Car");
        vehicles[9]=new Vehicle("UP10","J","Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}