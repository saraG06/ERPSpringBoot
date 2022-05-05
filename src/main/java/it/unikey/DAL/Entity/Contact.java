package it.unikey.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "contact")
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "birth", nullable = false)
    private LocalDate birth;
    @ManyToOne
    @JoinTable(name = "client", joinColumns = @JoinColumn(name = "id"))
    private Client client;
    @OneToMany(mappedBy = "contact")
    private List<Invoice> invoices;

    public Contact() {
    }

    public List<Invoice> getClientInvoices(Company c) {
        for (Client cl : c.getClients()) {
            if (cl.getContacts().contains(this)) {
                return c.getInvoices();
            }
        }
        System.out.println("Questo Contatto non fa parte dell'azienda");
        return null;
    }
}
