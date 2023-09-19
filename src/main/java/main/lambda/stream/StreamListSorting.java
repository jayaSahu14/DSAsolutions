package main.lambda.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee6 {
    private int id;
    private String name;
    private int age;
    private long salary;
    public Employee6(int id, String name, int age, long salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}

public class StreamListSorting {
	 public static void main(String[] args) {

	        // sort employee by salary in ascending order
	        List < Employee6 > employees = new ArrayList < Employee6 > ();
	        employees.add(new Employee6(10, "Ramesh", 30, 400000));
	        employees.add(new Employee6(20, "John", 29, 350000));
	        employees.add(new Employee6(30, "Tom", 30, 450000));
	        employees.add(new Employee6(40, "Pramod", 29, 500000));

	        List < Employee6 > employeesSortedList1 = employees.stream()
	            .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary()))
	            .collect(Collectors.toList());
	        System.out.println(employeesSortedList1);

	        List < Employee6 > employeesSortedList2 = employees.stream()
	            .sorted(Comparator.comparingLong(Employee6::getSalary))
	            .collect(Collectors.toList()); //ascending order
	        System.out.println(employeesSortedList2);
	   
	        List < Employee6 > employeesSortedList3 = employees.stream()
	                .sorted((o1, o2) -> (int)(o2.getSalary() - o1.getSalary()))
	                .collect(Collectors.toList());
	            System.out.println(employeesSortedList1);

	            List < Employee6 > employeesSortedList4 = employees.stream()
	                .sorted(Comparator.comparingLong(Employee6::getSalary).reversed()).collect(Collectors.toList()); //ascending order
	            System.out.println(employeesSortedList2);
	 
	 
	 
	 
	 
	 
	 }
	}

