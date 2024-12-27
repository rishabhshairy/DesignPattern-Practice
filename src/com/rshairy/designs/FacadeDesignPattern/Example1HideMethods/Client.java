package com.rshairy.designs.FacadeDesignPattern.Example1HideMethods;

import com.rshairy.designs.FacadeDesignPattern.Example1HideMethods.Employee.EmployeeDAO;

/**
 * Client only Interacts with Facade and does not know all methods of Employee DAO
 */
public class Client {
    public static void main(String[] args) {
        EmployeeDaoFacade employeeDaoFacade = new EmployeeDaoFacade(new EmployeeDAO());
        employeeDaoFacade.getEmployeeById(1);
    }
}
