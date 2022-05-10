package it.unikey.erpspring.BLL.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class ClienteRequestDTO {
    private String nome;
    private String piva;
    private List<FatturaRequestDTO> fatturaRequestDTOS;
    private List<ClienteRequestDTO> clienteRequestDTOS;
    private AziendaRequestDTO aziendaRequestDTO;
}
