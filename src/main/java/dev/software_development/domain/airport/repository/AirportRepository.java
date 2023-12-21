package dev.software_development.domain.airport.repository;

import java.util.List;

import dev.software_development.domain.airport.entity.Airport;

public interface AirportRepository {
    List<Airport> findAll();
}
