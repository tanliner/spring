package com.ltan.server.entity;

/**
 * Detail:
 * <p>
 * Created by tanlin on 2019-10-16
 */
public class Person {
    private long id;
    private String name;
    private String email;
    private int status;
    // getter & setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
