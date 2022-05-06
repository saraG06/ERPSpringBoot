package com.example.erpspring.BLL.dto.request;

import java.time.LocalDate;

public class FatturaRequestDTO {

    LocalDate data ;
    OrdineRequestDTO ordineRequestDTO ;
    ContattoRequestDTO contattoRequestDTO ;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public OrdineRequestDTO getOrdineRequestDTO() {
        return ordineRequestDTO;
    }

    public void setOrdineRequestDTO(OrdineRequestDTO ordineRequestDTO) {
        this.ordineRequestDTO = ordineRequestDTO;
    }

    public ContattoRequestDTO getContattoRequestDTO() {
        return contattoRequestDTO;
    }

    public void setContattoRequestDTO(ContattoRequestDTO contattoRequestDTO) {
        this.contattoRequestDTO = contattoRequestDTO;
    }
}
