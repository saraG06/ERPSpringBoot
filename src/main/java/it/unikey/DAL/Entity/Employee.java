package it.unikey.DAL.Entity;

import it.unikey.DAL.Entity.Enum.Resources;
import it.unikey.DAL.Entity.Enum.Roles;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee extends Operator implements Serializable {
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "birth", nullable = false)
    private LocalDate birth;
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

    public Employee(String name, String surname, String birth, String dateOfEmployment, String role, Company c) {
        this.name = name;
        this.surname = surname;
        this.birth = LocalDate.parse(birth);
        this.dateOfEmployment = LocalDate.parse(dateOfEmployment);
        this.role = Roles.valueOf(role.toUpperCase());
        this.company = c;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Resources getResource() {
        return resource;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setResource(String resource) {
        this.resource = Resources.valueOf(resource.toUpperCase());
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
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
        return  name + " " + surname + " " + birth + " "
                + resource + " " + dateOfEmployment + " " + role.name();
    }
}
