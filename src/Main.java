import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        VehicleInfo vehicleInfo = new VehicleInfo();

        System.out.println("Please provide the following information on your car:");
        System.out.println("VIN (Vehicle Information Number: ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        //set userInput to int
        int userInputVIN = Integer.parseInt(userInput);
        vehicleInfo.setVIN(userInputVIN);

        System.out.println("Engine size (in Liters): ");
        userInput = scanner.nextLine();
        double userEngineSizeInLiters = Double.parseDouble(userInput);
        vehicleInfo.setEngineSizeInLiters(userEngineSizeInLiters);


        System.out.println("Odometer at your last oil change: ");
        userInput = scanner.nextLine();
        double userInputOdometerAtLastOilChange = Double.parseDouble(userInput);
        vehicleInfo.setOdometerAtLastOilChange(userInputOdometerAtLastOilChange);


        System.out.println("Miles traveled: ");
        userInput = scanner.nextLine();
        double userMilesTraveled = Double.parseDouble(userInput);
        vehicleInfo.setMilesTraveled(userMilesTraveled);

        System.out.println("Gallons of gas consumed: ");
        userInput = scanner.nextLine();
        double userGasConsumed = Double.parseDouble(userInput);
        vehicleInfo.setGasConsumed(userGasConsumed);

        TelematicsService.report(vehicleInfo);

    }
}
