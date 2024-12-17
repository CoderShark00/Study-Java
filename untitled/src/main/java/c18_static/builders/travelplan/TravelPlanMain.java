package c18_static.builders.travelplan;

public class TravelPlanMain {
    public static void main(String[] args) {
        TravelPlan travelPlan1 = TravelPlan.builder()
                .destination("파리")
                .departureDate("2024-12-17")
                .returnDate("2024-12-26")
                .numberOdTravelers(2)
                .hotelName("아난티코브")
                .flightNumber("AF123")
                .build();

        System.out.println(travelPlan1);

    }
}
