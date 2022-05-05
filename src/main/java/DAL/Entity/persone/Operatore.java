package DAL.Entity.persone;

import DAL.Entity.Azienda;
import DAL.Entity.Ordine;
import DAL.Entity.Enum.Risorse;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Operatore {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id ;

    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;
    @Column(name = "dataNascita")
    private LocalDate dataNascita ;

    @ManyToOne
    @JoinColumn(name = "azienda_id")
    Azienda azienda ;


//    @OneToMany(mappedBy = "operatore")
//    List<Ordine> ordini ;


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
}