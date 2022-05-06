package it.unikey.erpSpringBootTest.BLL.dto.request;

import it.unikey.erpSpringBootTest.DAL.Entity.Cliente;
import it.unikey.erpSpringBootTest.DAL.Entity.Dipendente;
import it.unikey.erpSpringBootTest.DAL.Entity.Fattura;
import it.unikey.erpSpringBootTest.DAL.Entity.Ordine;
import lombok.Data;

import java.util.List;

@Data
public class AziendaRequestDTO {

    private List<CollaboratoreRequestDTO> collaboratoreRequestDTOList;
    private List<DipendenteRequestDTO> dipendenteRequestDTOList;
    private List<ClienteRequestDTO> clienteRequestDTOList;
    private List<FatturaRequestDTO> fatturaRequestDTOList;
    private List<OrdineRequestDTO> ordineRequestDTOList;
}
