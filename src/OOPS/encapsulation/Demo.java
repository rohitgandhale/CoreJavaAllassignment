package OOPS.encapsulation;

public class Demo {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setEmployeeId(100);
        employee.setEmployeeName("rohit");
        employee.setEmployeeSalary(45000);
        employee.setAge(20);
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeeSalary());
        System.out.println(employee.getAge());


    }
}
