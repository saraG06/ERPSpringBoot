package com.example.erpspring.BLL.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
@Data
public class FatturaResponseDTO implements Serializable {

    private Long id;
    LocalDate data ;
    OrdineResponseDTO ordineResponseDTO ;
    ContattoResponseDTO contattoResponseDTO ;
}
