package it.unikey.BLL.dto.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import it.unikey.DAL.Entity.LocalDateFix.LocalDateDeserializer;
import it.unikey.DAL.Entity.LocalDateFix.LocalDateSerializer;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OperatorRequestDTO {
    private String name;
    private String surname;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate birth;
    private CompanyRequestDTO companyRequestDTO;
}
