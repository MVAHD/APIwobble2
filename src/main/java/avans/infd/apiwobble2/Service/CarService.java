package avans.infd.apiwobble2.Service;

import avans.infd.apiwobble2.Domain.*;
import avans.infd.apiwobble2.Repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepo repo;

    @Autowired
    public CarService(CarRepo repo) {
        this.repo = repo;
    }

    //Instantiate pool
//    WobblePool poolBreda = new WobblePool();

    //Add cars to pool
    public List<Car> getPoolCars(){
        //Todo: make for pool
//        poolBreda.addCars(Car repo.findAll());
//        return poolBreda;
        return repo.findAll();
    }
}
