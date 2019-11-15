package pl.mpas.git_examples.car.service;

@FunctionalInterface
public interface MyInt {

    int Int (int a, int b);

    default int calc(String s){
        return 0;
    }

}
