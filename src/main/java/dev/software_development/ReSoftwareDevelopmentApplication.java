package dev.software_development;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"dev.software_development.infrastructure.mapper"})
public class ReSoftwareDevelopmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReSoftwareDevelopmentApplication.class, args);
    }

}
