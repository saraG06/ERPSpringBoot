package it.unikey.erpSpringBootTest.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ordine")
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data")
    private LocalDate data ;
    @Column(name = "importo")
    private double importo;
    @Column(name = "dettaglio")
    private String dettaglio;
    @OneToMany(mappedBy = "ordine")
    private List<Cliente> cliente;
    @ManyToOne
    private Operatore operatore ;
    @ManyToOne
    private Azienda azienda;

    public Ordine(String data, double importo, String dettaglio, Operatore oper, Cliente cliente) {
        this.data = LocalDate.parse(data);
        this.importo = importo;
        this.dettaglio = dettaglio;
    }

    public Ordine() {
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

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public Operatore getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatore operatore) {
        this.operatore = operatore;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "id=" + id +
                ", data=" + data +
                ", importo=" + importo +
                ", dettaglio='" + dettaglio + '\'' +
                ", cliente=" + cliente +
                ", operatore=" + operatore +
                ", azienda=" + azienda +
                '}';
    }
}
