package BLL.mapper.implementation;
import BLL.dto.request.ContattoRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.persone.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoRequestMapper extends GenericRequestMapper<Contatto, ContattoRequestDTO> {
}
