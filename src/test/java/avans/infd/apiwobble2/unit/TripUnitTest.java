package avans.infd.apiwobble2.unit;
import avans.infd.apiwobble2.Domain.Trip;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

public class TripUnitTest {

    @Test
    public void testCalculateTripPrice(){}

    @Test
    public void testAddMileage(){}

    // TODO - Catch exceptions
    // Test if LocalDateTime object is returned
    @Test
    public void testCreateTripAssertNotEqualAndAssertEqual(){
        // GIVEN
        Trip trip = new Trip("test", "333208");

        // WHEN
        LocalDateTime tripStartTime = trip.getTripStartTime();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTimePlusFiveMinutes = LocalDateTime.now().plusMinutes(5);

        // THEN
        assert(Duration.between(tripStartTime, localDateTime).toMillis() < 1);
        assert(Duration.between(tripStartTime, localDateTimePlusFiveMinutes).toMillis() > 299998 &&
                Duration.between(tripStartTime, localDateTimePlusFiveMinutes).toMillis() < 300003
        );
    }

    // Test if LocalDateTime object is returned
    @Test
    public void testParkCar(){}

    @Test
    public void testTripDuration(){}

}
