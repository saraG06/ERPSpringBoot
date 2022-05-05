package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericRequestMapper;
import BLL.mapper.dto.request.DipendenteRequestDTO;
import DAL.Entity.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteRequestMapper extends GenericRequestMapper<Dipendente, DipendenteRequestDTO> {
}
