package it.unikey.erpSpringBootTest.DAL.Entity;

import it.unikey.erpSpringBootTest.DAL.Enum.Risorse;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "collaboratore")
public class Collaboratore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;
    @Column(name = "dataNascita")
    private LocalDate dataNascita;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "operatore_id", referencedColumnName = "id")
    private Operatore operatore;
    @Enumerated(EnumType.STRING)
    @Column(name = "risorsa")
    private Risorse risorse ;
    @ManyToOne
    private Azienda azienda;

    public Collaboratore(String nome, String cognome, String dataNascita) {
        this.nome=nome;
        this.cognome=cognome;
        this.dataNascita=LocalDate.parse(dataNascita);
    }


    public Collaboratore() {
        super();
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

    public Operatore getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatore operatore) {
        this.operatore = operatore;
    }

    public Risorse getRisorse() {
        return risorse;
    }

    public void setRisorse(Risorse risorse) {
        this.risorse = risorse;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    @Override
    public String toString() {
        return "Collaboratore{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", operatore=" + operatore +
                ", risorse=" + risorse +
                ", azienda=" + azienda +
                '}';
    }
}
