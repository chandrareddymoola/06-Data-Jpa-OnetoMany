package com.chandra.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String empName;
    private Double salary;

    @OneToMany(mappedBy = "emp" ,cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    //fetch = FetchType.EAGER,LazY
    //lazy means only fetch parent table that is employee table values
    //eager means both employee and address table values fetched
    // if we are not giving anything default it takes lazy
    private List<Address> address;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
