package programs;

import java.util.*;
import java.util.stream.Collectors;

public class Object_Sorting_Comparator {

	private String name;
	private double salary;

	public Object_Sorting_Comparator(String name, double salary) {
		this.name = name;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public double getsalary() {
		return salary;
	}

	public String toString() {

		return "{name='" + name + "', salary=" + salary + '}';
	}

	public static void main(String... args) {

		List<Object_Sorting_Comparator> employees = new ArrayList();
		employees.add(new Object_Sorting_Comparator("a", 8000000));

		employees.add(new Object_Sorting_Comparator("c", 5000000));
		employees.add(new Object_Sorting_Comparator("b", 7000000));

		List<Object_Sorting_Comparator> s = employees.stream()
				.sorted(Comparator.comparingDouble(Object_Sorting_Comparator::getsalary)).collect(Collectors.toList());

		
		// descending order sort salary
		List<Object_Sorting_Comparator> s1 = employees.stream()
				.sorted(Comparator.comparingDouble(Object_Sorting_Comparator::getsalary).reversed())
				.collect(Collectors.toList());
		
		List<Object_Sorting_Comparator> s2 = employees.stream()
				.sorted(Comparator.comparing(Object_Sorting_Comparator::getName)).collect(Collectors.toList());

		
		// descending order sort salary
		List<Object_Sorting_Comparator> s3 = employees.stream()
				.sorted(Comparator.comparing(Object_Sorting_Comparator::getName).reversed())
				.collect(Collectors.toList());

		System.out.println("salary sorted ascending");
		s.forEach(System.out::println);

		System.out.println("salary sorted descending");
		s1.forEach(System.out::println);

		System.out.println("name sorted ascending");
		s2.forEach(System.out::println);

		System.out.println("name sorted descending");
		s3.forEach(System.out::println);
	}
}
