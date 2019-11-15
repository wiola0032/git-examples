package pl.mpas.git_examples.car.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Car {

    private String brand;
    private  String model;
    private  String color;
    private BigDecimal price;
    private int engine;


}
