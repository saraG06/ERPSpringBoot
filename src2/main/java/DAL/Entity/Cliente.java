package DAL.Entity;

import javax.persistence.*;

@Entity

@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "pIva")
    private String pIva;
}
