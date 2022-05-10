package it.unikey.erpspring.BLL.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class AziendaResponseDTO {
    private Long id;
    private String nome;
    private List<OperatoreResponseDTO> operatoreResponseDTOS;
    private List<ClienteResponseDTO> clienteResponseDTOS;
    private List<OrdineResponseDTO> ordineResponseDTOS;
}
