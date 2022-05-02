package Entity;

import javax.persistence.*;

@Entity
@Table(name="contatti")
public class Contatto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "dataNascita")
    private String dataNascita;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;



}
