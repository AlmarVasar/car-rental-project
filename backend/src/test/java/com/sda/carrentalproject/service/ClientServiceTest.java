package com.sda.carrentalproject.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {


    @Autowired
    ClientService clientService;


    @Test
    void checkInjectedService() {
        Assertions.assertNotNull(clientService, "Bean should be injected!");
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAllClients() {
    }
}