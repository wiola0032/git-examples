package pl.mpas.git_examples.car.service;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalExample {

    static Optional<String> getFiriendsNick(){
        return Optional.ofNullable(null);
    }

    public static void main(String[] args) {
        if(getFiriendsNick().isPresent()){
            String nick =getFiriendsNick().get();
        }
        Optional<String> maybeNick = getFiriendsNick();
        maybeNick.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        });

        maybeNick.ifPresent(s -> {
            System.out.println("Nick: " + s);
        });

    }
}
