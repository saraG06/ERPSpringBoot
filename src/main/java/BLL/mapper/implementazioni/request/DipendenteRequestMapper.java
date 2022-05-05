package BLL.mapper.implementazioni.request;

import BLL.dto.request.DipendenteRequestDTO;
import BLL.mapper.astratti.GenericRequestMapper;
import DAL.Entity.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteRequestMapper extends GenericRequestMapper<Dipendente, DipendenteRequestDTO> {
}
