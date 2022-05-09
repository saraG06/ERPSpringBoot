package com.example.erpspring.BLL.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
@Data
public class ContattoResponseDTO implements Serializable {
    private Long id;
    private String nome;

    private String cognome;

    private LocalDate dataNascita ;

    private ClienteResponseDTO clienteResponseDTO ;

    private List<FatturaResponseDTO> fatturaResponseDTOList;
}
