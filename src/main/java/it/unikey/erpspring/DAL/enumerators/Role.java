package it.unikey.erpspring.DAL.enumerators;

public enum Role {
    MANAGER(1),
    PROJECTMANAGER(2),
    OPERATOR(3);

    private int value;

    Role(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
