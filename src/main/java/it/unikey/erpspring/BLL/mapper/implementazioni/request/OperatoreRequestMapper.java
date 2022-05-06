package it.unikey.erpspring.BLL.mapper.implementazioni.request;

import it.unikey.erpspring.BLL.dto.request.OperatoreRequestDTO;
import it.unikey.erpspring.BLL.mapper.astratti.GenericRequestMapper;
import it.unikey.erpspring.DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreRequestMapper extends GenericRequestMapper<Operatore, OperatoreRequestDTO> {
}