package BLL.mapper.dto.response;

import DAL.Entity.Contatto;
import DAL.Entity.Ordine;
import lombok.Data;

import java.util.List;

@Data
public class ClienteResponseDTO {

    private Long id;
    private String nome;
    private String PI;
    private List<Contatto> listaContatti;
    private List<Ordine> listaOrdini;
}
