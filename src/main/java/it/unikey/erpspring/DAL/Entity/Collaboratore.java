package it.unikey.erpspring.DAL.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "collaboratore")
public class Collaboratore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Operatore operatore;

    @Override
    public String toString() {
        return "Collaboratore{" +
                "id=" + id +
                ", operatore=" + operatore +
                '}';
    }
}
