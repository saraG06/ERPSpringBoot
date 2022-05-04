package it.unikey.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Invoice generateInvoice(Order o, Contact contact, Company c){
        Invoice i = new Invoice(LocalDate.now().toString(),o,contact);
        c.getInvoices().add(i);
        return i;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
