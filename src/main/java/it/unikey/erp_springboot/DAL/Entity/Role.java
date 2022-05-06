package it.unikey.erp_springboot.DAL.Entity;

public enum Role {
    MANAGER("manager", 3),
    PROJECTMANAGER("projectmanager", 2),
    OPERATOR("operator", 1);

    private String name;
    private int value;

    Role(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
