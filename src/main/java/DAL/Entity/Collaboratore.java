package DAL.Entity;

import javax.persistence.*;

@Entity
@Table(name = "collaboratori")
public class Collaboratore extends Operatore{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Collaboratore{" +
                "id=" + id +
                '}';
    }
}
