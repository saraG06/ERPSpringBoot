package it.unikey.erpSpringBootTest.BLL.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrdineResponseDTO {

    private Long id;
    private LocalDate data ;
    private double importo;
    private String dettaglio;
    private ClienteResponseDTO clienteResponseDTO;
}
