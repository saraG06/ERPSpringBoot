package BLL.mapper.implementation.request;

import BLL.dto.Request.ContattoRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.Contatto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContattoRequestMapper extends GenericRequestMapper<Contatto, ContattoRequestDTO> {
}
