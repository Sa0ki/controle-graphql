package com.example.controlekinansaad.service;

import com.example.controlekinansaad.dao.entities.Computer;
import com.example.controlekinansaad.dao.repositories.IComputerRepository;
import com.example.controlekinansaad.service.dtos.ComputerDto;
import com.example.controlekinansaad.service.mappers.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eren
 **/
@Service
@AllArgsConstructor
public class ComputerManagerAction implements IComputerManager{
    private IComputerRepository computerRepository;
    private ComputerMapper computerMapper;
    @Override
    public ComputerDto saveComputer(ComputerDto computerInput) {
        if(this.computerExists(computerInput.getMacAdress()))
            return null;
        return computerMapper.fromComputerToComputerDto(
                computerRepository.save(computerMapper.fromComputerDtoToComputer(computerInput))
        );
    }
    @Override
    public ComputerDto deleteComputer(Long id) {
        Computer computer = computerRepository.findById(id).get();
        computerRepository.delete(computer);
        return computerMapper.fromComputerToComputerDto(computer);
    }

    @Override
    public List<ComputerDto> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findComputerByProce(proce);
        List<ComputerDto> computerDtos = new ArrayList<>();
        computers.forEach(c -> computerDtos.add(computerMapper.fromComputerToComputerDto(c)));
        return computerDtos;
    }

    @Override
    public List<ComputerDto> getComputerByPrice(Float price) {
        List<Computer> computers = computerRepository.findComputerByPrice(price);
        List<ComputerDto> computerDtos = new ArrayList<>();
        computers.forEach(c -> computerDtos.add(computerMapper.fromComputerToComputerDto(c)));
        return computerDtos;
    }

    @Override
    public Boolean computerExists(String macAdress) {
        return computerRepository.findComputerByMacAdress(macAdress) != null;
    }
}
