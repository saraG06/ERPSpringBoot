package it.unikey.erpspring.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class FatturaRequestDTO {
    private LocalDate data;
    private OrdineRequestDTO ordineRequestDTO;
    private ClienteRequestDTO clienteRequestDTO;
}
