package com.example.erpspring.BLL.dto.request;

import com.example.erpspring.DAL.Entity.Enum.Risorse;

import java.io.Serializable;

public class CollaboratoreRequestDTO implements Serializable {

    OperatoreRequestDTO operatoreRequestDTO ;
    Risorse risorsa;

    public OperatoreRequestDTO getOperatoreRequestDTO() {
        return operatoreRequestDTO;
    }

    public void setOperatoreRequestDTO(OperatoreRequestDTO operatoreRequestDTO) {
        this.operatoreRequestDTO = operatoreRequestDTO;
    }

    public Risorse getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorse risorsa) {
        this.risorsa = risorsa;
    }
}
