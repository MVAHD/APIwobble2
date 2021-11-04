package avans.infd.apiwobble2.Domain;

import java.time.LocalDate;

public class Car {
    //Attributes
    private long id;
    private String licensePlate;
    private String brand;
    private String model;
    private String color;
    private double value;
    private LocalDate dateOfBuild;
    private boolean hasTrailerHitch;
    private int towingCapacity;
    private int paxCapacity;

    //Constructors
    public Car() {
    }

    public Car(String licensePlate,
               String brand,
               String model,
               String color,
               double value,
               LocalDate dateOfBuild,
               boolean hasTrailerHitch,
               int towingCapacity,
               int paxCapacity) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.value = value;
        this.dateOfBuild = dateOfBuild;
        this.hasTrailerHitch = hasTrailerHitch;
        this.towingCapacity = towingCapacity;
        this.paxCapacity = paxCapacity;
    }
}
