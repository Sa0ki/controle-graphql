package com.example.controlekinansaad.service;

import com.example.controlekinansaad.dao.entities.Computer;
import com.example.controlekinansaad.service.dtos.ComputerDto;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eren
 **/
public interface IComputerManager {
    public ComputerDto saveComputer(ComputerDto computerInput) throws Exception;
    public ComputerDto deleteComputer(Long id) throws Exception;
    public List<ComputerDto> getComputerByProce(String proce);
    public List<ComputerDto> getComputerByPrice(Float price);
    public Boolean computerExists(String macAdress);
}
