package it.unikey.erp_springboot.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ContactRequestDTO {

    private String name;
    private String lastname;
    private LocalDate birth;
    private ClientRequestDTO clientRequestDTO;
}
