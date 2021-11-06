package avans.infd.apiwobble2.Domain;

import java.util.ArrayList;
import java.util.List;

//A pool to store the created cars.
public class WobblePool {
    private List<Car> wobbleCars = new ArrayList<>();

    public WobblePool() {
    }

    //Print each car of this pool to the console log.
    public void printPoolCars(){
        System.out.println("allCars in selected pool:");
        for(Car wobbleCar : wobbleCars){
            System.out.println(wobbleCar);
        }
    }

    //Add car to this pool
    public void addCar(Car car){
        //Add given object to the created list of this pool.
        wobbleCars.add(car);
    }

    //Add multipla cars to this pool
    public void addCars(Car... cars){
        //Add given objects to the created list of this pool.
        //Todo: bugFix? Arrays.asList()
        wobbleCars.addAll(List.of(cars));
    }


}
