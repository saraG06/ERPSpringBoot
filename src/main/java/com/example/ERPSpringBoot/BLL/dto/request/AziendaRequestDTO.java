package com.example.ERPSpringBoot.BLL.dto.request;


import lombok.Data;
import java.util.List;
@Data
public class AziendaRequestDTO {
    private List<DipendenteRequestDTO> dipendenteRequestDTOList;
    private List<CollaboratoreRequestDTO> collaboratoreRequestDTOList;
    private List<FatturaRequestDTO> fatturaRequestDTOList;
    private List<ContattoRequestDTO> contattoRequestDTOList;
    private List<OrdineRequestDTO> ordineRequestDTOList;
}
