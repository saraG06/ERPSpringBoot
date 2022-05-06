package it.unikey.erpSpringBootTest.BLL.dto.response;

import it.unikey.erpSpringBootTest.DAL.Entity.*;
import lombok.Data;

import java.util.List;

@Data
public class AziendaResponseDTO {

    private Long id;
    private List<CollaboratoreResponseDTO> collaboratoreResponseDTOList;
    private List<DipendenteResponseDTO> dipendenteResponseDTOList;
    private List<ClienteResponseDTO> clienteResponseDTOList;
    private List<FatturaResponseDTO> fatturaResponseDTOList;
    private List<OrdineResponseDTO> ordineResponseDTOList;
}
