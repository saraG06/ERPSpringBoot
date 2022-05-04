package BLL.dto.Request;

import lombok.Data;

import java.util.List;

@Data
public class AziendaRequestDTO {

    private String nome;
    private List<DipendenteRequestDTO> dipendenteRequestDTOList;
    private List<CollaboratoreRequestDTO> collaboratoreRequestDTOList;
    private List<ContattoRequestDTO> contattoRequestDTOList;
}
