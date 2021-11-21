package avans.infd.apiwobble2;

import avans.infd.apiwobble2.Domain.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;


class ApiWobble2ApplicationTests {

    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Test
    void contextLoads() {
    }

    @Test
    public void instantiateUserGetUserAge_expectNotNull() {
        User user = new User("test", LocalDate.parse("01-01-1990", df));
        assertNotNull(user.getAge());
    }

    @Test
    public void instantiateTwoUsersWithSameBirthDate_expectTrue() {
        User user1 = new User("test1", LocalDate.parse("01-01-1995", df));
        User user2 = new User("test2", LocalDate.parse("01-01-1995", df));
        assertEquals(user1.getAge(), user2.getAge());
    }

    @Test
    public void testPassword() {
        User user = new User("", LocalDate.parse("01-01-1990", df));
        user.setPassword("thisIsTest");
    }

}
