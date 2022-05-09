package com.example.erpspring.BLL.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
@Data
public class OrdineResponseDTO implements Serializable {

    private Long id;
    LocalDate data ;
    double importo ;
    String dettaglio ;

    OperatoreResponseDTO operatoreResponseDTO ;

    ClienteResponseDTO clienteResponseDTO ;
}
