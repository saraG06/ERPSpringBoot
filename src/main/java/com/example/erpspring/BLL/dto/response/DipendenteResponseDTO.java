package com.example.erpspring.BLL.dto.response;

import com.example.erpspring.BLL.dto.request.OperatoreRequestDTO;
import com.example.erpspring.DAL.Entity.Enum.Risorse;
import com.example.erpspring.DAL.Entity.Enum.Ruoli;

import java.time.LocalDate;

public class DipendenteResponseDTO {
    private Long id;
    OperatoreRequestDTO operatoreResponseDTO ;
    private LocalDate dataAssunzione ;
    private Risorse risorsa;
    private Ruoli ruolo;

}
