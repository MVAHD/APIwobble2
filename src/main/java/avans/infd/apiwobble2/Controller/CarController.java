package avans.infd.apiwobble2.Controller;

import avans.infd.apiwobble2.Domain.BEV;
import avans.infd.apiwobble2.Domain.Car;
import avans.infd.apiwobble2.Domain.FCEV;
import avans.infd.apiwobble2.Domain.ICE;
import avans.infd.apiwobble2.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/car")
public class CarController {
//    private CarService service;
//
//    @Autowired
//    public CarController(CarService service) {
//        this.service = service;
//    }

    Car car1 = new ICE("05KSN7", "Metalic");
    Car car2 = new FCEV("RS809V", "Perlmore");
    Car car3 = new ICE("9XXK14", "Blauw");
    Car car4 = new BEV("DS059T", "Black");

    //Instantiate pool

    //Add cars to pool

    @GetMapping(path = "pool")
    public List<Car> getPoolCars(){
        //Todo: make for pool
        return List.of(car1, car2, car3, car4);
    }
}
