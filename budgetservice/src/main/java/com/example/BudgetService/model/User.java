package com.example.BudgetService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String cellNumber;
    private String incomingSalary;
    private String salaryAfterDeductions; //this is monthly deductions
    private String remainingSalary;
    private Date insertedDate;
    private Date editDate;

    //default constructor
    public Users() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public Date getInsertedDate() {
        return insertedDate;
    }

    public void setInsertedDate(Date insertedDate) {
        this.insertedDate = insertedDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public String getIncomingSalary() {
        return incomingSalary;
    }

    public void setIncomingSalary(String incomingSalary) {
        this.incomingSalary = incomingSalary;
    }

    public String getSalaryAfterDeductions() {
        return salaryAfterDeductions;
    }

    public void setSalaryAfterDeductions(String salaryAfterDeductions) {
        this.salaryAfterDeductions = salaryAfterDeductions;
    }

    public String getRemainingSalary() {
        return remainingSalary;
    }

    public void setRemainingSalary(String remainingSalary) {
        this.remainingSalary = remainingSalary;
    }
}
