package BLL.mapper.implementation;
import BLL.dto.response.ContattoResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.persone.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoResponseMapper extends GenericResponseMapper<Contatto, ContattoResponseDTO> {
}
