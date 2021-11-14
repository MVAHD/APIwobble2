package avans.infd.apiwobble2;

import avans.infd.apiwobble2.Domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

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

}
