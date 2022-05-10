package it.unikey.erpspring.BLL.dto.request;

import lombok.Data;

import java.util.Set;

@Data
public class ContattoRequestDTO {
    private ContattoRequestDTO contattoRequestDTO;
    private Set<FatturaRequestDTO> fatturaRequestDTOSet;
}
