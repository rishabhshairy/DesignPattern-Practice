package com.rshairy.designs.FacadeDesignPattern.Example1HideMethods;

import com.rshairy.designs.FacadeDesignPattern.Example1HideMethods.Employee.Employee;
import com.rshairy.designs.FacadeDesignPattern.Example1HideMethods.Employee.EmployeeDAO;

/**
 * Here we are only interested in
 * insert and getEmpById method
 */
public class EmployeeDaoFacade {
    EmployeeDAO employeeDAO;

    public EmployeeDaoFacade(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    void insert(Employee employee) {
        employeeDAO.insert(employee);
    }

    Employee getEmployeeById(int id) {
        return employeeDAO.getEmployee(id);

    }
}
