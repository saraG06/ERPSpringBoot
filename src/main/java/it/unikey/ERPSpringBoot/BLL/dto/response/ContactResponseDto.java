package it.unikey.ERPSpringBoot.BLL.dto.response;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ContactResponseDto {

    private Long id;
    private String name;
    private String lastname;
    private LocalDate birthdate;
    private ClientResponseDto clientResponseDto;
    private InvoiceResponseDto invoiceResponseDto;
}
