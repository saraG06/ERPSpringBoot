package it.unikey.erpspring.DAL.enumerators;

public enum AssignedResources {

    CAR(1),
    PC(2),
    PHONE(3);

    private int value;

    AssignedResources(int value){
        this.value = value;
    }
}
