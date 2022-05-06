package it.unikey.BLL.mapper.dto.request;

import it.unikey.BLL.mapper.dto.response.ContattoResponseDTO;
import it.unikey.BLL.mapper.dto.response.OrdineResponseDTO;
import it.unikey.DAL.Entity.Contatto;
import it.unikey.DAL.Entity.Ordine;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FatturaRequestDTO {

    private LocalDate data;
    private ContattoResponseDTO contattoResponseDTO;
    private OrdineResponseDTO ordineResponseDTO;
}
