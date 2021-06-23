package com.company;

public abstract class Hero implements HavingSuperAbility{

    @Override
    public void applySuperAbility(String sip) {

    }

    private int heals;
    private int damage;
    private String supers;

    public int getHeals() {
        return heals;
    }

    public void setHeals(int heals) {
        this.heals = heals;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSupers() {
        return supers;
    }

    public void setSupers(String supers) {
        this.supers = supers;
    }
}
