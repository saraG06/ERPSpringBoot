package DAL.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name= "ruolo")
@Entity
public class Ruolo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private enum RuoloAssegnato{
        MANAGER,
        PROJECTMANAGER,
        OPERATOR
    }
    @Column(name= "ruoloAssegnato")
    private String ruoloAssegnato;

    @OneToOne(mappedBy = "fattura")
    private Dipendente dipendente;
}
