package Entity;

import javax.persistence.*;


@Table(name="persona")
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    @Column(name="nome")
    private String nome;

}
