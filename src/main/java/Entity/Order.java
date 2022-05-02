package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "`order`")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "detail")
    private String detail;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "price")
    private Double price;

    @OneToOne(mappedBy = "order")
    private Worker worker;



    @ManyToOne
    @JoinColumn(name = "order_id")
    private Client client;

    @OneToOne
    @JoinColumn(name = "invoice_id", referencedColumnName = "id")
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "streams_id")
    private Streams streams;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", worker=" + worker +
                ", client=" + client +
                ", invoice=" + invoice +
                ", streams=" + streams +
                '}';
    }
}
