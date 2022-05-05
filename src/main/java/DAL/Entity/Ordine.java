package DAL.Entity;


import javax.persistence.*;
import java.time.LocalDate;
@Table(name = "ordine")
@Entity
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "data")
    LocalDate data ;
    @Column(name = "importo")
    double importo ;
    @Column(name = "dettaglio")
    String dettaglio ;
    @ManyToOne
    @JoinColumn(name = "operatore_id")
    Operatore operatore ;

   @ManyToOne
   @JoinColumn(name = "cliente_id")
    Cliente cliente ;

   @OneToOne
   Fattura fattura ;

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

//    public Operatore getOper() {
//        return oper;
//    }
//
//    public Cliente getCliente() {
//        return cliente;
//    }
//
//    public int getCodice() {
//        return codice;
//    }
//
//    public LocalDate getData() {
//        return data;
//    }
//
//    public void setData(LocalDate data) {
//        this.data = data;
//    }
//
//    public double getImporto() {
//        return importo;
//    }
//
//    public void setImporto(double importo) {
//        this.importo = importo;
//    }
//
//    public String getDettaglio() {
//        return dettaglio;
//    }
//
//    public void setDettaglio(String dettaglio) {
//        this.dettaglio = dettaglio;
//    }
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
