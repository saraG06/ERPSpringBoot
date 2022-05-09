package com.example.erpspring.BLL.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class OperatoreResponseDTO implements Serializable {

    private Long id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
}
