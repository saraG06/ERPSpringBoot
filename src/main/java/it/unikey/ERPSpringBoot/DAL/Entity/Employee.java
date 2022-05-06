package it.unikey.ERPSpringBoot.DAL.Entity;

import it.unikey.ERPSpringBoot.DAL.Enumerators.Role;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee")

public class Employee{


    //crea una onetoone con operatore(worker) e un oggetto di tipo operatore
    //metti dataassunzione, id

    @OneToOne
    @JoinColumn(name = "worker_id", referencedColumnName = "id", nullable=false)
    private Worker worker;
    @ManyToOne
    @JoinColumn(name = "streams_id")
    private Streams streams;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "resource", nullable = false)
    @JoinColumn(name = "resource_id")
    private String assignedResources;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @OneToMany(mappedBy = "employee")
    private List<Resource> resourceList;

    @Column(name = "role")
    private Role role;

    @Column(name="hirindDate")
    private LocalDate hiringDate;


    public String getAssignedResources() {
        return assignedResources;
    }

    public void setAssignedResources(String assignedResources) {
        this.assignedResources = assignedResources;
    }

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Streams getStreams() {
        return streams;
    }

    public void setStreams(Streams streams) {
        this.streams = streams;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
