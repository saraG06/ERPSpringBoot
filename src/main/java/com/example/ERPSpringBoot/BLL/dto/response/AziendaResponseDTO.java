package com.example.ERPSpringBoot.BLL.dto.response;

import lombok.Data;
import java.util.List;
@Data
public class AziendaResponseDTO {
    private Long id;
    private List<DipendenteResponseDTO> dipendenteResponseDTOList;
    private List<CollaboratoreResponseDTO> collaboratoreResponseDTOList;
    private List<FatturaResponseDTO> fatturaResponseDTOList;
    private List<ContattoResponseDTO> contattoResponseDTOList;
    private List<OrdineResponseDTO> ordineResponseDTOList;
}
