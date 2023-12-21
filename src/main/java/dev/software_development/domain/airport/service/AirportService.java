package dev.software_development.domain.airport.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import dev.software_development.domain.airport.entity.Airport;
import dev.software_development.domain.airport.repository.AirportRepository;

import java.util.List;

@Service
@Slf4j
public class AirportService {

    private final AirportRepository airportRepository;


    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }


    public List<Airport> getAll() {
        return airportRepository.findAll();
    }
}
