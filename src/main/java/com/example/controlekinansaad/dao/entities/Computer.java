package com.example.controlekinansaad.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Eren
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Computer {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_Pc;
    private String proce;
    private String ram;
    private String hardDrive;
    private Float price;
    private String macAdress;
}
