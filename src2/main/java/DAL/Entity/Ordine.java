package DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity

@Table(name = "ordine")
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private LocalDate data;

    
}
