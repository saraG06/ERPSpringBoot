package it.unikey.BLL.mapper.dto.request;

import it.unikey.DAL.Entity.Cliente;
import it.unikey.DAL.Entity.Fattura;
import lombok.Data;

import java.util.List;

@Data
public class ContattoRequestDTO {

    private Cliente cliente;
    private List<Fattura> listaFatture;

}
