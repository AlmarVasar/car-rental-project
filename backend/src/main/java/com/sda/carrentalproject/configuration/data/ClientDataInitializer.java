package com.sda.carrentalproject.configuration.data;

import com.sda.carrentalproject.domain.Client;
import com.sda.carrentalproject.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;

@Component
@Slf4j
@Profile("develop")
public class ClientDataInitializer implements CommandLineRunner {

    private final ClientRepository clientRepository;

    public ClientDataInitializer(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("Creating some clients");

        Client client = Client.builder()
                .name("Almar")
                .surname("Vasar")
                .phone("54694549")
                .email("kahvel@gmail.com")
                .address("Tallinn")
                .dateOfBirth(LocalDate.of(1992, Month.JANUARY,7))
                .build();

        clientRepository.save(client);
    }
}
