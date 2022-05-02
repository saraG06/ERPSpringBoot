package Entities;

import Entities.Operatore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ordine")
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data")
    private LocalDate data ;
    @Column(name = "importo")
    private double importo ;
    @Column(name = "dettaglio")
    private String dettaglio ;
    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente ;
    @ManyToOne
    private Azienda azienda;
    @ManyToOne
    private Operatore operatore ;

    public Ordine(String data, double importo, String dettaglio, Operatore oper, Cliente cliente) {
        this.data = LocalDate.parse(data);
        this.importo = importo;
        this.dettaglio = dettaglio;
        this.cliente = cliente ;
    }

    public Ordine() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "id=" + id +
                ", data=" + data +
                ", importo=" + importo +
                ", dettaglio='" + dettaglio + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
