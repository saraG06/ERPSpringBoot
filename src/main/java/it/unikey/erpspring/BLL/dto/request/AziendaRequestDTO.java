package it.unikey.erpspring.BLL.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class AziendaRequestDTO {
    private String nome;
    private List<OperatoreRequestDTO> operatoreRequestDTOS;
    private List<ClienteRequestDTO> clienteRequestDTOS;
    private List<OrdineRequestDTO> ordineRequestDTOS;
}
