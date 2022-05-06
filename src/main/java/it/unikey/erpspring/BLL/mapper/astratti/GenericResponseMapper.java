package it.unikey.erpspring.BLL.mapper.astratti;

import java.util.List;

public interface GenericResponseMapper<E,D> {
    D asDTO (E entity);
    List<D> asDTOList(List<E> entities);
}