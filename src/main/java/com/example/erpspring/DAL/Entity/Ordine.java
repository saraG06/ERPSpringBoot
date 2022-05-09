package com.example.erpspring.DAL.Entity;


import com.example.erpspring.DAL.Entity.persone.Operatore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Data
@Table(name = "ordine")
@Entity
public class Ordine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "data")
    LocalDate data ;
    @Column(name = "importo")
    double importo ;
    @Column(name = "dettaglio")
    String dettaglio ;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "operatore_id")
    Operatore operatore ;

   @ManyToOne(cascade=CascadeType.ALL)
   @JoinColumn(name = "cliente_id")
    Cliente cliente ;

//   @OneToOne
//   Fattura fattura ;

    @ManyToOne
    @JoinColumn(name = "azienda_id")
    Azienda azienda ;

//    public Ordine(String data, double importo, String dettaglio,Operatore oper,Cliente cliente) {
//        this.data = LocalDate.parse(data);
//        this.importo = importo;
//        this.dettaglio = dettaglio;
//        this.codice = count++ ;
//        this.oper = oper ;
//        this.cliente = cliente ;
//    }

    public Operatore getOperatore() {
        return operatore;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public String getDettaglio() {
        return dettaglio;
    }

    public void setDettaglio(String dettaglio) {
        this.dettaglio = dettaglio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOperatore(Operatore operatore) {
        this.operatore = operatore;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }
    //
//    @Override
//    public String toString() {
//        return "Ordine{" +
//                "codice=" + codice +
//                ", data=" + data +
//                ", importo=" + importo +
//                ", dettaglio='" + dettaglio + '\'' +
//                ", oper=" + oper +
//                ", cliente=" + cliente +
//                '}';
//    }
}
