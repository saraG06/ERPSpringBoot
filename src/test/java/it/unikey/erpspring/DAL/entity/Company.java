package it.unikey.erpspring.DAL.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private static List<Employee> employees;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private static List<Order> orders;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private static List<Invoice> invoices;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private static List<Client> clients;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public static List<Employee> getEmployees() {
        return employees;
    }

    public static void setEmployees(List<Employee> employees) {
        Company.employees = employees;
    }

    public static List<Order> getOrders() {
        return orders;
    }

    public static void setOrders(List<Order> orders) {
        Company.orders = orders;
    }

    public static List<Invoice> getInvoices() {
        return invoices;
    }

    public static void setInvoices(List<Invoice> invoices) {
        Company.invoices = invoices;
    }

    public static List<Client> getClients() {
        return clients;
    }

    public static void setClients(List<Client> clients) {
        Company.clients = clients;
    }
}
