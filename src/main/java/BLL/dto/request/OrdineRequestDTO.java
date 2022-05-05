package BLL.dto.request;

import java.time.LocalDate;

public class OrdineRequestDTO {

    LocalDate data ;
    double importo ;
    String dettaglio ;

    OperatoreRequestDTO operatoreRequestDTO ;

    ClienteRequestDTO clienteRequestDTO ;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public String getDettaglio() {
        return dettaglio;
    }

    public void setDettaglio(String dettaglio) {
        this.dettaglio = dettaglio;
    }

    public OperatoreRequestDTO getOperatoreRequestDTO() {
        return operatoreRequestDTO;
    }

    public void setOperatoreRequestDTO(OperatoreRequestDTO operatoreRequestDTO) {
        this.operatoreRequestDTO = operatoreRequestDTO;
    }

    public ClienteRequestDTO getClienteRequestDTO() {
        return clienteRequestDTO;
    }

    public void setClienteRequestDTO(ClienteRequestDTO clienteRequestDTO) {
        this.clienteRequestDTO = clienteRequestDTO;
    }
}
