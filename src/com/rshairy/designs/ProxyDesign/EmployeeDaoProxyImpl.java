package com.rshairy.designs.ProxyDesign;

import java.nio.file.AccessDeniedException;

public class EmployeeDaoProxyImpl implements EmployeeDao {

    EmployeeDao dao;

    public EmployeeDaoProxyImpl() {
        this.dao = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDo obj) throws AccessDeniedException {
        if (client.equals("ADMIN")){
            this.dao.create(client,obj);
            return;
        }
        throw new AccessDeniedException("Access Denied");
    }

    @Override
    public EmployeeDo read(String client, String id) throws AccessDeniedException {
        if (client.equals("ADMIN") || client.equals("USER")){
            return this.dao.read(client,id);
        }
        throw new AccessDeniedException("Access Denied");
    }

    @Override
    public void delete(String client, String id) throws AccessDeniedException {
        if (client.equals("ADMIN")){
            this.dao.delete(client,id);
            return;
        }
        throw new AccessDeniedException("Access Denied");
    }
}
