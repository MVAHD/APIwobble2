package avans.infd.apiwobble2.Configuration;

import avans.infd.apiwobble2.Domain.User;
import avans.infd.apiwobble2.Repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(25);
    }

    @Bean
    CommandLineRunner insertTestUsers(UserRepo userRepo) {
        return args -> {
            User user1 = new User("Aukeis", LocalDate.of(2000, 8, 2));
            User user2 = new User("Aukas", LocalDate.of(1999, 6, 2));
            User user3 = new User("Akusse", LocalDate.of(1998, 1, 2));
            User user4 = new User("Okiese", LocalDate.of(1997, 12, 2));
            User user5 = new User("Eukaise", LocalDate.of(1996, 11, 2));

            userRepo.saveAll(
                    List.of(user1, user2, user3, user4, user5)
            );
        };
    }

}
