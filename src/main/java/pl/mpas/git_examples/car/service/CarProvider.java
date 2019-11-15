package pl.mpas.git_examples.car.service;

import pl.mpas.git_examples.car.model.Car;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CarProvider {

    public static List<Car> getMyCars(){
        return Arrays.asList(
                    new Car("toyota", "yaris", "blue", new BigDecimal("1000"), 1),
                    new Car("audi", "a4", "red", new BigDecimal("100"), 2),
                    new Car("bmw", "e46", "black",new BigDecimal("2000"), 3),
                    new Car("mazda", "6", "blue", new BigDecimal("3000"), 4),
                    new Car("mazda", "3", "white", new BigDecimal("4000"), 5)
        );
        }
    }

