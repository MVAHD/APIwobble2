package avans.infd.apiwobble2.Domain;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

//Makes type of object of Car
@Entity
@NoArgsConstructor
public class BEV extends Car{
    //Declaration
    private final String type;

    //Initialisation
    {
        type = "Battery Electric Vehicle";
    }

    //Constructors
    public BEV(String licensePlate, String color) {
        super(licensePlate, color);
    }

    //Getters and Setters
    public String getType() {
        return type;
    }
}
