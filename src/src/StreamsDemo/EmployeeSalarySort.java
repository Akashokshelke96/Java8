package StreamsDemo;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalarySort {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 1000, "IT"),
                new Employee("Bob", 1200, "HR"),
                new Employee("Charlie", 1100, "IT")
        );

        Map<String, Optional<Employee>> employeeList = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department,Collectors.maxBy(Comparator.comparingDouble(emp -> emp.salary))));

        System.out.println(employeeList);
    }
}
class Employee {
    String name;
    double salary;
    String department;

    Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
