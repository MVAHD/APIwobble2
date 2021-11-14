package avans.infd.apiwobble2.Domain;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

//Makes type of object of Car
@Entity
@NoArgsConstructor
public class FCEV extends Car{
    //Declaration
    private final String type;

    //Initialisation
    {
        type = "Fuel Cell Electric Vehicle";
    }

    //Constructors
    public FCEV(String licensePlate, String color) {
        super(licensePlate, color);
    }

    //Getters and Setters
    public String getType() {
        return type;
    }
}
