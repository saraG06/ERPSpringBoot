package DAL.Entity;


import DAL.Entity.persone.Contatto;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "fattura")
@Entity
public class Fattura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "data")
    LocalDate data ;
    @OneToOne(mappedBy = "fattura" , fetch= FetchType.LAZY)
    Ordine ordine ;
    @ManyToOne
    @JoinColumn(name="contatto_id")
    Contatto contatto ;

    @ManyToOne
    @JoinColumn(name = "azienda_id")
    Azienda azienda ;

    public Fattura(String data,Ordine ordine,Contatto contatto) {
        this.data = LocalDate.parse(data);
        this.contatto = contatto ;
        this.ordine = ordine ;
    }

    public Fattura() {

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

    public Long getCodice() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
