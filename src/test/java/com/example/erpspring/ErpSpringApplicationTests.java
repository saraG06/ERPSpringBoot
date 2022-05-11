package com.example.erpspring;

import it.unikey.DAL.Repository.*;
import com.erpspring.ErpSpringApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ErpSpringApplication.class)
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
}
