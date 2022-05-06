package it.unikey.ERPSpringBoot.BLL.mapper.implementation;

import it.unikey.ERPSpringBoot.BLL.dto.request.InvoiceRequestDto;
import it.unikey.ERPSpringBoot.BLL.mapper.abstraction.GenericRequestMapper;
import it.unikey.ERPSpringBoot.DAL.Entity.Invoice;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface InvoiceRequestMapper extends GenericRequestMapper<InvoiceRequestDto, Invoice> {
}
