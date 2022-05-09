package it.unikey.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Operator {
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
    private Company company;

    public Invoice generateInvoice(Order o, Contact contact, Company c){
        Invoice i = new Invoice(LocalDate.now().toString(),o,contact);
        c.getInvoices().add(i);
        return i;
    }
}
