package com.example.Inventory.Helper.models;

import com.example.Inventory.Helper.models.Item;

public class NonDairy extends Item {

    public NonDairy() {

    }
    private int InvTotal;

    public void item(String name, String department, int InvTotal){
        this.setName(name);
//        this.setDepartment(department);
    }

    public int getInvTotal() {return InvTotal;}

    public void setInvTotal(int InvTotal){
        this.InvTotal = InvTotal;
    }
}
