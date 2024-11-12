package stream.Interview.Questions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {

	public static void main(String[] args) {

		Employee e = new Employee();

		/**
		 * 1. How many employees are there in the organization? For counting the we can
		 * use two methods and both are terminal operations and will give the same
		 * result. 1.using count() 2.using collect(Collectors.counting)
		 */
		System.out.println(e.getEmployeeList().stream().count());
		System.out.println(e.getEmployeeList().stream().collect(Collectors.counting()));

		/**
		 * 2. Sort the List of Employee objects based on salary in Ascending order
		 * 
		 * Using sorted method of stream we order the employeeList
		 */

		// sorting only salary
		List<Double> collect = e.getEmployeeList().stream().map(x -> x.getSalary()).sorted()
				.collect(Collectors.toList());

		// sorting sorting employee list with respect to slaary:
		List<Employee> collect2 = e.getEmployeeList().stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());

		// sorting sorting employee list with respect to slaary in reverse order
		List<Employee> collect3 = e.getEmployeeList().stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());

		System.out.println(collect);
		System.out.println(collect2);

		/**
		 * 4. How many male and female employees are there in the organization?
		 * 
		 * We utilize the Collectors.groupingBy() method in this query, which accepts
		 * two inputs. The first argument is Employee::getGender, which groups the input
		 * components depending on gender, and the second argument is
		 * Collectors.counting(), which counts the number of entries in each group.
		 */

		Map<String, Long> collect4 = e.getEmployeeList().stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect4);

		/**
		 * 5. return a employe salary to 10% increemnet whose age is above 22
		 *
		 */
		List<Double> collect5 = e.getEmployeeList().stream().filter(x -> x.getAge() > 25)
				.map(x -> x.getSalary() * 1.10d)
				.collect(Collectors.toList());
		System.out.println(collect5);

	}

}
