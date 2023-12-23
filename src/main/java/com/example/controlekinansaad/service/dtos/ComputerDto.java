package com.example.controlekinansaad.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Eren
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComputerDto {
    private String proce;
    private String ram;
    private String hardDrive;
    private Float price;
    private String macAdress;

}
