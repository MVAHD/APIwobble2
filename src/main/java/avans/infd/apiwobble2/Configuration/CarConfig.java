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
    //Todo: make english. And fix return.
    @Bean//Geeft aan aan de repo dat dit een entity is. een stukje code wat je makkelijk kan implementeren.
    //Dit is een functie die stand-allone kan runnen. Het is een springboot interface
    // en wordt automatisch uitgevoerd naa het laden van de applicatie
    // en geeft de vrijheid om een functie uit tevoeren?
    CommandLineRunner insertTestCars(CarRepo carRepo){
        //Een vrije functie zonder gevolgen.
        return args -> {
            //Maar hier zit wel een fout in.
            Car car1 = new ICE("05KSN7", "Metalic");
            Car car2 = new FCEV("RS809V", "Perlmore");
            Car car3 = new ICE("9XXK14", "Blauw");
            Car car4 = new BEV("DS059T", "Black");
            Car car5 = new BEV();

            carRepo.saveAll(
                    List.of(car1, car2, car3, car4)
            );
        };
//        return args -> {};
    }

}
