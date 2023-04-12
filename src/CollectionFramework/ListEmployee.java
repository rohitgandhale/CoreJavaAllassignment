package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEmployee {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"Rohit",100000);
        Employee employee2=new Employee(2,"Nishant",80000);
        Employee employee3=new Employee(3,"Vaishanvi",70000);
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.forEach(System.out::println);
        System.out.println("Sorted Employees");
        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);
    }
}
