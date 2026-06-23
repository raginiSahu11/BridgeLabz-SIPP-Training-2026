class Drone {

    int droneId;
    int batteryPercentage;

    static String companyName = "Sky Logistics";

    Drone(int droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        System.out.println("Drone " + droneId + " started delivery.");
    }

    void displayStatus() {
        System.out.println(
                "Drone ID: " + droneId +
                        ", Battery: " + batteryPercentage +
                        "%, Company: " + companyName);
    }

    public static void main(String[] args) {

        Drone d1 = new Drone(1, 90);
        Drone d2 = new Drone(2, 75);
        Drone d3 = new Drone(3, 60);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}