package com.example.erpspring.BLL.dto.response;

import java.time.LocalDate;
import java.util.List;

public class ContattoResponseDTO {
    private Long id;
    private String nome;

    private String cognome;

    private LocalDate dataNascita ;

    private ClienteResponseDTO clienteResponseDTO ;

    private List<FatturaResponseDTO> fatturaResponseDTOList;
}
