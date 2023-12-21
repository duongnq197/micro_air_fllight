package dev.software_development.infrastructure.mapper.airport;

import java.util.List;

import dev.software_development.domain.airport.entity.Airport;

public interface AirportMapper {

    List<Airport> findAll();
}
