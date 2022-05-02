package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "worker")

public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastiname;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getLastiname() {
        return lastiname;
    }

    public void setLastiname(String lastiname) {
        this.lastiname = lastiname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
