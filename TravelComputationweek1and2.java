// Create TravelComputation Class to compute the Distance and Travel Time

class TravelComputation {

    public static void main(String[] args) {

        // Create a variable name to indicate the person traveling
        String name = "Eric";

        // Cities
        String fromCity = "Chennai";
        String viaCity = "Vellore";
        String toCity = "Bangalore";

        // Distance from fromCity to viaCity
        double distanceFromToVia = 156.6;

        // Time from fromCity to viaCity (in minutes)
        int timeFromToVia = 4 * 60 + 4;

        // Distance from viaCity to final city
        double distanceViaToFinalCity = 211.8;

        // Time from viaCity to final city (in minutes)
        int timeViaToFinalCity = 4 * 60 + 25;

        // Total distance
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Total time
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print travel details
        System.out.println(
            "The Total Distance travelled by " + name +
            " from " + fromCity +
            " to " + toCity +
            " via " + viaCity +
            " is " + totalDistance + " km and the Total Time taken is "
            + totalTime + " minutes"
        );
    }
}