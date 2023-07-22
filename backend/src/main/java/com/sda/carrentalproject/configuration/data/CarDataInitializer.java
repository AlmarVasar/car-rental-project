package com.sda.carrentalproject.configuration.data;

import com.sda.carrentalproject.domain.Car;
import com.sda.carrentalproject.domain.Client;
import com.sda.carrentalproject.domain.PriceList;
import com.sda.carrentalproject.domain.enumeration.Color;
import com.sda.carrentalproject.repository.CarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.YearMonth;

@Component
@Slf4j
@Profile("develop")
public class CarDataInitializer implements CommandLineRunner {

    private final CarRepository carRepository;

    public CarDataInitializer(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("Creating some cars");

        Car car1 = Car.builder()
                .brand("BMW")
                .model("335")
                .productionYear(YearMonth.of(2015,11))
                .color(Color.BLACK)
                .available(true)
                .priceList(new PriceList())
                .build();



        carRepository.save(car1);

        Car car2 = Car.builder()
                .brand("TOYOTA")
                .model("Camry")
                .productionYear(YearMonth.of(2020, 3))
                .color(Color.RED)
                .available(true)
                .priceList(new PriceList())
                .build();

        carRepository.save(car2);

        Car car3 = Car.builder()
                .brand("AUDI")
                .model("A8")
                .productionYear(YearMonth.of(2022, 3))
                .color(Color.BLUE)
                .available(true)
                .priceList(new PriceList())
                .build();

        carRepository.save(car3);

        Car car4 = Car.builder()
                .brand("VOLKSWAGEN")
                .model("GOLF5")
                .productionYear(YearMonth.of(2019, 1))
                .color(Color.SILVER)
                .available(true)
                .priceList(new PriceList())
                .build();

        carRepository.save(car4);
    }



}
