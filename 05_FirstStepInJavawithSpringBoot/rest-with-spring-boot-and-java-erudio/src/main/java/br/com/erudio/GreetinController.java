package br.com.erudio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetinController {

    private static final String template = "Hello %S!";
    private  final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam( value = "name", defaultValue = "World") String name){
        return  new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
