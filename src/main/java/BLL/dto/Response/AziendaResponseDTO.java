package BLL.dto.Response;

import lombok.Data;

import java.util.List;

@Data
public class AziendaResponseDTO {

    private Long id;
    private String nome;
    private List<DipendenteResponseDTO> dipendenteResponseDTOList;
    private List<CollaboratoreResponseDTO> collaboratoreResponseDTOList;
    private List<ContattoResponseDTO> contattoResponseDTOList;
}
