package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Enumerated
    @Column(name = "resource", nullable = false)
    private Resource resource;
    @Column(name = "dateOfEmployment", nullable = false)
    private LocalDate dateOfEmployment;
    @Enumerated
    @Column(name = "role", nullable = false)
    private Role role;
    @ManyToOne
    @JoinTable(name = "company", joinColumns = @JoinColumn(name = "id"))
    private Company company;

    @OneToMany(mappedBy = "employee")
    private List<Order> orders;

    @OneToOne()
    @JoinColumn(name = "operatore_id", referencedColumnName = "id", nullable = false)
    private Operator operator;

}
