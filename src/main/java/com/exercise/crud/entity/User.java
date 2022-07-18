package com.exercise.crud.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
    @Min(value = 100, message = "Salary can not be less than 100")
    private int annualSalary;

    @NotBlank(message = "The date of birth is required.")
    @Pattern(regexp="^\\d{2}\\-\\d{2}\\-\\d{4}",message="date format must be dd-mm-yyyy")
    private String dateOfBirth;
    @NotEmpty(message = "The email address is required.")
    @Email(message = "The email address is invalid.", flags = { Flag.CASE_INSENSITIVE })
    private String email;
    @NotBlank(message = "firstName is required")
    private String firstName;
    @NotBlank(message = "fullName is required")
    private String fullName;
    @NotBlank(message = "lastName is required")
    private String lastName;

    @NotEmpty(message = "The gender is required.")
    private String gender;

    @Id
    @NotNull(message = "ID can't be blank")
    private int id;
    @Size(min = 10,max = 10)
    @NotBlank(message = "Phone no can't be blank")
    private String mobilePhone;
    @NotBlank(message = "Type can't be blank")
    private String userType;

    public User(){

    }

    public User(int annualSalary, String dateOfBirth, String email, String firstName, String lastName, String fullName, String gender, int id, String mobilePhone, String userType) {
        this.annualSalary = annualSalary;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.firstName = firstName;
        this.fullName = fullName;
        this.gender = gender;
        this.id = id;
        this.lastName = lastName;
        this.mobilePhone = mobilePhone;
        this.userType = userType;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public User orElse(User other) {
        return null;
    }
}
