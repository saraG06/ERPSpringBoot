package it.unikey.erpSpringBootTest.DAL.Enum;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;


public enum Risorse {

    MACCHINA("macchina",1),
    PC("pc",2),
    TELEFONO("telefono",3);


    private String risorsa;
    private Integer i;

    @JsonValue
    public String getRisorsa() {
        return risorsa;
    }

    public Integer getI() {
        return i;
    }

    Risorse(String risorsa, Integer i) {
        this.risorsa=risorsa;
        this.i = i;
    }
}
