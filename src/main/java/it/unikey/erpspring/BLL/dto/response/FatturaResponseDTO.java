package it.unikey.erpspring.BLL.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class FatturaResponseDTO {
    Long id;
    private LocalDate data;
    private OperatoreResponseDTO operatoreResponseDTO;
    private ContattoResponseDTO contattoResponseDTO;
}
