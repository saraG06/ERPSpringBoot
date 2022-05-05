package BLL.mapper.dto.response;

import DAL.Entity.Cliente;
import DAL.Entity.Fattura;
import DAL.Entity.Operatore;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OrdineResponseDTO {

    private Long id;
    private String dettaglio;
    private LocalDate dataImporto;
    private Operatore operatore;
    private Cliente cliente;
    private Fattura fattura;
}
