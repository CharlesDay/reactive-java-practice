package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        Flux<Integer> stream = ReactiveSources.intNumbersFlux();
        stream.subscribe(e -> System.out.println(e));
        stream.subscribe(e -> System.out.println("Another one" + e));

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
        ReactiveSources.userFlux().subscribe(user -> System.out.println(user));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
