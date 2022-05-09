package com.example.erpspring.BLL.dto.response;

import com.example.erpspring.BLL.dto.request.OperatoreRequestDTO;
import com.example.erpspring.DAL.Entity.Enum.Risorse;
import lombok.Data;

import java.io.Serializable;
@Data
public class CollaboratoreResponseDTO implements Serializable {
    private Long id;
    OperatoreRequestDTO operatoreResponseDTO ;
    Risorse risorsa;
}
