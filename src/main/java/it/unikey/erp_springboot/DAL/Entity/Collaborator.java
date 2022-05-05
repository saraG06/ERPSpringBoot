package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "collaborator")
public class Collaborator {

    @Id
    private Long id;
    @OneToOne
    @JoinColumn(referencedColumnName = "operator", nullable = false)
    private Operator operator;

    @Column(name = "resource")
    @Enumerated(EnumType.ORDINAL)
    private Resource resource;
    @OneToMany(mappedBy = "collaborator")
    List<Order> orders = new ArrayList<Order>();

}
