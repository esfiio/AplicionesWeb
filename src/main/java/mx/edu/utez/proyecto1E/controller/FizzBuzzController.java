package mx.edu.utez.proyecto1E.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/my-services")

public class FizzBuzzController {

    @GetMapping("/fizzbuzz/{numero}")
    public String fizzBuzz(@PathVariable int numero){

        for (int i = 1; i <= numero; i++) {
            if (numero %3 == 0 && numero %5 == 0){
                System.out.println("FizzBuzz");
            } else if (i %3 == 0) {
                System.out.println("Fizz");
            } else if (i %5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }

        return "Diego Sanchez Carteno";
    }

    @GetMapping("/fibonacci/{n}")
    public String fibonacci(@PathVariable int n ){
        int anterior = 0;
        int actual = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(anterior);
            } else if (i == 1) {
                System.out.println(actual);
            } else {
                int siguiente = anterior + actual;
                System.out.println(siguiente);
                anterior = actual;
                actual = siguiente;
            }
        }

        return "Diego Sanchez Carteno";
    }
}
