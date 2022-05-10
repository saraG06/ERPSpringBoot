package it.unikey.erpspring.BLL.mapper.implementazioni.request;

import it.unikey.erpspring.BLL.dto.request.RisorsaRequestDTO;
import it.unikey.erpspring.BLL.mapper.astratti.GenericRequestMapper;
import it.unikey.erpspring.DAL.Entity.Risorsa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RisorsaRequestMapper extends GenericRequestMapper<Risorsa, RisorsaRequestDTO> {
}
