package com.example.erpspring.BLL.dto.request;

import java.io.Serializable;
import java.time.LocalDate;

public class OperatoreRequestDTO implements Serializable {

    private String nome;

    private String cognome;

    private LocalDate dataNascita ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
}
