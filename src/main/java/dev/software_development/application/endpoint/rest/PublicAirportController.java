package dev.software_development.application.endpoint.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.software_development.application.dto.response.ResponseDto;
import dev.software_development.application.service.ResponseFactory;
import dev.software_development.domain.airport.entity.Airport;
import dev.software_development.domain.airport.service.AirportService;

import java.util.List;


@RestController
@RequestMapping("/${application-name}/public/v1/airports")
public class PublicAirportController {

    private final AirportService airportService;

    private final ResponseFactory responseFactory;

    public PublicAirportController(AirportService airportService, ResponseFactory responseFactory) {
        this.airportService = airportService;
        this.responseFactory = responseFactory;
    }
    

    @GetMapping
    public ResponseDto getAllAirports() {
        List<Airport> airports = airportService.getAll();
        return responseFactory.response(airports);
    }
}
