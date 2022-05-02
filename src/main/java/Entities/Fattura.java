package Entities;

import Entities.Contatto;
import Entities.Ordine;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "fattura")
public class Fattura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data")
    private LocalDate data;
    @OneToOne
    @JoinColumn(name = "id_ordine")
    private Ordine ordine;
    @OneToOne
    @JoinColumn(name = "id_contatto")
    private Contatto contatto;
    @ManyToOne
    private Azienda azienda;

    public Fattura(String data, Ordine ordine, Contatto contatto) {
        this.data = LocalDate.parse(data);
        this.contatto = contatto ;
        this.ordine = ordine ;
    }

    public Fattura() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }

    public Contatto getContatto() {
        return contatto;
    }

    public void setContatto(Contatto contatto) {
        this.contatto = contatto;
    }

    @Override
    public String toString() {
        return "Entities.Fattura{" +
                "id=" + id +
                ", data=" + data +
                ", ordine=" + ordine +
                ", contatto=" + contatto +
                '}';
    }
}
