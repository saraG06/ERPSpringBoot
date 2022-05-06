package com.example.erpspring.BLL.dto.request;

import java.util.List;

public class ClienteRequestDTO {
    private List<ContattoRequestDTO> contattoRequestDTOList ;
//    private List<OrdineRequestDTO> ordineRequestDTOList ;
    private String nome;
    private String pIva ;

    public List<ContattoRequestDTO> getContattoRequestDTOList() {
        return contattoRequestDTOList;
    }

    public void setContattoRequestDTOList(List<ContattoRequestDTO> contattoRequestDTOList) {
        this.contattoRequestDTOList = contattoRequestDTOList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }
}
