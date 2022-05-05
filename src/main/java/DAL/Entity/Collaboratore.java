package DAL.Entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Table(name= "collaboratore")
@Entity
public class Collaboratore {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToOne()
    @JoinColumn(name = "operatore_id", referencedColumnName = "id", nullable = false)
    private Operatore operatore;

}
