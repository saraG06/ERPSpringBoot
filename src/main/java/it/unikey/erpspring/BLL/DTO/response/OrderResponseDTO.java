package it.unikey.erpspring.BLL.DTO.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderResponseDTO {

    private Long id;
    private String detail;
    private LocalDate date;
    private Double price;
    private WorkerResponseDTO workerResponseDTO;
    private ClientResponseDTO clientResponseDTO;
}
