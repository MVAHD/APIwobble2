package avans.infd.apiwobble2.Service;

import avans.infd.apiwobble2.Domain.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    User user1 = new User("Aukeis", LocalDate.of(2000, 8, 2));
    User user2 = new User("Aukas", LocalDate.of(1999, 6, 2));
    User user3 = new User("Akusse", LocalDate.of(1998, 1, 2));
    User user4 = new User("Okiese", LocalDate.of(1997, 12, 2));
    User user5 = new User("Eukaise", LocalDate.of(1996, 11, 2));

    public List<User> getAllUsers() {
        return List.of(user1, user2, user3, user4, user5);
    }

}
