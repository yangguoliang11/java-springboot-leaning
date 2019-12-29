package com.guoliang.springboot.model;

import java.io.Serializable;

public class Book implements Serializable {

    private String name;
    private String pulisher;

    public Book(String name, String pulisher) {
        this.name = name;
        this.pulisher = pulisher;
    }

    public String getName() {
        return name;
    }

    public String getPulisher() {
        return pulisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPulisher(String pulisher) {
        this.pulisher = pulisher;
    }
}
