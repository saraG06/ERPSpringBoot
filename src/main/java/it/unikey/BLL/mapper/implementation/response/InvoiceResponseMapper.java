package it.unikey.BLL.mapper.implementation.response;

import it.unikey.BLL.dto.response.InvoiceResponseDTO;
import it.unikey.BLL.mapper.abstraction.GenericResponseMapper;
import it.unikey.DAL.Entity.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceResponseMapper extends GenericResponseMapper<Invoice, InvoiceResponseDTO> {
}
