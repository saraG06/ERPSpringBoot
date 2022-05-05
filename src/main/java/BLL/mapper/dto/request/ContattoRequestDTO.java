package BLL.mapper.dto.request;

import DAL.Entity.Cliente;
import DAL.Entity.Fattura;
import lombok.Data;

import java.util.List;

@Data
public class ContattoRequestDTO {

    private Cliente cliente;
    private List<Fattura> listaFatture;

}
