package com.sda.carrentalproject.domain;

import com.sda.carrentalproject.domain.enumeration.Color;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "Cars")
//TODO : homework!  implement on java and angular side
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Brand;

    private String Model;

    private YearMonth productionYear;

    @Enumerated(EnumType.STRING)
    private Color color;

    private boolean available;

    private PriceList priceList;



}
