package interviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*	Q1. Write a - code to print duplicate employee name count from EmployeeList
Example:
  EMPID  , NAME ,    DEPT, AGE
  ------------------------------------
('E40001', 'PRADEEP', 'H.R', 36),
('E40001','SANTHOSH',"MANAGER',28),
('E40003', 'PRADEEP', ,ASST MANAGER',28),
('E40004', 'SANTHOSH', 'STORE MANAGER',25),
(E40005),ASHOK", 'GENERAL MANAGER',26);

Q2. Write a code to reverse String
*/
public class DuplicateEmployee {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("E40001", "PRADEEP", "H.R", 36));
		employeeList.add(new Employee("E40002", "SANTHOSH", "MANAGER", 28));
		employeeList.add(new Employee("E40003", "PRADEEP", "ASST MANAGER", 28));
		employeeList.add(new Employee("E40004", "SANTHOSH", "STORE MANAGER", 25));
		employeeList.add(new Employee("E40005", "ASHOK", "GENERAL MANAGER", 26));
		
		
//		Set<Employee> set = new HashSet<>();
		
		//employee name count
		Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));

		System.out.println(employeeList.get(1).getAge());
		System.out.println(collect);
		
		
	}
	
	
	
	
}
