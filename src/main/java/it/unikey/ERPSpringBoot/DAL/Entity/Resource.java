package it.unikey.ERPSpringBoot.DAL.Entity;

import javax.persistence.*;

@Entity
@Table(name = "resource")

public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "assignedResource")
    private String assignedResource;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "collaborator_id")
    private Collaborator collaborator;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    //name risorsaAssegnata, private String assignedResourse

    //Many to one con employee e collaborator
}
