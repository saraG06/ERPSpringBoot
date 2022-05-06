package it.unikey.erpSpringBootTest.DAL.Entity;

import it.unikey.erpSpringBootTest.DAL.Enum.Risorse;
import it.unikey.erpSpringBootTest.DAL.Enum.Ruoli;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "dipendente")
public class Dipendente implements Serializable {

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
    @Column(name = "dataAssunzione")
    private LocalDate dataAssunzione;
    @Enumerated(EnumType.STRING)
    @Column(name = "ruolo")
    private Ruoli ruolo;
    @Enumerated(EnumType.STRING)
    @Column(name = "risorse")
    private Risorse risorse ;
    @ManyToOne
    private Azienda azienda;


    public Dipendente(String nome, String cognome, String dataNascita, String dataAssunzione, String ruolo) {
        this.nome=nome;
        this.cognome=cognome;
        this.dataNascita= LocalDate.parse(dataNascita);
        this.dataAssunzione = LocalDate.parse(dataAssunzione);
        this.ruolo = Ruoli.valueOf(ruolo.toUpperCase());

    }

    public Dipendente() {
    }

    public void assegnaRisorsa(Dipendente d, Risorse r) {
        if (this.getRuolo().equals(Ruoli.MANAGER) || d.getRuolo().getI() > this.getRuolo().getI()) {
            //d.addRisorsa(r.name());
            System.out.println("Assegnata!");
        } else {
            System.out.println("Impossibile assegnare risorsa");
        }
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

    public Operatore getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatore operatore) {
        this.operatore = operatore;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
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

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public Ruoli getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruoli ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", operatore=" + operatore +
                ", dataAssunzione=" + dataAssunzione +
                ", ruolo=" + ruolo +
                ", risorse=" + risorse +
                ", azienda=" + azienda +
                '}';
    }
}
