package BLL.mapper.implementation.request;

import BLL.dto.Request.DipendenteRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteRequestMapper extends GenericRequestMapper<Dipendente, DipendenteRequestDTO> {
}
