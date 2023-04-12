package ClassAndobjects;

import java.util.Scanner;

public class Employee1 {
        int salary;
        String employeename;
        int  numofhours;
        void   getinfo(int sal,String name,int hours) {
            salary = sal;
            employeename = name;
            numofhours = hours;
        }
        int Addsalary(){
            if (salary<500)
                salary=salary+10;
            return salary;
        }
        int Addhours(){
            if (numofhours>7)
                salary=salary+5;
            return salary;
        }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name");
        String name=s.next();
        System.out.println("Enter salary");
        int sal=s.nextInt();
        System.out.println("Enter number of hours");
        int hours=s.nextInt();
        Employee1 employee1=new Employee1();
        employee1.getinfo(sal, name, hours);
        System.out.println(employee1.Addsalary());
        System.out.println(employee1.Addhours());
    }





}
