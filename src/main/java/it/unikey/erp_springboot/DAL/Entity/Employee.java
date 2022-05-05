package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(referencedColumnName = "operator", nullable = false)
    private Operator operator;
    @Column(name = "role")
    @Enumerated(EnumType.ORDINAL)
    private Role role;
    @Column(name = "hiring")
    private LocalDate hiring;

    @Column(name = "resource")
    @Enumerated(EnumType.ORDINAL)
    private Resource resource;
    @OneToMany(mappedBy = "employee")
    private List<Order> orders = new ArrayList<Order>();


}
