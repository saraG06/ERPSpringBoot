package it.unikey.erp_springboot;

import it.unikey.erp_springboot.DAL.Entity.Client;
import it.unikey.erp_springboot.DAL.Entity.Company;
import it.unikey.erp_springboot.DAL.Entity.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ErpSpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(ErpSpringBootApplication.class, args);

        Company company1 = new Company();
        company1.setName("MMT");

        Client client1 = new Client();
        client1.setName("Unikey"); client1.setPartitaIVA("00000000001");
        Client client2 = new Client();
        client2.setName("Reply"); client2.setPartitaIVA("00000000002");
        Client client3 = new Client();
        client3.setName("ENI"); client3.setPartitaIVA("00000000003");


        Contact contact1 = new Contact();
        contact1.setName("Matteo"); contact1.setName("Samoila");
        contact1.setBirth(LocalDate.parse("2002-11-25")); contact1.setClient(client1);
        Contact contact2 = new Contact();
        contact2.setName("Luigi"); contact2.setName("Neri");
        contact2.setBirth(LocalDate.parse("1958-10-31")); contact2.setClient(client1);
        Contact contact3 = new Contact();
        contact3.setName("Matteo"); contact3.setName("Fabio");
        contact3.setBirth(LocalDate.parse("1959-10-30")); contact3.setClient(client1);
        Contact contact4 = new Contact();
        contact4.setName("Mario"); contact4.setName("Mori");
        contact4.setBirth(LocalDate.parse("1965-06-07")); contact4.setClient(client1);
        Contact contact5 = new Contact();
        contact5.setName("Giacinta"); contact5.setName("Rosa");
        contact5.setBirth(LocalDate.parse("1966-09-26")); contact5.setClient(client2);
        Contact contact6 = new Contact();
        contact6.setName("Fabio"); contact6.setName("Matteo");
        contact6.setBirth(LocalDate.parse("1968-02-01")); contact6.setClient(client2);
        Contact contact7 = new Contact();
        contact7.setName("Giovanni"); contact7.setName("Rossi");
        contact7.setBirth(LocalDate.parse("1972-08-28")); contact7.setClient(client2);
        Contact contact8 = new Contact();
        contact8.setName("Stefano"); contact8.setName("Di Matteo");
        contact8.setBirth(LocalDate.parse("1987-04-24")); contact8.setClient(client2);
        Contact contact9 = new Contact();
        contact9.setName("Patello"); contact9.setName("Calatucci");
        contact9.setBirth(LocalDate.parse("1995-12-21")); contact9.setClient(client3);
        Contact contact10 = new Contact();
        contact10.setName("Piziano"); contact10.setName("Tadovani");
        contact10.setBirth(LocalDate.parse("1997-06-12")); contact10.setClient(client3);
        Contact contact11 = new Contact();
        contact11.setName("Bruno"); contact11.setName("Mars");
        contact11.setBirth(LocalDate.parse("1999-10-28")); contact11.setClient(client3);

        /*Collaborator collaborator1 = new Collaborator("Giggio", "Donnarumma" , "1982-11-12", "car");
        Collaborator collaborator2 = new Collaborator("Gian", "Franco" , "1989-07-03", "pc");
        Collaborator collaborator3 = new Collaborator("Camillo", "Benson" , "1997-09-16", "phone");



        Employee employee1 = new Employee("Janice","Gentry", "1955-09-20","2018-03-02","operator", company1);
        Employee employee2 = new Employee("Ayub","Bateman", "1956-08-29","2018-11-29","manager", company1);
        Employee employee5 = new Employee("Mateusz","Goulding", "1968-12-03","2020-06-19","projectmanager", company1);
        Employee employee8 = new Employee("Dougie","Berry", "1980-10-01","2021-03-19","manager", company1);
        Order order1 = new Order("primo ordine", "2022-04-21", 2.50 ,employee1, client1);
        Order order4 = new Order("quarto ordine", "2019-04-21", 5.50 ,collaborator1, client1);
        company1.getClients().add(client1);


        Company company2 = new Company("PRT");

        Employee employee3 = new Employee("Ira","Mcguire", "1957-07-02","2020-03-19","operator", company2);
        Employee employee6 = new Employee("Amiee","Strickland", "1970-02-10","2020-08-13","projectmanager", company2);
        Employee employee9 = new Employee("Asiyah","Hollis", "1991-03-14","2021-09-10","manager", company2);
        Order order2 = new Order("secondo ordine", "2021-04-21", 3.50 ,employee6, client2);
        Order order5 = new Order("quinto ordine", "2018-04-21", 6.50 ,collaborator2, client2);
        company2.getClients().add(client2);


        Company company3 = new Company("Vodafone");

        Employee employee4 = new Employee("Kiefer","Flower", "1959-09-15","2020-05-18","operator", company3);
        Employee employee7 = new Employee("Hollie","Mill", "1975-10-15","2020-10-06","projectmanager", company3);
        Employee employee10 = new Employee("Seb","Sierra", "1992-01-16","2022-04-07","manager", company3);
        Order order3 = new Order("terzo ordine", "2020-04-21", 4.50 ,employee10, client3);
        Order order6 = new Order("sesto ordine", "2017-04-21", 7.50 ,collaborator3, client3);
        company3.getClients().add(client3);

        List<Company> companies = new ArrayList<>();
        companies.add(company1);
        companies.add(company2);
        companies.add(company3);

        Invoice i1 = employee3.generateInvoice(order2, contact1,employee3.getCompany());
        Invoice i2 = employee2.generateInvoice(order1, contact2,employee2.getCompany());
        Invoice i3 = employee4.generateInvoice(order6, contact7, employee4.getCompany());

        client1.getContacts().add(contact1);
        client1.getContacts().add(contact2);
        client1.getContacts().add(contact3);
        client1.getContacts().add(contact4);
        client1.getContacts().add(contact5);
        client1.getContacts().add(contact6);
        client1.getContacts().add(contact7);
        client1.getContacts().add(contact8);
        client1.getContacts().add(contact9);
        client1.getContacts().add(contact10);

        client2.getContacts().add(contact1);
        client2.getContacts().add(contact2);
        client2.getContacts().add(contact3);

        client3.getContacts().add(contact1);
        client3.getContacts().add(contact2);
        client3.getContacts().add(contact3);

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee2);
        company1.getEmployees().add(employee5);
        company1.getEmployees().add(employee8);

        company2.getEmployees().add(employee3);
        company2.getEmployees().add(employee6);
        company2.getEmployees().add(employee9);

        company3.getEmployees().add(employee4);
        company3.getEmployees().add(employee7);
        company3.getEmployees().add(employee10);

        try(ObjectOutputStream ob1 = new ObjectOutputStream(new FileOutputStream("resources/MMT.txt"));
            ObjectOutputStream ob2 = new ObjectOutputStream(new FileOutputStream("resources/PRT.txt"));
            ObjectOutputStream ob3 = new ObjectOutputStream(new FileOutputStream("resources/Vodafone.txt"))){
            ob1.writeObject(company1.getEmployees());
            ob2.writeObject(company2.getEmployees());
            ob3.writeObject(company3.getEmployees());
        }
        catch(IOException e){
            e.getMessage();
        }

        company1.getOrders().add(order1);
        company1.getOrders().add(order4);
        company2.getOrders().add(order2);
        company2.getOrders().add(order5);
        company3.getOrders().add(order3);
        company3.getOrders().add(order6);

        employee2.assignResourceToSubordinate(employee1, "car");
        employee2.assignResourceToSubordinate(employee8, "car");
        employee10.assignResourceToSubordinate(employee10, "car");*/



    }

}
