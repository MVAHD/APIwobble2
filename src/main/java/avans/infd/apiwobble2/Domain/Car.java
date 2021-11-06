package avans.infd.apiwobble2.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
public abstract class Car {
    @Id
    @SequenceGenerator(
            name = "car_sequence",
            sequenceName = "car_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "car_sequence"
    )

    private long id;

    //Attributes
    @Size(min= 6, max = 6)
    @NotBlank(message = "License plate is mandatory")
    private String licensePlate;
    private String brand;
    private String model;
    private String color;
    private double value;
    private LocalDate dateOfBuild;
    private boolean hasTrailerHitch;
    private int towingCapacity;
    private int paxCapacity;

    //CarTerms
    private boolean rentedOut;

    //Default values
    {
        rentedOut = false;
    }

    //Constructors
    public Car() {
    }

    public Car(String licensePlate, String color) {
        this.licensePlate = licensePlate;
        this.color = color;
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

    //Methods
    public String rentCar(){
        this.rentedOut = true;
        return this.licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasTrailerHitch() {
        return hasTrailerHitch;
    }

    public void setHasTrailerHitch(boolean hasTrailerHitch) {
        this.hasTrailerHitch = hasTrailerHitch;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDateOfBuild() {
        return dateOfBuild;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public int getPaxCapacity() {
        return paxCapacity;
    }

    public boolean isRentedOut() {
        return rentedOut;
    }
}
