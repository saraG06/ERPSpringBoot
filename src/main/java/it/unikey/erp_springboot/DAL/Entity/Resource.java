package it.unikey.erp_springboot.DAL.Entity;

import javax.persistence.Entity;

public enum Resource {
    CAR(1L), PHONE(2L), PC(3L);

    private Long id;

    Resource(Long id) {
        this.id = id;
    }
}
