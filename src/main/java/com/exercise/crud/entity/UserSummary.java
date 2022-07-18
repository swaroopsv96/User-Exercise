package com.exercise.crud.entity;
import javax.persistence.*;

@Entity
@Table(name = "summary")
public class UserSummary {
    private String dateOfBirth;
    private String firstName;
    private String lastName;
    @Id
    private int id;

    public UserSummary(){}

    public UserSummary(String dateOfBirth, String firstName, String lastName, int id) {
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
