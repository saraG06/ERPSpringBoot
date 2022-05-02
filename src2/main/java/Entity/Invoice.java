package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @OneToOne
    private Order order;

    @OneToOne
    private Contact contact;


}
