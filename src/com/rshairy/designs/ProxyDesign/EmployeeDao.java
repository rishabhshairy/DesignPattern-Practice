package com.rshairy.designs.ProxyDesign;

import java.nio.file.AccessDeniedException;

public interface EmployeeDao {
    void create(String client, EmployeeDo obj) throws AccessDeniedException;

    EmployeeDo read(String client, String id) throws AccessDeniedException;

    void delete(String client, String id) throws AccessDeniedException;
}
