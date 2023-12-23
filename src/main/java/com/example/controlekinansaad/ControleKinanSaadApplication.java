package com.example.controlekinansaad;

import com.example.controlekinansaad.dao.entities.Computer;
import com.example.controlekinansaad.dao.repositories.IComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleKinanSaadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleKinanSaadApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(IComputerRepository computerRepository){
        return args -> {
            computerRepository.saveAll(List.of(
                  new Computer(1L, "proce1", "ram1", "hardDrive1", 12500F, "1"),
                    new Computer(2L, "proce2", "ram2", "hardDrive2", 25000F, "2"),
                    new Computer(3L, "proce3", "ram3", "hardDrive3", 10000F, "3"),
                    new Computer(4L, "proce4", "ram4", "hardDrive4", 5600F, "4")
            ));
        };
    }

}
