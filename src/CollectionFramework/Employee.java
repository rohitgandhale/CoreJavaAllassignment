package CollectionFramework;

import java.util.Collection;

public class Employee implements Comparable<Employee> {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

    public Employee(int employeeId, String employeeName, int employeeSalary) {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;

    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public int compareTo(Employee employee) {
        return
       //  employee.getEmployeeSalary()-this.getEmployeeSalary()
         this.employeeName.compareTo(employee.employeeName);
    }
}
