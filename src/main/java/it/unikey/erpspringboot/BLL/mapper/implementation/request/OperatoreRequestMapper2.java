package it.unikey.erpspringboot.BLL.mapper.implementation.request;

import it.unikey.erpspringboot.BLL.dto.Request.OperatoreRequestDTO2;
import it.unikey.erpspringboot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erpspringboot.DAL.Entity.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreRequestMapper2 extends GenericRequestMapper<Operatore, OperatoreRequestDTO2> {
}
