import java.util.Scanner;

class TravelComputationInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name, fromCity, viaCity, toCity;
        double distanceFromToVia, distanceViaToFinalCity;
        int timeFromToVia, timeViaToFinalCity;

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter from city: ");
        fromCity = sc.nextLine();

        System.out.print("Enter via city: ");
        viaCity = sc.nextLine();

        System.out.print("Enter destination city: ");
        toCity = sc.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (km): ");
        distanceFromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (km): ");
        distanceViaToFinalCity = sc.nextDouble();

        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (minutes): ");
        timeFromToVia = sc.nextInt();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " (minutes): ");
        timeViaToFinalCity = sc.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from "
                + fromCity + " to " + toCity + " via " + viaCity + " is "
                + totalDistance + " km and the Total Time taken is "
                + totalTime + " minutes");
    }
}