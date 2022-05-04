package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "collaborator")
public class Collaborator extends Operator{

    @Id
    private Long id;
    @OneToOne
    @JoinColumn(referencedColumnName = "operator", nullable = false)
    private Operator operator;
    @OneToMany(mappedBy = "collaborator")
    List<Order> orders = new ArrayList<Order>();

}
