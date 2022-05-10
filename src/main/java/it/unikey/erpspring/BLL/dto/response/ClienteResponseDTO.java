package it.unikey.erpspring.BLL.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class ClienteResponseDTO {
    private Long id;
    private String nome;
    private String piva;
    private List<FatturaResponseDTO> fatturaResponseDTOS;
    private List<ClienteResponseDTO> clienteResponseDTOS;
    private AziendaResponseDTO aziendaResponseDTO;
}
