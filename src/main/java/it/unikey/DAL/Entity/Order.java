package it.unikey.DAL.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "`order`")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name = "details", nullable = false)
    private String details;
    @Column(name = "date", nullable = false)
    private LocalDate date;
    @Column(name = "price", nullable = false)
    private double price;
    @ManyToOne
    @JoinTable(name = "collaborator", joinColumns = @JoinColumn(name = "id"))
    private Collaborator collaborator;
    @ManyToOne
    @JoinTable(name = "client", joinColumns = @JoinColumn(name = "id"))
    private Client client;
    @ManyToOne
    @JoinTable(name = "employee", joinColumns = @JoinColumn(name = "id"))
    private Employee employee;

    @ManyToOne
    @JoinTable(name = "contact", joinColumns = @JoinColumn(name = "id"))
    private Company company;

    @OneToOne
    private Invoice invoice;

    public Order(String details, String date, double price, Collaborator c, Client cl){
        this.details = details;
        this.date = LocalDate.parse(date);
        this.price = price;
        this.collaborator = c;
        this.client = cl;
        this.employee = null;
    }
    public Order(String details, String date, double price, Employee e, Client cl){
        this.details = details;
        this.date = LocalDate.parse(date);
        this.price = price;
        this.client = cl;
        this.employee = e;
        this.collaborator = null;
    }

    public Order() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void stampaConCollaborator(){
        System.out.println( code + " " + details + " " + date + " " + price
                + " " + client.getCode() +" " + collaborator.getCode());
    }
    @Override
    public String toString() {
        return code + " " + details + " " + date + " " + price
                + " " + client.getCode() + " " + employee;
    }
}
