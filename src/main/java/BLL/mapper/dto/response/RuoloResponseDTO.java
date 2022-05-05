package BLL.mapper.dto.response;

import lombok.Data;

@Data
public class RuoloResponseDTO {

    private Long id;
    private String ruolo;
    private Persona persona;
}
