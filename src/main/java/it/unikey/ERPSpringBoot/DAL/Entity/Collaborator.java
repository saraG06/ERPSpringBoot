package it.unikey.ERPSpringBoot.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "collaborator")

public class Collaborator{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    @OneToOne
    @JoinColumn(name = "worker_id", referencedColumnName = "id", nullable=false)
    private Worker worker;

    @OneToMany(mappedBy = "collaborator")
    private List<Resource> resources;


//crea un oggetto di tipo Operatore e fai una onetoone all'interno di collaborator e



}
