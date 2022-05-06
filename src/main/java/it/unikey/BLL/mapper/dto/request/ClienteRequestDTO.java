package it.unikey.BLL.mapper.dto.request;

import it.unikey.BLL.mapper.dto.response.ContattoResponseDTO;
import it.unikey.BLL.mapper.dto.response.OrdineResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class ClienteRequestDTO {

    private String nome;
    private String PI;
    private List<ContattoResponseDTO> listaContattoResponseDTO;
    private List<OrdineResponseDTO> listaOrdineResponseDTO;
}
