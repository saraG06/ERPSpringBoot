package BLL.mapper.implementazioni.request;

import BLL.dto.request.OrdineRequestDTO;
import BLL.mapper.astratti.GenericRequestMapper;
import DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineRequestMapper extends GenericRequestMapper<Ordine, OrdineRequestDTO> {
}
