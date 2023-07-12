package com.sda.carrentalproject.dto;

import com.sda.carrentalproject.domain.PriceList;
import com.sda.carrentalproject.domain.enumeration.Color;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Builder;

import java.time.YearMonth;

@Table( name = "Cars")
@Builder
public record CarDto( Long id,

         String brand,

         String model,

         YearMonth productionYear,


         Color color,

         boolean available,

         PriceList priceList
         ) {
}
