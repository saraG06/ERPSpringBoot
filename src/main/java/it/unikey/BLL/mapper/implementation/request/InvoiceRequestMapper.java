package it.unikey.BLL.mapper.implementation.request;

import it.unikey.BLL.dto.request.InvoiceRequestDTO;
import it.unikey.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.DAL.Entity.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceRequestMapper extends GenericRequestMapper<Invoice, InvoiceRequestDTO> {
}
