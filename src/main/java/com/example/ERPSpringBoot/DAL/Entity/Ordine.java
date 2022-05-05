package com.example.ERPSpringBoot.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "ordine")
@Entity
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dettaglio", nullable = false)
    private String dettaglio;
    @Column(name = "dataImporto", nullable = false)
    private LocalDate dataImporto;
    @ManyToOne
    @JoinTable(name = "operatore", joinColumns = @JoinColumn(name = "id"))
    private Operatore operatore;

    @OneToOne(mappedBy = "ordine")
    private Fattura fattura;
    @ManyToOne
    @JoinTable(name = "cliente", joinColumns = @JoinColumn(name = "id"))
    private Cliente cliente;
    @ManyToOne
    @JoinTable(name = "azienda", joinColumns = @JoinColumn(name = "id"))
    private Azienda azienda;


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

    public Fattura getFattura() {
        return fattura;
    }

    public void setFattura(Fattura fattura) {
        this.fattura = fattura;
    }

    public Cliente getCliente() {
        return cliente;
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
}
