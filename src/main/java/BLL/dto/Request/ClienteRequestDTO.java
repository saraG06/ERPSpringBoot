package BLL.dto.Request;

import lombok.Data;

import java.util.List;

@Data
public class ClienteRequestDTO {

    private String nome;
    private String PI;
    private List<OrdineRequestDTO> ordineRequestDTO;
    private List<ContattoRequestDTO> contattoRequestDTO;
}
