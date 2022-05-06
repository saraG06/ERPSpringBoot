package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

    @Data
    @Entity
    @Table(name = "collaborator")
    public class Collaborator implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Enumerated
        @Column(name = "resource", nullable = false)
        private Resource resource;

        @OneToMany(mappedBy = "collaborator")
        private List<Order> orders;

        @OneToOne
        @JoinColumn(name = "operatore_id", referencedColumnName = "id", nullable = false)
        private Operator operator;
}
