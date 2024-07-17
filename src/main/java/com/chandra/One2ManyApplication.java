package com.chandra;

import com.chandra.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class One2ManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntxt=SpringApplication.run(One2ManyApplication.class, args);
		EmployeeService employeeService=cntxt.getBean(EmployeeService.class);
	//	employeeService.saveEmpData();
		//employeeService.getEmpData(); using lazy only parent will appear ,eager both tables data will appear
		employeeService.getAdreesData();
		// delete parent both child and parent deleted
	//	employeeService.DeleteEmp();
	}

}
