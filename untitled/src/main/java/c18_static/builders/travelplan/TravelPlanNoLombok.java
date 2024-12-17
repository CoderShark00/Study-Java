package c18_static.builders.travelplan;

import lombok.Builder;

public class TravelPlanNoLombok {

    private final String destination;
    private final String departureDate;

    private String returnDate;
    private int numberOfTravelers;
    private String hotelName;
    private String flightNumber;

    private TravelPlanNoLombok(Builder builder) {
        this.destination = builder.destination;
        this.departureDate = builder.departureDate;
        this.returnDate = builder.returnDate;
        this.numberOfTravelers = builder.numberOfTravelers;
        this.hotelName = builder.hotelName;
        this.flightNumber = builder.flightNumber;
    }

    public static class Builder {
        private final String destination;
        private final String departureDate;

        private String returnDate;
        private int numberOfTravelers;
        private String hotelName;
        private String flightNumber;

        public Builder(String destination, String departureDate) {
            this.destination = destination;
            this.departureDate = departureDate;
        }

        public Builder returnDate(String returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public Builder numberOfTravelers(int numberOfTravelers) {
            this.numberOfTravelers = numberOfTravelers;
            return this;
        }
        public Builder hotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public Builder flightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }
        public TravelPlanNoLombok build() {
            return new TravelPlanNoLombok(this);
        }
    }
}
