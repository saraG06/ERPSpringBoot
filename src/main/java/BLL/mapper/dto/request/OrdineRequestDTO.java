package BLL.mapper.dto.request;

import DAL.Entity.Cliente;
import DAL.Entity.Fattura;
import DAL.Entity.Operatore;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OrdineRequestDTO {

    private String dettaglio;
    private LocalDate dataImporto;
    private Operatore operatore;
    private Cliente cliente;
    private Fattura fattura;
}
