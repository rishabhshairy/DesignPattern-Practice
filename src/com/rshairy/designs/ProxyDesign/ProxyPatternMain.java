package com.rshairy.designs.ProxyDesign;

import java.nio.file.AccessDeniedException;

public class ProxyPatternMain {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDaoProxyImpl();
        try {
            dao.create("ADMIN", new EmployeeDo());
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
