package avans.infd.apiwobble2.Controller;

import avans.infd.apiwobble2.Domain.Car;
import avans.infd.apiwobble2.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Car controller layer of the APIwobble.
@RestController
@RequestMapping(path = "api/car")
public class CarController {
    private final CarService service;

    //Connect automatically to the Car service layer.
    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    //Get the list of cars of the selected pool from the service.
    @GetMapping(path = "pool")
    public List<Car> getPoolCars(){
        return service.getPoolCars();
    }

}
