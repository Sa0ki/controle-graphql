package com.example.controlekinansaad.web;

import com.example.controlekinansaad.dao.entities.Computer;
import com.example.controlekinansaad.dao.repositories.IComputerRepository;
import com.example.controlekinansaad.service.ComputerManagerAction;
import com.example.controlekinansaad.service.dtos.ComputerDto;
import com.example.controlekinansaad.service.mappers.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eren
 **/
@Controller
@AllArgsConstructor
public class ComputerGraphQLController {
    private ComputerManagerAction computerManagerAction;
    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computerInput) throws Exception {
        return computerManagerAction.saveComputer(computerInput);
    }
    @MutationMapping
    public ComputerDto deleteComputer(@Argument Long id)throws Exception{
        return computerManagerAction.deleteComputer(id);
    }
    @QueryMapping
    public List<ComputerDto> getComputerByProce(@Argument String proce){
        return computerManagerAction.getComputerByProce(proce);
    }
    @QueryMapping
    public List<ComputerDto> getComputerByPrice(@Argument Float price){
        return computerManagerAction.getComputerByPrice(price);
    }
}
