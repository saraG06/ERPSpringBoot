package it.unikey.erpspringboot.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ordini")
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dettaglio",nullable = false)
    private String dettaglio;

    @Column(name = "dataImporto",nullable = false)
    private LocalDate dataImporto;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "operatore_id",nullable = false)
    private Operatore operatore;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id",nullable = false)
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fattura_id")
    private Fattura fattura;

    public Fattura getFattura() {
        return fattura;
    }

    public void setFattura(Fattura fattura) {
        this.fattura = fattura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDettaglio() {
        return dettaglio;
    }

    public void setDettaglio(String dettaglio) {
        this.dettaglio = dettaglio;
    }

    public LocalDate getDataImporto() {
        return dataImporto;
    }

    public void setDataImporto(LocalDate dataImporto) {
        this.dataImporto = dataImporto;
    }

    public Operatore getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatore operatore) {
        this.operatore = operatore;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "id=" + id +
                ", dettaglio='" + dettaglio + '\'' +
                ", dataImporto=" + dataImporto +
                ", operatore=" + operatore +
                ", cliente=" + cliente +
                '}';
    }
}
