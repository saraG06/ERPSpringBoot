package BLL.dto.request;

import DAL.Entity.Enum.Risorse;

public class CollaboratoreRequestDTO {

    OperatoreRequestDTO operatoreRequestDTO ;
    Risorse risorsa;

    public OperatoreRequestDTO getOperatoreRequestDTO() {
        return operatoreRequestDTO;
    }

    public void setOperatoreRequestDTO(OperatoreRequestDTO operatoreRequestDTO) {
        this.operatoreRequestDTO = operatoreRequestDTO;
    }

    public Risorse getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorse risorsa) {
        this.risorsa = risorsa;
    }
}
