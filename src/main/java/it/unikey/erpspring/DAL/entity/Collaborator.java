package it.unikey.erpspring.DAL.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "collaborator")
public class Collaborator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fistName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "birthDate")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "collaborator")
    private List<Risorsa> risorseAssegnate;

    @OneToOne
    @JoinColumn(name = "worker_id", referencedColumnName = "id", nullable = false)
    private Worker worker;

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

    @Override
    public String toString() {
        return "Collaborator{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", risorseAssegnate=" + risorseAssegnate +
                '}';
    }
}
