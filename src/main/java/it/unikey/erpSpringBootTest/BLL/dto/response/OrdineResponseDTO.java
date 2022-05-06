package it.unikey.erpSpringBootTest.BLL.dto.response;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class OrdineResponseDTO {

    private Long id;
    private LocalDate data ;
    private double importo;
    private String dettaglio;
    private List<ClienteResponseDTO> clienteResponseDTOList;
}
