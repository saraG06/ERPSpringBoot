package it.unikey.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name= "azienda")
@Entity
public class Azienda {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "azienda")
    private List<Operatore> listaOperatori;

}
