package avans.infd.apiwobble2;

import avans.infd.apiwobble2.Domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiWobble2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void instantiateUserGetUserAge_expectNotNull() {
        User user = new User("test", LocalDate.parse("01-01-1990"));
        assertNotNull(user.getAge());
    }

    @Test
    public void instantiateTwoUsersWithSameBirthDate_expectTrue() {
        User user1 = new User("test1", LocalDate.parse("01-01-1995"));
        User user2 = new User("test1", LocalDate.parse("01-01-1995"));
        assertEquals(user1.getAge(), user2.getAge());
    }

    @Test
    public void whenBlankName_thenOneConstraintViolation() {
        // - todo - add test for constraint violation
        User user = new User("", LocalDate.parse("01-01-1990"));
    }

}
