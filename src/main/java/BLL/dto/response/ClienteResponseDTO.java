package BLL.dto.response;

import BLL.dto.request.OperatoreRequestDTO;
import DAL.Entity.Enum.Risorse;
import DAL.Entity.Enum.Ruoli;

import java.time.LocalDate;
import java.util.List;

public class ClienteResponseDTO {

    private String nome;
    private String pIva ;
    private List<ContattoResponseDTO> contattoResponseDTOList;

}
