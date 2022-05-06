package it.unikey.BLL.mapper.dto.response;

import it.unikey.DAL.Entity.Cliente;
import it.unikey.DAL.Entity.Fattura;
import lombok.Data;

import java.util.List;

@Data
public class ContattoResponseDTO {

    private Long id;
    private Cliente cliente;
    private List<Fattura> listaFatture;
}
