package it.unikey.erp_springboot.DAL.Entity;

public enum Role {
    MANAGER(1L),
    PROJECTMANAGER(2L),
    OPERATOR(3L);
    private Long id;

    Role(Long id) {
        this.id = id;
    }
}
