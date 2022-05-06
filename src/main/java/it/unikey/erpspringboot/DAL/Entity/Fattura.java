package it.unikey.erpspringboot.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="fatture")
public class Fattura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data",nullable = false)
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "contatto_id",nullable = false)
    private Contatto contatto;

    @OneToOne
    @JoinColumn(name = "ordine_id")
    private Ordine ordine;



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

    public Contatto getContatto() {
        return contatto;
    }

    public void setContatto(Contatto contatto) {
        this.contatto = contatto;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }

    @Override
    public String toString() {
        return "Fattura{" +
                "id=" + id +
                ", data=" + data +
                ", contatto=" + contatto +
                ", ordine=" + ordine +
                '}';
    }
}
