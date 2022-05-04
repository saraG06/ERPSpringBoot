package it.unikey.DAL.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

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

    public Contact(String name, String surname, String birth) {
        this.name = name;
        this.surname = surname;
        this.birth = LocalDate.parse(birth);
    }

    public Contact() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public List<Invoice> getClientInvoices(Company c) {
        for (Client cl : c.getClients()){
            if(cl.getContacts().contains(this)){
               return c.getInvoices();
            }
        }
        System.out.println("Questo Contatto non fa parte dell'azienda");
        return null;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + birth;
    }


}
