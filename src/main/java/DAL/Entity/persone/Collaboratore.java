package DAL.Entity.persone;

import DAL.Entity.Azienda;

import javax.persistence.*;

@Table(name = "collaboratore")
@Entity
public class Collaboratore extends Operatore {


    @ManyToOne
    @JoinColumn(name = "azienda_id")
    Azienda azienda ;


    public Collaboratore() {

    }




}
