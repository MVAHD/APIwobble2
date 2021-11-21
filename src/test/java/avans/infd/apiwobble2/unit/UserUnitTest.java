package avans.infd.apiwobble2.unit;

import avans.infd.apiwobble2.Domain.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserUnitTest {

    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Test
    public void instantiateUserGetUserAge_expectNotNull() {

        // GIVEN
        User user = new User("test", LocalDate.parse("01-01-1990", df));

        // WHEN
        user.getAge();

        // THEN
        assertNotNull(user.getAge());
    }

    @Test
    public void instantiateTwoUsersWithSameBirthDate_expectTrue() {

        // GIVEN
        User user1 = new User("test1", LocalDate.parse("01-01-1995", df));
        User user2 = new User("test2", LocalDate.parse("01-01-1995", df));

        // WHEN
        user1.getAge();
        user2.getAge();

        // THEN
        assertEquals(user1.getAge(), user2.getAge());
    }

    // TODO - remove?
    @Test
    public void testPassword() {
        User user = new User("", LocalDate.parse("01-01-1990", df));
        user.setPassword("thisIsTest");
    }

}
