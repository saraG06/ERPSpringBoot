package it.unikey.erpspring.BLL.mapper.implementazioni.response;

import it.unikey.erpspring.BLL.dto.response.OrdineResponseDTO;
import it.unikey.erpspring.BLL.mapper.astratti.GenericResponseMapper;
import it.unikey.erpspring.DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineResponseMapper extends GenericResponseMapper<Ordine, OrdineResponseDTO> {
}
