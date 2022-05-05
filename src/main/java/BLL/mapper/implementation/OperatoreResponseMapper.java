package BLL.mapper.implementation;
import BLL.dto.response.OperatoreResponseDTO;
import BLL.mapper.abstraction.GenericResponseMapper;
import DAL.Entity.persone.Operatore;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperatoreResponseMapper extends GenericResponseMapper<Operatore, OperatoreResponseDTO> {
}
