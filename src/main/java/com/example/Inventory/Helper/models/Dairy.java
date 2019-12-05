package com.example.Inventory.Helper.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Dairy")
public class Dairy extends Item {

    @NotNull
    @Column(name="AmtPulled")
    private int amountPulled;

    @Column(name="TotalPulled")
    private int totalPulled;

    public void item( int amountPulled){
        this.setTotalPulled(this.getTotalPulled() + amountPulled);
        // same as this.totalPUlled = this.totalPulled + amountPulled
        this.amountPulled = amountPulled;
        }
    public Dairy() {
    }
    public int getAmountPulled() {
        return amountPulled;
    }

    public void setAmountPulled(int amountPulled) {
        this.amountPulled = amountPulled;
    }

    protected int getTotalPulled() {
        return totalPulled;
    }

    protected void setTotalPulled(int totalPulled) {
        this.totalPulled = totalPulled;
    }
}
