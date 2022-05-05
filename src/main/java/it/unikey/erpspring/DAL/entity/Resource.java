package it.unikey.erpspring.DAL.entity;

import it.unikey.erpspring.DAL.enumerators.AssignedResources;

import javax.persistence.*;

@Entity
@Table(name = "resurce")
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
