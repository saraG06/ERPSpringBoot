package Entity;

import javax.persistence.*;

@Entity
@Table(name = "collaboratori")
public class Colleaboratore extends Operatore{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome",nullable = false)
    private String nome;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Colleaboratore{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
