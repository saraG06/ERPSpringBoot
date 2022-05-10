package it.unikey.erpspring.BLL.mapper.implementazioni.response;

import it.unikey.erpspring.BLL.dto.response.RisorseResponseDTO;
import it.unikey.erpspring.BLL.mapper.astratti.GenericResponseMapper;
import it.unikey.erpspring.DAL.Entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorseResponseMapper extends GenericResponseMapper<Risorsa, RisorseResponseDTO> {
}
