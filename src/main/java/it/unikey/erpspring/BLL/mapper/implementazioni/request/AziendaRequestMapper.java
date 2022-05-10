package it.unikey.erpspring.BLL.mapper.implementazioni.request;

import it.unikey.erpspring.BLL.dto.request.AziendaRequestDTO;
import it.unikey.erpspring.BLL.mapper.astratti.GenericRequestMapper;
import it.unikey.erpspring.DAL.Entity.Azienda;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AziendaRequestMapper extends GenericRequestMapper<Azienda, AziendaRequestDTO> {
}
