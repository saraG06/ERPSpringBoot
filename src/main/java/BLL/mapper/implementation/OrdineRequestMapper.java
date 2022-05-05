package BLL.mapper.implementation;
import BLL.dto.request.OrdineRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.Ordine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdineRequestMapper extends GenericRequestMapper<Ordine, OrdineRequestDTO> {
}
