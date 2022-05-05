package BLL.mapper.implementation;
import BLL.dto.request.OperatoreRequestDTO;
import BLL.mapper.abstraction.GenericRequestMapper;
import DAL.Entity.persone.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreRequestMapper extends GenericRequestMapper<Operatore, OperatoreRequestDTO> {
}
