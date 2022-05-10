package it.unikey.erpspring.BLL.dto.response;

import lombok.Data;

import java.util.Set;

@Data
public class ContattoResponseDTO {
    private Long id;
    private ContattoResponseDTO contattoResponseDTO;
    private Set<FatturaResponseDTO> fatturaResponseDTOS;
}
