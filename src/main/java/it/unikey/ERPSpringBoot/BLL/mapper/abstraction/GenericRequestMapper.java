package it.unikey.ERPSpringBoot.BLL.mapper.abstraction;

import java.util.List;


    public interface GenericRequestMapper <D,E>{ //da dto mi deve tornare un Entità

        E asEntity(D dto);
        List<E> asEntityList (List<D> entities);
}
