package BLL.dto.request;

import DAL.Entity.Enum.Risorse;
import DAL.Entity.Enum.Ruoli;

import java.time.LocalDate;

public class DipendenteRequestDTO {

    OperatoreRequestDTO operatoreRequestDTO ;
    private LocalDate dataAssunzione ;
    private Risorse risorsa;
    private Ruoli ruolo;

    public OperatoreRequestDTO getOperatoreRequestDTO() {
        return operatoreRequestDTO;
    }

    public void setOperatoreRequestDTO(OperatoreRequestDTO operatoreRequestDTO) {
        this.operatoreRequestDTO = operatoreRequestDTO;
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public Risorse getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorse risorsa) {
        this.risorsa = risorsa;
    }

    public Ruoli getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruoli ruolo) {
        this.ruolo = ruolo;
    }
}
