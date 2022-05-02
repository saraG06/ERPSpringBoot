package Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "streams")

public class Streams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @OneToMany(mappedBy = "streams", fetch = FetchType.LAZY)
    private List<Employee> employees;

    @OneToMany(mappedBy = "streams", fetch = FetchType.LAZY)
    private List<Order> orders;

    @OneToMany(mappedBy = "streams", fetch = FetchType.LAZY)
    private List<Invoice> invoices;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
