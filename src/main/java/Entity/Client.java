package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "pIVA", nullable = false)
    private String partitaIVA;
    @OneToMany(mappedBy = "client")
    private List<Contact> contacts = new ArrayList<Contact>();
    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<Order>();
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;
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

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public void setPartitaIVA(String partitaIVA) {
        this.partitaIVA = partitaIVA;
    }

    @Override
    public String toString() {
        return "Client{ "+id+ " " +name+ " " +partitaIVA+" }";
    }
}
