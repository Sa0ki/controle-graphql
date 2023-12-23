package com.example.controlekinansaad.service.mappers;

import com.example.controlekinansaad.dao.entities.Computer;
import com.example.controlekinansaad.service.dtos.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * @author Eren
 **/
@Component
public class ComputerMapper {
    private final ModelMapper computerMapper = new ModelMapper();
    public Computer fromComputerDtoToComputer(ComputerDto computerDto){
        return computerMapper.map(computerDto, Computer.class);
    }
    public ComputerDto fromComputerToComputerDto(Computer computer){
        return computerMapper.map(computer, ComputerDto.class);
    }
}