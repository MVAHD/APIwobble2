package avans.infd.apiwobble2.Service;

import avans.infd.apiwobble2.Domain.BEV;
import avans.infd.apiwobble2.Domain.Car;
import avans.infd.apiwobble2.Domain.FCEV;
import avans.infd.apiwobble2.Domain.ICE;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    Car car1 = new ICE("05KSN7", "Metalic");
    Car car2 = new FCEV("RS809V", "Perlmore");
    Car car3 = new ICE("9XXK14", "Blauw");
    Car car4 = new BEV("DS059T", "Black");

    //Instantiate pool

    //Add cars to pool

    public List<Car> getPoolCars(){
        //Todo: make for pool
        return List.of(car1, car2, car3, car4);
    }
}
