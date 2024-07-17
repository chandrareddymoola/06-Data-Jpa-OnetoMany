package com.chandra.service;

import com.chandra.entities.Address;
import com.chandra.entities.Employee;
import com.chandra.repository.AddressRepo;
import com.chandra.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private AddressRepo addressRepo;

    public void DeleteEmp(){
        employeeRepo.deleteById(1);
    }

    public void getEmpData(){
        Optional<Employee>   findById= employeeRepo.findById(1);
    }
    public void getAdreesData(){
       Optional<Address> addressOptional= addressRepo.findById(1);
    }

    public void saveEmpData(){

        Employee emp=new Employee();
        emp.setEmpName("Chandra");
        emp.setSalary(254.00);

// setting the employee  table values
        Address address1=new Address();
        address1.setCity("HYD");
        address1.setState("TG");
        address1.setAddresstype("present");
        address1.setEmp(emp); //setting emp to address
// setting the adress table values
        Address address2=new Address();
        address2.setCity("GNT");
        address2.setAddresstype("permenent");
        address2.setState("AP");
        address2.setAddresstype("permenent");
        address2.setEmp(emp);
        //setting emp to adreess
       List<Address> addressList= Arrays.asList(address1,address2);
        emp.setAddress(addressList);
       employeeRepo.save(emp);
    }
}
