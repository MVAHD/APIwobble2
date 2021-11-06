package avans.infd.apiwobble2.Domain;

//Makes type of object of Car
public class ICE extends Car{
    //Declaration
    private final String type;

    //Initialisation
    {
        type = "Internal Combustion Engine";
    }

    //Constructors
    public ICE(String licensePlate, String color) {
        super(licensePlate, color);
    }

    //Getters and Setters
    public String getType() {
        return type;
    }
}
