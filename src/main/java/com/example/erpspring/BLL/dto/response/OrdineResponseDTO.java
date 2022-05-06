package com.example.erpspring.BLL.dto.response;

import java.time.LocalDate;

public class OrdineResponseDTO {

    private Long id;
    LocalDate data ;
    double importo ;
    String dettaglio ;

    OperatoreResponseDTO operatoreResponseDTO ;

    ClienteResponseDTO clienteResponseDTO ;
}
