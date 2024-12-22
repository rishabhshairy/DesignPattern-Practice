package com.rshairy.designs.ProxyDesign;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String client, EmployeeDo obj) {
        System.out.println("Employee Created Successfully");
    }

    @Override
    public EmployeeDo read(String client, String id) {
        return new EmployeeDo();
    }

    @Override
    public void delete(String client, String id) {
        System.out.println("Employee Deleted Successfully");
    }
}
