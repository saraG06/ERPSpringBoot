package it.unikey.erpspring.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "contatto")
public class Contatto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "cognome")
    private String cognome;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente clienti;

    @ManyToMany
    Set<Fattura> fatturas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Cliente getClienti() {
        return clienti;
    }

    public void setClienti(Cliente clienti) {
        this.clienti = clienti;
    }

    public Set<Fattura> getFatturas() {
        return fatturas;
    }

    public void setFatturas(Set<Fattura> fatturas) {
        this.fatturas = fatturas;
    }
}
