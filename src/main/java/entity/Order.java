package entity;


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
    @OneToOne
    @JoinColumn(name = "worker_id", referencedColumnName = "id")
    private Worker worker;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToOne(mappedBy = "order")
    private Invoice invoice;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
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
                ", company=" + company +
                '}';
    }
}
