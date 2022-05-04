package BLL.dto.Request;

import lombok.Data;

@Data
public class ContattoRequestDTO extends PersonaRequestDTO{

    private ClienteRequestDTO clienteRequestDTO;
}
