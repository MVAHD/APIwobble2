package avans.infd.apiwobble2.Domain;
import avans.infd.apiwobble2.Domain.Car;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.time.Duration;
import java.time.LocalDateTime;

@Entity
public class Trip {
    @Id
    private String userName;
    private String licensePlate;
    private String pointPickup;
    private String pointDropOff;
    private LocalDateTime tripStartTime;
    private LocalDateTime tripEndTime;
    private int habitScore;
    private double tripDistance;
    private double tripPrice;

    @Transient
    private double tripDuration;

    public Trip(){}

    public Trip(String userName, String licensePlate){
        this.userName = userName;
        this.licensePlate = licensePlate;
        this.tripStartTime = LocalDateTime.now();
    }

    public void parkCar(){
        this.tripEndTime = LocalDateTime.now();
    }

    public void calculateTripPrice(){
        double carTariff = 9.5;
        this.tripPrice = carTariff * tripDuration;
    }

    public void setPointPickup(String pointPickup) {
        this.pointPickup = pointPickup;
    }

    public void setPointDropOff(String pointDropOff) {
        this.pointDropOff = pointDropOff;
    }

    public void setHabitScore(int habitScore) {
        this.habitScore = habitScore;
    }

    public void setTripDistance(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    public String getUserName() {
        return userName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getPointPickup() {
        return pointPickup;
    }

    public String getPointDropOff() {
        return pointDropOff;
    }

    public int getHabitScore() {
        return habitScore;
    }

    public double getTripDuration() {
        return Duration.between(tripStartTime, tripEndTime).toHours();
    }

    public double getTripDistance() {
        return tripDistance;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public LocalDateTime getTripStartTime() {
        return tripStartTime;
    }

    public LocalDateTime getTripEndTime() {
        return tripEndTime;
    }
}
