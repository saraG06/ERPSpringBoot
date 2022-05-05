package BLL.mapper.implementation;
import BLL.dto.request.DipendenteRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.persone.Dipendente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DipendenteRequestMapper extends GenericRequestMapper<Dipendente, DipendenteRequestDTO> {
}
