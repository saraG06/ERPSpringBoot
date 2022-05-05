package BLL.mapper.dto.response;

import DAL.Entity.Contatto;
import DAL.Entity.Ordine;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FatturaResponseDTO {

    private Long id;
    private LocalDate data;
    private Contatto contatto;
    private Ordine ordine;
}
