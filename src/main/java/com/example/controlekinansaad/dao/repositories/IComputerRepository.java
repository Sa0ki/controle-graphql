package com.example.controlekinansaad.dao.repositories;

import com.example.controlekinansaad.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Eren
 **/
@Repository
public interface IComputerRepository extends JpaRepository<Computer, Long> {
    List<Computer> findComputerByProce(String proce);
    List<Computer> findComputerByPrice(Float price);
    Computer findComputerByMacAdress(String macAdress);
}
