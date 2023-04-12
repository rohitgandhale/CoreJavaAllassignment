package ClassAndobjects;

public class Employee {
    String name;
    int yearjoin;
    int salary;
    String address;

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Robert";
        employee1.yearjoin = 1994;
        employee1.salary = 25000;
        employee1.address = " 64C wallstreet";
        Employee employee2 = new Employee();
        employee2.name = "Sam";
        employee2.yearjoin = 2000;
        employee2.salary = 15000;
        employee2.address = "68D wallstreet";
        Employee employee3 = new Employee();
        employee3.name = "John";
        employee3.yearjoin = 1999;
        employee3.salary = 20000;
        employee3.address = "26B wallstreet";
        System.out.println(employee1.name + " " + employee1.address + " " + employee1.salary + " " + employee1.yearjoin);
        System.out.println(employee2.name + " " + employee2.address + " " + employee2.salary + " "+employee2.yearjoin);
        System.out.println(employee3.name + " "+employee3.address + " " + employee3.salary + " " + employee3.yearjoin);
    }

 }
