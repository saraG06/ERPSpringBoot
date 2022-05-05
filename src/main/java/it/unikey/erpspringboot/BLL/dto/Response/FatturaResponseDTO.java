package it.unikey.erpspringboot.BLL.dto.Response;

import lombok.Data;

import java.time.LocalDate;
@Data
public class FatturaResponseDTO {

    private Long id;
    private LocalDate data;
    private ContattoResponseDTO contattoResponseDTO;
    private OrdineResponseDTO ordineResponseDTO;
}
