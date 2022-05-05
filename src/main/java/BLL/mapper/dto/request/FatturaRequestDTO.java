package BLL.mapper.dto.request;

import DAL.Entity.Contatto;
import DAL.Entity.Ordine;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FatturaRequestDTO {

    private LocalDate data;
    private Contatto contatto;
    private Ordine ordine;
}
