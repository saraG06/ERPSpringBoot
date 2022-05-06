package it.unikey.erpSpringBootTest.DAL.Entity;

import it.unikey.erpSpringBootTest.DAL.Enum.Risorse;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "operatore")
public class Operatore implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;
    @Column(name = "dataNascita")
    private LocalDate dataNascita;
    @OneToMany(mappedBy = "operatore")
    private List<Ordine> ordine;
    @ManyToOne
    private Azienda azienda;

    public Operatore(String nome, String cognome, String dataNascita) {
        this.nome=nome;
        this.cognome=cognome;
        this.dataNascita= LocalDate.parse(dataNascita);
    }

    public Operatore() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    public List<Ordine> getOrdine() {
        return ordine;
    }

    public void setOrdine(List<Ordine> ordine) {
        this.ordine = ordine;
    }

    @Override
    public String toString() {
        return "Operatore{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", ordine=" + ordine +
                ", azienda=" + azienda +
                '}';
    }
}
