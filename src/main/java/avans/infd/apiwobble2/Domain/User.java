package avans.infd.apiwobble2.Domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@Entity //Makes object of User and maps to table.
//Todo: add to Car.
//Todo: make delete for User.
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private long id;

    //Attributes
    @Size(min = 3, max = 15)
    //Todo: add to Car.licensePlate.
    @NotBlank(message = "Name is mandatory")
    private String userName;
    @NotBlank(message = "Email is mandatory")
    private String userMail;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String street;
    private String houseNumber;
    private String zipCode;
    private String city;
    private String state;
    private String country;
    private String password;
    private LocalDateTime registrationDate;

    @Transient //Is not persistent in DB.
    private int age; //is calculated on get.

    //empty constructor
    public User() {
    }

    //constructor without id
    public User(String userName,
                String userMail,
                String firstName,
                String lastName,
                LocalDate dateOfBirth,
                String street,
                String houseNumber,
                String zipCode,
                String city,
                String state,
                String country,
                String password) {
        this.userName = userName;
        this.userMail = userMail;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.password = password;
        this.registrationDate = LocalDateTime.now();
    }

    //Methods
    public String getDetails() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userMail='" + userMail + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    //Calculates age with dateOfBirth on get.
    public Integer getAge(){
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    //Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }
    //Todo: add hashing and verifying of old password
    public void setPassword(String password) {
        this.password = password;
    }
}
