class ChargingStation {

    static int totalStations = 0;
    static double electricityRate = 8.5;

    int stationId;
    double unitsConsumed;

    ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println(
                "Station: " + stationId +
                        ", Units: " + unitsConsumed +
                        ", Bill: " + calculateBill());
    }

    public static void main(String[] args) {

        ChargingStation[] stations = {
                new ChargingStation(1,100),
                new ChargingStation(2,150),
                new ChargingStation(3,200),
                new ChargingStation(4,250),
                new ChargingStation(5,300)
        };

        for(ChargingStation s : stations)
            s.displayStationDetails();

        System.out.println("Total Stations = " + totalStations);

        electricityRate = 10;

        System.out.println("\nAfter Rate Change\n");

        for(ChargingStation s : stations)
            s.displayStationDetails();
    }
}