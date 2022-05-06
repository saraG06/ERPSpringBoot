package it.unikey.BLL.mapper.dto.request;

import it.unikey.DAL.Entity.Contatto;
import it.unikey.DAL.Entity.Ordine;
import lombok.Data;

import java.util.List;

@Data
public class ClienteRequestDTO {

    private String nome;
    private String PI;
    private List<Contatto> listaContatti;
    private List<Ordine> listaOrdini;
}
