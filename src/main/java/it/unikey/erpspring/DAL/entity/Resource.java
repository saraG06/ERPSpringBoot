package it.unikey.erpspring.DAL.entity;

import it.unikey.erpspring.DAL.enumerators.AssignedResources;

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
    private Employee employee;

    @ManyToOne(cascade = CascadeType.ALL)
    private Collaborator collaborator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssignedResource() {
        return assignedResource;
    }

    public void setAssignedResource(AssignedResources assignedResources) {
        this.assignedResource = assignedResources.name();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }
}
