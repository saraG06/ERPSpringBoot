package it.unikey.erpspring.DAL.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "risorsa")
public class Risorsa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated
    @Column(name = "assignedResources")
    private String assignedResources;

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


    public void setRisorsaAssegnata(AssignedResources assignedResources) {
        this.assignedResources = String.valueOf(assignedResources);
    }

    public String getRisorsaAssegnata() {
        return assignedResources;
    }
}
