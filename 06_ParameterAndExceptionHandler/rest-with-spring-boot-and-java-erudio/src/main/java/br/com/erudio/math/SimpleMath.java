package br.com.erudio.math;

import br.com.erudio.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }

    public Double mult(Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }

    public Double div( Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo){
        return ((numberOne + numberTwo)/2);
    }

    public Double squareRoot(Double number){
        return Math.sqrt(number) ;
    }

}
