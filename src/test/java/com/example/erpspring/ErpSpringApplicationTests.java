package com.example.erpspring;

import it.unikey.DAL.Entity.Client;
import it.unikey.DAL.Entity.Collaborator;
import Repository.*;
import it.unikey.DAL.Repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ErpSpringApplicationTests {
    private ClientRepository clientRepository;
    private CollaboratorRepository collaboratorRepository;
    private CompanyRepository companyRepository;
    private ContactRepository contactRepository;
    private EmployeeRepository employeeRepository;
    private InvoiceRepository invoiceRepository;
    private OrderRepository orderRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void addClient(){
        Client c = new Client();
        c.setName("a");
        clientRepository.save(c);
    }
    @Test
    void addCollaborator(){
        Collaborator c = new Collaborator();
        collaboratorRepository.save(c);
    }
}