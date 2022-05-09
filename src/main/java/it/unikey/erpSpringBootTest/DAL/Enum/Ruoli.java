package it.unikey.erpSpringBootTest.DAL.Enum;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;


public enum Ruoli {

    MANAGER("manager",1),
    PROJECTMANAGER("projectmanager",2),
    OPERATOR("operator",3);

    private String ruolo;
    private Integer i;
    @JsonValue
    public String getRuolo() {
        return ruolo;
    }

    public int getI() {
        return i;
    }

    Ruoli(String ruolo, Integer i) {
        this.ruolo = ruolo;
        this.i=i;
    }
}
