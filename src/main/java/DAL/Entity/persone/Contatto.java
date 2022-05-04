package DAL.Entity.persone;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

import DAL.Entity.Cliente;
import DAL.Entity.Fattura;

@Table(name = "contatto")
@Entity
public class Contatto  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;
    @Column(name = "dataNascita")
    private LocalDate dataNascita ;
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente ;
    @OneToMany(mappedBy = "contatto")
    private List<Fattura> fatture;

    public Contatto() {
    }

    public Contatto(String nome, String cognome, LocalDate dataNascita, Cliente cliente) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }


}
