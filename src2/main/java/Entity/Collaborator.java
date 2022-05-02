package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "collaborator")
public class Collaborator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surnname;

    @Column(name = "date")
    private LocalDate date;


}
