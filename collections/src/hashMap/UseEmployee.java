package hashMap;

import java.util.Iterator;
import java.util.HashMap;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1101, "Guru", 27, 8000, "Male");
		Employee e2 = new Employee(1102, "Dilip", 24, 18000, "Male");
		Employee e3 = new Employee(1103, "Priya", 25, 38000, "Female");
		Employee e4 = new Employee(1104, "vishnu", 25, 25000, "Male");
		Employee e5 = new Employee(1105, "Sathya", 26, 38000, "Male");
		Employee e6 = new Employee(1106, "Vinoth", 25, 29000, "Male");
		Employee e7 = new Employee(1107, "Lavanaya", 27, 35000, "Female");

		HashMap<Integer, Employee> empDetails = new HashMap<>();
		empDetails.put(e1.getId(), e1);
		empDetails.put(e2.getId(), e2);
		empDetails.put(e3.getId(), e3);
		empDetails.put(e4.getId(), e4);
		empDetails.put(e5.getId(), e5);
		empDetails.put(e6.getId(), e6);
		empDetails.put(e7.getId(), e7);

//		empDetails.keySet().forEach(i -> System.out.println(empDetails.get(i)));

//		System.out.println("\n" + "                         Adding females to new female hashMap");
//		HashMap<Integer, Employee> femaleEmp = new HashMap<>();
//
//		for (Integer i : empDetails.keySet()) {
//			if (empDetails.get(i).getGender().equals("Female")) {
//				femaleEmp.put(i, empDetails.get(i));
//			}
//		}
//		System.out.println(femaleEmp);
//
//		System.out.println("\n" + "                         Adding males to new male hashMap");
//		HashMap<Integer, Employee> maleEmp = new HashMap<>();
//
//		for (Employee i : empDetails.values()) {
//			if (i.getGender().equals("Male")) {
//				maleEmp.put(i.getId(), i);
//			}
//		}
//		System.out.println(maleEmp);
//
//		System.out.println("\n" + "                         MAX SAL DETAILS");
//		Employee maxEmp = empDetails.get(1101); // maxEmp=e1;
//		for (Employee i : empDetails.values()) {
//			if (i.getSalary() > maxEmp.getSalary()) {
//				maxEmp = i;
//			}
//		}
//		System.out.println(maxEmp);

//		for (Integer i : empDetails.keySet()) {
//			if (empDetails.get(i).getSalary() < 10000) {
//				empDetails.remove(i);
//			}
//		}
//		empDetails.keySet().forEach(i -> System.out.println(empDetails.get(i)));

//		System.out.println("\n"+"removing a data in loop without concurrentHasMap");
//		Iterator<Employee> i = empDetails.values().iterator();
//		while (i.hasNext()) {
//			if (i.next().getGender().equalsIgnoreCase("female")) {
//				i.remove();
//			}
//		}
		empDetails.keySet().forEach(j -> System.out.println(empDetails.get(j)));

	}
}
