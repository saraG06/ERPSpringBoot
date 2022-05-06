package it.unikey.erpSpringBootTest.BLL.dto.request;

import it.unikey.erpSpringBootTest.DAL.Entity.Contatto;
import it.unikey.erpSpringBootTest.DAL.Entity.Ordine;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FatturaRequestDTO {

    private LocalDate data;
    private OrdineRequestDTO ordineRequestDTO;
    private ContattoRequestDTO contattoRequestDTO;
}
