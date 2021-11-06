package avans.infd.apiwobble2.Configuration;

import avans.infd.apiwobble2.Domain.BEV;
import avans.infd.apiwobble2.Domain.Car;
import avans.infd.apiwobble2.Domain.FCEV;
import avans.infd.apiwobble2.Domain.ICE;
import avans.infd.apiwobble2.Repository.CarRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CarConfig {

    @Bean
    CommandLineRunner commandLineRunner(CarRepo carRepo){
        return args -> {
            Car car1 = new ICE("05KSN7", "Metalic");
            Car car2 = new FCEV("RS809V", "Perlmore");
            Car car3 = new ICE("9XXK14", "Blauw");
            Car car4 = new BEV("DS059T", "Black");

            carRepo.saveAll(
                    List.of(car1, car2, car3, car4)
            );
        };
    }

}
