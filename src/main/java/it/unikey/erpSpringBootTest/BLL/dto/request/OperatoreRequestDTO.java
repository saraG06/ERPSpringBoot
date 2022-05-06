package it.unikey.erpSpringBootTest.BLL.dto.request;

import it.unikey.erpSpringBootTest.DAL.Entity.Ordine;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class OperatoreRequestDTO {

    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private List<OrdineRequestDTO> ordineRequestDTOList;

}
