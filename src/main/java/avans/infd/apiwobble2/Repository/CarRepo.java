package avans.infd.apiwobble2.Repository;

import avans.infd.apiwobble2.Domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car, Long>{


}
