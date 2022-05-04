package it.unikey.DAL.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ErpSpringApplication.class, args);

        Contact contact1 = new Contact("Matteo", "Samoila","2002-11-25");
        Collaborator collaborator1 = new Collaborator("Giggio", "Donnarumma" , "1982-11-12", "car");
        Client client1 = new Client("Unikey","00000000001");
        Company company1 = new Company("MMT");
        Employee employee1 = new Employee("Janice","Gentry", "1955-09-20","2018-03-02","operator", company1);
        Order order1 = new Order("primo ordine", "2022-04-21", 2.50 ,employee1, client1);


    }
}
