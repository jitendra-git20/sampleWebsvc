package com.indibytes.DAO;

import java.util.ArrayList;
import java.util.List;

import com.indibytes.pojo.Employee;

public class EmployeeDAO {

	List<Employee> empList = new ArrayList<Employee>();
	
	public List<Employee> getAllUsers() {
		
		Employee emp1 = new Employee();
		emp1.setDepartment("IT");
		emp1.setId(01);
		emp1.setName("employee01");
		
		Employee emp2 = new Employee();
		emp2.setDepartment("HISTORY");
		emp2.setId(02);
		emp2.setName("employee02");
		
		Employee emp3 = new Employee();
		emp3.setDepartment("GEOGRAPHY");
		emp3.setId(03);
		emp3.setName("employee03");
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		return empList;
	}

	public List<Employee> addUser(Employee e) {
		if (empList.size() == 0 ) {
		List<Employee> empListLocal = getAllUsers();
		empListLocal.add(e);
		return empListLocal;
		}
		empList.add(e);
		return empList;
		
	}

	public Employee getUserByName(String name) {
		Employee employee = null;
		List<Employee> empList = getAllUsers();
		for (Employee emp : empList ) {
			if (name.equalsIgnoreCase(emp.getName())) {
				return emp;
			}
		}
		return employee;
		
	}
	
	

}
