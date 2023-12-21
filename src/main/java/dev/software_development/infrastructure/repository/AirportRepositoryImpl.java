package dev.software_development.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import dev.software_development.domain.airport.entity.Airport;
import dev.software_development.domain.airport.repository.AirportRepository;
import dev.software_development.infrastructure.mapper.airport.AirportMapper;

import java.util.List;


@Repository
public class AirportRepositoryImpl implements AirportRepository {

    @Autowired
    private AirportMapper airportMapper;

    @Override
    @Cacheable(key = "#root.methodName", cacheNames = "localCache", cacheManager = "localCacheManager")
    public List<Airport> findAll() {
        return airportMapper.findAll();
    }
}
