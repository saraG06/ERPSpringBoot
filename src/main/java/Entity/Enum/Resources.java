package Entity.Enum;

import javax.persistence.Enumerated;

public enum Resources {
    CAR("car",1),
    PHONE("phone", 2),
    PC("pc", 3);

    private int value;
    private String name;
    Resources(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
