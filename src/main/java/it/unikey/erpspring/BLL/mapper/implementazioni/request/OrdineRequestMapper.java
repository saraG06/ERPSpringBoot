package it.unikey.erpspring.BLL.mapper.implementazioni.request;

import it.unikey.erpspring.BLL.dto.request.OrdineRequestDTO;
import it.unikey.erpspring.BLL.mapper.astratti.GenericRequestMapper;
import it.unikey.erpspring.DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineRequestMapper extends GenericRequestMapper<Ordine, OrdineRequestDTO> {
}
