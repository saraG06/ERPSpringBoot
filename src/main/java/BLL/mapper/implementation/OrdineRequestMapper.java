package BLL.mapper.implementation;

import BLL.mapper.abstraction.GenericRequestMapper;
import BLL.mapper.dto.request.OrdineRequestDTO;
import DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineRequestMapper extends GenericRequestMapper<Ordine, OrdineRequestDTO> {
}
