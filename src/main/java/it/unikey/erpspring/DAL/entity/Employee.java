package it.unikey.erpspring.DAL.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fistName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "birthDate")
    private LocalDate birthDate;

    @Column(name = "hiringDate")
    private LocalDate hiringDate;



    @Enumerated
    @Column(name = "role")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToOne
    @JoinColumn(name = "worker_id", referencedColumnName = "id", nullable = false)
    private Worker worker;

    @OneToMany(mappedBy = "employee")
    private List<Risorsa> risorseAssegnate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", hiringDate=" + hiringDate +
                ", role=" + role +
                ", company=" + company +
                ", risorseAssegnate=" + risorseAssegnate +
                '}';
    }
}
