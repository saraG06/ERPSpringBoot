package BLL.mapper.dto.response;

import DAL.Entity.Cliente;
import DAL.Entity.Fattura;
import lombok.Data;

import java.util.List;

@Data
public class ContattoResponseDTO {

    private Long id;
    private Cliente cliente;
    private List<Fattura> listaFatture;
}
