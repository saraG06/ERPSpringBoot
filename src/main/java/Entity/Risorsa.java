package Entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Risorsa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinTable(name = "operatore", joinColumns = @JoinColumn(name = "id"))
    private Operatore operatore;

    public Risorsa() {

    }

    private enum RisorsaAssegnata{
        MACCHINA,
        PC,
        TELEFONO
    }
    @Column(name = "risorsaAssegnata", nullable = false)
    private String risorsaAssegnata;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Operatore getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatore operatore) {
        this.operatore = operatore;
    }

    public String getRisorsaAssegnata() {
        return risorsaAssegnata;
    }

    public void setRisorsaAssegnata(String risorsaAssegnata) {
        this.risorsaAssegnata = risorsaAssegnata;
    }
}
