package it.unikey.erp_springboot.BLL.mapper.implementation;

import it.unikey.erp_springboot.BLL.dto.request.InvoiceRequestDTO;
import it.unikey.erp_springboot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.erp_springboot.DAL.Entity.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceRequestMapper extends GenericRequestMapper<Invoice, InvoiceRequestDTO> {
}
