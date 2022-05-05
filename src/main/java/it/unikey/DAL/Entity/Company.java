package it.unikey.DAL.Entity;

import javax.persistence.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "company")
public class Company implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @OneToMany(mappedBy = "company")
    private List<Client> clients;
    @OneToMany(mappedBy = "company")
    private List<Invoice> invoices;
    @OneToMany(mappedBy = "company")
    private List<Order> orders;
    @OneToMany(mappedBy = "company")
    private List<Employee> employees;

    @OneToMany(mappedBy = "company")
    private List<Operator> operators;

    public Company(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
        this.invoices = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public Company() {

    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moreThan10() {
        for (Client c : this.getClients()) {
            if (c.getContacts().size() >= 10) {
                System.out.println("Il contatto " + c.getName() + " di " + this.getName() + " ha almeno 10 contatti");
            }
        }
    }

    public void invoicesReply() {
        for (Client c : this.getClients()) {
            if (c.getName().equals("Reply")) {
                System.out.println(this.getInvoices());
            }
        }
    }

    public void carOwnerEmployees() {
        for (Employee e : this.getEmployees()) {
            try {
                if (e.getResource().getValue() == 1) {
                    System.out.println(e);
                }
            } catch (NullPointerException n) {
                continue;
            }

        }
    }

    public void invoiceDateAfter(String data) {
        for (Invoice i : this.getInvoices()) {
            if (i.getDate().compareTo(LocalDate.parse(data)) > 0) {
                System.out.println(i);
            }
        }
    }

    public void orderWithoutInvoice() {
        for (Order o : this.getOrders()) {
            for (Invoice i : this.getInvoices()) {
                if (!o.equals(i.getOrder())) {
                    System.out.println(o);
                }
            }
        }
    }

    public void employeeHiredLastMonth() {
        for (Employee e : this.getEmployees()) {
            if (e.getDateOfEmployment().compareTo(LocalDate.now().minusDays(30)) > 0) {
                System.out.println(e);
            }
        }
    }

    public void countEmployees() {
        try (ObjectInputStream ob = new ObjectInputStream(new FileInputStream("resources/" + this.getName() + ".txt"))) {
            ArrayList<Employee> o = (ArrayList<Employee>) ob.readObject();

            this.setEmployees(o);
            System.out.println(o.size());
        } catch (IOException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @OneToMany(mappedBy = "company")
    private Collection<Operator> operator;

    public Collection<Operator> getOperator() {
        return operator;
    }

    public void setOperator(Collection<Operator> operator) {
        this.operator = operator;
    }
}
