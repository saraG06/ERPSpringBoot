package it.unikey.erpspring.DAL.entity;

public enum AssignedResources {

    NONE(0),
    CAR(1),
    MOBILEPHONE(2),
    PC(3);

    private int value;

    AssignedResources(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }



}
