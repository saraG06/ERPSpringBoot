package it.unikey.BLL.mapper.dto.request;

import it.unikey.DAL.Entity.Contatto;
import it.unikey.DAL.Entity.Ordine;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FatturaRequestDTO {

    private LocalDate data;
    private Contatto contatto;
    private Ordine ordine;
}
