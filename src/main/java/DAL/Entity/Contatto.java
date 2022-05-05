package DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name= "contatto")
@Entity
public class Contatto{

    //La classe padre avrà ancora gli elementi in comune tra le classi figlie
    //La classe figlia avrà l'id, gli attributi propri e una OneToOne sulla classe padre

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "nome", nullable = false)
    private String nome;

    @Column(name= "cognome", nullable = false)
    private String cognome;

    @Column(name= "nascita", nullable = false)
    private LocalDate nascita;

    @JoinColumn(name= "Cliente_id")
    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "contatto")
    private List<Fattura> listaFatture= new ArrayList<>();

}
