package com.rshairy.designs.FacadeDesignPattern.Example1HideMethods.Employee;

public class EmployeeDAO {

    public void insert(Employee employee) {

    }

    public Employee getEmployee(int id) {
        return new Employee();
    }

    public Employee getEmployeeByName(String employeeName) {
        return new Employee();
    }

    public void update(Employee employee) {

    }
}
