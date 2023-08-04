package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Timed;

import java.io.IOException;

public class Exercise6 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.unresponsiveFlux() and ReactiveSources.unresponsiveMono()

        // Get the value from the Mono into a String variable but give up after 5 seconds
        // TODO: Write code here
//        Timed<String> block = ReactiveSources.unresponsiveMono().timed().block(Duration.ofSeconds(2));
        Timed<Integer> block = ReactiveSources.intNumberMono().timed().block();
        System.out.println(block.elapsed());
        System.out.println(block.get());

        ReactiveSources.intNumbersFlux().take(3).subscribe();
        // Get the value from unresponsiveFlux into a String list but give up after 5 seconds
        // Come back and do this when you've learnt about operators!
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
