package it.unikey.ERPSpringBoot.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ContactRequestDto {

    private String name;
    private String lastname;
    private LocalDate birthdate;
    private ClientRequestDto clientRequestDto;
    private InvoiceRequestDto invoiceRequestDto;
}
