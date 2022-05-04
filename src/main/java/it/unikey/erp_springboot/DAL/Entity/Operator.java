package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "lastname", nullable = false)
    private String lastname;
    @Column(name = "birthday", nullable = false)
    private LocalDate birth;
    @Column(name = "resource")
    private Resource resource;
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

}
