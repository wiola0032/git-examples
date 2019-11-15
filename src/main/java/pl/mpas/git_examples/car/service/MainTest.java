package pl.mpas.git_examples.car.service;

import com.sun.corba.se.spi.orb.Operation;

public class MainTest {

    public static void main(String[] args) {
        LambdaConverter my = new LambdaConverter() {
            @Override
            public int convertStringToInt(String string) {
                return string.length();
            }
        };

        LambdaConverter my2 = one -> one.length();
        MyInt addition = (c, d) -> c + d;
        MyInt sub = (c, d) -> c - d;
    }
}
