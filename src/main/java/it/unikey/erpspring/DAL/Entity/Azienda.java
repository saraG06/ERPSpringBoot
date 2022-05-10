package it.unikey.erpspring.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "azienda")
public class Azienda {

    @Column(name = "nome")
    private String nome;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "azienda")
    private List<Operatore> operatori;

    @OneToMany(mappedBy = "azienda")
    private List<Cliente> clienti;

    @OneToMany(mappedBy = "azienda")
    private List<Ordine> ordini;

    @Override
    public String toString() {
        return "Azienda{" +
                "id=" + id +
                ", operatori=" + operatori +
                ", clienti=" + clienti +
                ", ordini=" + ordini +
                '}';
    }
}
