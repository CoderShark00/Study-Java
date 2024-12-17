package c18_static.builders.travelplan;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class TravelPlan {
    private String destination;
    private String departureDate;
    private String returnDate;
    private int numberOdTravelers;
    private String hotelName;
    private String flightNumber;
}
