package com.example.Inventory.Helper.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public abstract class Item {
    private int uid;

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="uid", unique = true)
    public int getUid(){return this.uid;}

    protected  void setUid (int uid){this.uid = uid;}
    @NotNull
    @Column(name="name")
    private String name;


    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
