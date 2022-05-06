package it.unikey.erpSpringBootTest.BLL.dto.request;

import it.unikey.erpSpringBootTest.DAL.Entity.Cliente;
import lombok.Data;

import java.time.LocalDate;
@Data
public class OrdineRequestDTO {

    private LocalDate data;
    private Double importo;
    private String dettaglio;
    private ClienteRequestDTO clienteRequestDTO;

}
