package it.unikey.DAL.Entity.Enum;

public enum Roles {
    MANAGER("manager", 3),
    PROJECTMANAGER("projectmanager", 2),
    OPERATOR("operator", 1);

    private String name;
    private int value;

    Roles(String name, int value) {
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
