package com.exercise.crud.entity;
import javax.persistence.*;
import javax.validation.constraints.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;

@Entity
@Table(name = "address")
public class UserAddress {
    private String addrLn1;
    private String addrLn2;
    private String addrName;
    private String addrType;
    private String city;
    private String country;
    @Id
    private int id;
    @NotBlank(message = "The location code is required.")
    @Pattern(regexp = "^\\d{5}", message = "The location code is invalid.")
    private String locationCode;
    @NotBlank(message = "The postal code is required.")
    @Pattern(regexp = "^\\d{5}", flags = { Flag.CASE_INSENSITIVE, Flag.MULTILINE }, message = "The postal code is invalid.")
    private String postalCode;
    @NotBlank(message = "The stateCode is required.")
    @Pattern(regexp = "^\\d{5}", flags = { Flag.CASE_INSENSITIVE, Flag.MULTILINE }, message = "The stateCode is invalid.")
    private String stateCode;
    private int userId;

    public UserAddress() {
    }

    public UserAddress(String addrLn1, String addrLn2, String addrName, String addrType, String city, String country, int id, String locationCode, String postalCode, String stateCode, int userId) {
        this.addrLn1 = addrLn1;
        this.addrLn2 = addrLn2;
        this.addrName = addrName;
        this.addrType = addrType;
        this.city = city;
        this.country = country;
        this.id = id;
        this.locationCode = locationCode;
        this.postalCode = postalCode;
        this.stateCode = stateCode;
        this.userId = userId;
    }

    public String getAddrLn1() {
        return addrLn1;
    }

    public void setAddrLn1(String addrLn1) {
        this.addrLn1 = addrLn1;
    }

    public String getAddrLn2() {
        return addrLn2;
    }

    public void setAddrLn2(String addrLn2) {
        this.addrLn2 = addrLn2;
    }

    public String getAddrName() {
        return addrName;
    }

    public void setAddrName(String addrName) {
        this.addrName = addrName;
    }

    public String getAddrType() {
        return addrType;
    }

    public void setAddrType(String addrType) {
        this.addrType = addrType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
