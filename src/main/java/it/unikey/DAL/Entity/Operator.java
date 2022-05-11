package it.unikey.DAL.Entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import it.unikey.DAL.Entity.LocalDateFix.LocalDateDeserializer;
import it.unikey.DAL.Entity.LocalDateFix.LocalDateSerializer;
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
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @Column(name = "birth", nullable = false)
    private LocalDate birth;
    @ManyToOne(cascade=CascadeType.ALL)
    private Company company;

    public Invoice generateInvoice(Order o, Contact contact, Company c){
        Invoice i = new Invoice(LocalDate.now().toString(),o,contact);
        c.getInvoices().add(i);
        return i;
    }
}
