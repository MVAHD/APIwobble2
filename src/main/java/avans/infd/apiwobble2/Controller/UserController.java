package avans.infd.apiwobble2.Controller;

import avans.infd.apiwobble2.Domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping(path = "api/user")
public class UserController {
    User user1 = new User("Aukeis", LocalDate.of(2000, 8, 2));
    User user2 = new User("Aukas", LocalDate.of(1999, 6, 2));
    User user3 = new User("Akusse", LocalDate.of(1998, 1, 2));
    User user4 = new User("Okiese", LocalDate.of(1997, 12, 2));
    User user5 = new User("Eukaise", LocalDate.of(1996, 11, 2));

    @GetMapping(path = "list")
    public List<User> getAllUsers(){
        return List.of(user1, user2, user3, user4, user5);
    }
}
