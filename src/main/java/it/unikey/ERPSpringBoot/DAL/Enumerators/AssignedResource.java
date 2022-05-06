package it.unikey.ERPSpringBoot.DAL.Enumerators;

public enum AssignedResource {

    CAR(1),
    PC(2),
    PHONE(3);

    private int value;

    AssignedResource(int value){ this.value=value;}
}
