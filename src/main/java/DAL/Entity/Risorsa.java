package DAL.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name= "risorsa")
@Entity
public class Risorsa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private enum RisorsaAssegnata{
        MACCHINA,
        PC,
        TELEFONO
    }
    @Column(name= "risorsaAssegnata")
    private String risorsaAssegnata;

    @JoinColumn(name= "Operatore_id")
    @ManyToOne
    private Operatore operatore;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRisorsaAssegnata(RisorsaAssegnata risorsaAssegnata) {
        this.risorsaAssegnata = String.valueOf(risorsaAssegnata);
    }

    public String getRisorsaAssegnata() {
        return String.valueOf(risorsaAssegnata);
    }

    @Override
    public String toString() {
        return "Risorsa{" +
                "id=" + id +
                ", risorsaAssegnata='" + risorsaAssegnata + '\'' +
                ", operatore=" + operatore +
                '}';
    }
}
