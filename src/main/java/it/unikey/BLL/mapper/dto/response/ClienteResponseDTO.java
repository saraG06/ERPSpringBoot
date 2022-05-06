package it.unikey.BLL.mapper.dto.response;

import it.unikey.DAL.Entity.Contatto;
import it.unikey.DAL.Entity.Ordine;
import lombok.Data;

import java.util.List;

@Data
public class ClienteResponseDTO {

    private Long id;
    private String nome;
    private String PI;
    private List<ContattoResponseDTO> listaContattoResponseDTO;
    private List<OrdineResponseDTO> listaOrdineResponseDTO;
}
