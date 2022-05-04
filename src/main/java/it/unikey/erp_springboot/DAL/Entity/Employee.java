package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "employee")
public class Employee extends Operator{

    @Id
    private Long id;
    @OneToOne
    @JoinColumn(referencedColumnName = "operator", nullable = false)
    private Operator operator;
    @Column(name = "role", nullable = false)
    private Role role;
    @Column(name = "hiring")
    private LocalDate hiring;
    @OneToMany(mappedBy = "employee")
    private List<Order> orders = new ArrayList<Order>();


}
