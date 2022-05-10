package it.unikey.erpspring.BLL.DTO.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ContactResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private ClientResponseDTO clientResponseDTO;
}
