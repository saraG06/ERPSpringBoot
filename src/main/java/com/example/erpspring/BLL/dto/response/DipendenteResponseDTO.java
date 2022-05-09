package com.example.erpspring.BLL.dto.response;

import com.example.erpspring.BLL.dto.request.OperatoreRequestDTO;
import com.example.erpspring.DAL.Entity.Enum.Risorse;
import com.example.erpspring.DAL.Entity.Enum.Ruoli;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
@Data
public class DipendenteResponseDTO implements Serializable {
    private Long id;
    OperatoreRequestDTO operatoreResponseDTO ;
    private LocalDate dataAssunzione ;
    private Risorse risorsa;
    private Ruoli ruolo;

}
