package it.unikey.DAL.Entity;

import it.unikey.DAL.Entity.Enum.Resources;
import it.unikey.DAL.Entity.Enum.Roles;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
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
    private Resources resource;
    @Column(name = "dateOfEmployment", nullable = false)
    private LocalDate dateOfEmployment;
    @Enumerated
    @Column(name = "role", nullable = false)
    private Roles role;
    @ManyToOne
    @JoinTable(name = "company", joinColumns = @JoinColumn(name = "id"))
    private Company company;

    @OneToMany(mappedBy = "employee")
    private List<Order> orders;

    @OneToOne()
    @JoinColumn(name = "operatore_id", referencedColumnName = "id", nullable = false)
    private Operator operator;

    public Employee() {
    }

    public Resources getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = Resources.valueOf(resource.toUpperCase());
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = LocalDate.parse(dateOfEmployment);
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = Roles.valueOf(role.toUpperCase());
    }

    public void assignResourceToSubordinate(Employee e, String resource){
        if(this.getRole().getValue() > e.getRole().getValue() && this.getCompany().equals(e.getCompany())){
            e.setResource(resource);
        }
        else if (this.getRole().getValue() == 3 && this.getCompany().equals(e.getCompany())){
            e.setResource(resource);
        }
        else {
            System.out.println("Questo dipendente non può assegnare risorse");
        }
    }

    @Override
    public String toString() {
        return  resource.name() + " " + dateOfEmployment + " " + role.name();
    }
}
