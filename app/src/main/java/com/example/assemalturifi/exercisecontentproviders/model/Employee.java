package com.example.assemalturifi.exercisecontentproviders.model;

public class Employee {

    //step4
    public String id;
    public String firstName;
    public String lastName;
    public String salary;
    public String daysEmplyed;

    public Employee(String id, String firstName, String lastName, String salary, String daysEmplyed) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.daysEmplyed = daysEmplyed;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDaysEmplyed() {
        return daysEmplyed;
    }

    public void setDaysEmplyed(String daysEmplyed) {
        this.daysEmplyed = daysEmplyed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary='" + salary + '\'' +
                ", daysEmplyed='" + daysEmplyed + '\'' +
                '}';
    }
}