package java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIMethodsUseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Guru", 1101, 18000, 24, "Male", "Intern");
		Employee e2 = new Employee("Dilip", 1102, 38000, 22, "Male", "Intern");
		Employee e3 = new Employee("Vishnu", 1103, 55000, 30, "Male", "Intern");
		Employee e4 = new Employee("Dharani", 1104, 70000, 26, "Female", "Intern");
		Employee e5 = new Employee("Shamrmila", 1105, 38000, 29, "Female", "Intern");
		Employee e6 = new Employee("Vinoth", 1106, 118000, 27, "Male", "Intern");
		Employee e7 = new Employee("Robin", 1107, 118000, 28, "Male", "Intern");

		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);

		System.out.println();

//filter()
		System.out.println("                            filter()");
		List<Employee> n1 = employees.stream().filter(x -> x.getSalary() > 100000).collect(Collectors.toList());
		System.out.println(n1);

		System.out.println();

//map()
		System.out.println("                            map()");
		List<String> n2 = employees.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(n2);

		System.out.println();

//count()
		System.out.println("                            count()");
		Long l = employees.stream().filter(x -> x.getSalary() > 100000).count();
		System.out.println(l);

		System.out.println();

//distinct()
		System.out.println("                            distinct()");
		employees.stream().map(x -> x.getGender()).distinct().forEach(x -> System.out.println(x));

		System.out.println();

//sorted()
		System.out.println("                            sorted()");
		List<String> n31 = employees.stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
		System.out.println(n31);
		n31.forEach(x -> System.out.println(x));

		List<String> n32 = employees.stream().map(x -> x.getName()).sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(n32);

		List<String> n33 = employees.stream().map(x -> x.getName()).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(n33);

		System.out.println();

//limit()
		System.out.println("                            limit()");
		List<String> n4 = employees.stream().map(x -> x.getName()).limit(2).collect(Collectors.toList());
		System.out.println(n4);

		System.out.println();

//anyMatch()
		System.out.println("                            anyMatch()");
		boolean b = employees.stream().anyMatch(x -> x.getName().equals("Guru"));
		System.out.println(b);

		System.out.println();

//max()
		System.out.println("                            max()");
		int max = employees.stream().map(x -> x.getSalary()).max(Integer::compare).get();
		Employee emp1 = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(max);
		System.out.println(emp1);

		System.out.println();

//min()
		System.out.println("                            min()");
		int min = employees.stream().map(x -> x.getSalary()).min(Integer::compare).get();
		Employee emp2 = employees.stream().min(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(min);
		System.out.println(emp2);

		System.out.println();

//summingInt()
		System.out.println("                            summingInt()");
		int sum = employees.stream().collect(Collectors.summingInt(x -> x.getSalary()));
		System.out.println(sum);

		System.out.println();

//findFirst() and skip()
//finding second highest salary
		System.out.println("                            Finding 2nd Highest Sal using skip() and findFirst()");
		int secHigh = employees.stream().map(x -> x.getSalary()).distinct().sorted(Collections.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println(secHigh);
		int secHigh1 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList().get(2)
				.getSalary();
		System.out.println(secHigh1);
		
		// using for

		Employee emp3 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList().get(2);
		System.out.println(emp3);

		Employee emp4 = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList().get(1);
		System.out.println(emp4);

		List<Employee> maxThree = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.limit(3).collect(Collectors.toList());
		System.out.println();
		maxThree.forEach(x -> System.out.println(x));

		System.out.println();

		List<Employee> fourthFifth = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(3).limit(2).collect(Collectors.toList());
		fourthFifth.forEach(x -> System.out.println(x));
		
//findAny()
		System.out.println("                            findAny()");
		System.out.println(employees.stream().skip(1).findAny().get());

		System.out.println();

//flatMap()		
		System.out.println("                            flatMap()");
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 9);

		List<List<Integer>> temp = Arrays.asList(list1, list2);
		System.out.println(temp);
		List<Integer> result = temp.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(result);

		System.out.println();
		
//flatmap() 3rd list add remove duplicates and sort in rev
		List<Integer> list3 = Arrays.asList(3, 5, 7, 8, 9, 10);
		List<List<Integer>> t = Arrays.asList(list1, list2, list3);
		System.out.println(t);
		List<Integer> r = t.stream().flatMap(x -> x.stream()).distinct().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(r);
		System.out.println();

//converting list employees into map 		
		System.out.println("                            List to Map");
		Map<Integer, Employee> employeesMap = employees.stream().collect(Collectors.toMap(x -> x.getId(), y -> y));
		System.out.println(employeesMap);
		employeesMap.keySet().stream().sorted().forEach(x -> System.out.println(x));
		employeesMap.values().stream().forEach(x -> System.out.println(x));

		System.out.println();

//converting list employees into Set
		System.out.println("                            List to Set");
		Set<Employee> employeesSet = employees.stream().collect(Collectors.toSet());
		System.out.println(employeesSet);
		employeesSet.forEach(x -> System.out.println(x));

		System.out.println();

//groupingBy() in Collectors
		System.out.println("                            groupingBy()");
		Map<Integer, List<Employee>> empMap = employees.stream().collect(Collectors.groupingBy(x -> x.getSalary()));
		empMap.values().forEach(x -> System.out.println(x));

//group and count male and female employees in single stream
		System.out.println("                            grouping male and female and the counts using streams");
		Map<String, Long> collect2 = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect2);
		collect2.forEach((k, y) -> System.out.println(k + " " + y));

//non-dupliactes print using stream
		List<Integer> list11 = Arrays.asList(1, 2, 4, 5, 6, 7, 5, 6);
		Set<Integer> nonDup = new HashSet<>();
		
//duplicates using stream
		List<Integer> dup = list11.stream().filter(x -> !nonDup.add(x)).toList();
		dup.forEach(x -> System.out.println(x));
		System.out.println(nonDup);

	}
}
