package it.unikey.DAL.Entity;

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
    @Column(name= "ruoloAssegnato", nullable = false)
    private String ruoloAssegnato;

    @OneToOne(mappedBy = "ruolo")
    private Dipendente dipendente;
}
