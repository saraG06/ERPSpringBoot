package DAL.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApplication.class, args);
    }
/*    Azienda a= new Azienda();

    Cliente cliente1= new Cliente();
    cliente1.setNome("AKA Industries");
    cliente1.setPI("123456");

    Contatto contatto1= new Contatto("Mario", "Rossi", LocalDate.of(1986, 4, 25), cliente1);
        a.getListaContatti().add(contatto1);

    Contatto contatto2= new Contatto("Franco", "Verdi", LocalDate.of(1978, 7, 1), cliente1);
        a.getListaContatti().add(contatto2);

    Dipendente operator= new Dipendente("Matteo", "Di Stefano", LocalDate.of(2001, 1, 3), LocalDate.of(2010, 7, 23), "OPERATOR");
        a.aggiungiDipendente(operator);

    Dipendente manager= new Dipendente("Andrea", "Scaffidi", LocalDate.of(1997, 6, 21), LocalDate.of(2004, 8, 21), "MANAGER");
        a.aggiungiDipendente(manager);

    Ordine ordine1= new Ordine("Workspace1", LocalDate.of(2016, 5, 12), operator, cliente1);
        a.getListaOrdini().add(ordine1);*/
}
