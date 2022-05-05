package it.unikey.erpspringboot.BLL.dto.Response;

import lombok.Data;

import java.util.List;

@Data
public class ClienteResponseDTO {

    private Long id;
    private String nome;
    private String PI;
    private List<OrdineResponseDTO> ordineResponseDTO;
    private List<ContattoResponseDTO> contattoResponseDTO;
}
