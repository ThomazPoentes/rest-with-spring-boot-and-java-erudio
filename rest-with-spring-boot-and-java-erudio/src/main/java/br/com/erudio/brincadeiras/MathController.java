package br.com.erudio.brincadeiras;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {
    private static final String TEMPALTE = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)

    public Double sum(
                     @PathVariable(value = "numberOne") String numberOne,
                     @PathVariable(value = "numberTwo") String numberTwo
    ){
        return 1D;
    }
}
