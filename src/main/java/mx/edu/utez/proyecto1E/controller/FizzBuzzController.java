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
}
