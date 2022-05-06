package BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ContattoRequestDTO {

    private String nome;

    private String cognome;

    private LocalDate dataNascita ;

    private ClienteRequestDTO clienteRequestDTO ;

    private List<FatturaRequestDTO> fatturaRequestDTOList;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public ClienteRequestDTO getClienteRequestDTO() {
        return clienteRequestDTO;
    }

    public void setClienteRequestDTO(ClienteRequestDTO clienteRequestDTO) {
        this.clienteRequestDTO = clienteRequestDTO;
    }

    public List<FatturaRequestDTO> getFatturaRequestDTOList() {
        return fatturaRequestDTOList;
    }

    public void setFatturaRequestDTOList(List<FatturaRequestDTO> fatturaRequestDTOList) {
        this.fatturaRequestDTOList = fatturaRequestDTOList;
    }


}
