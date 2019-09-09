package ua.msp;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class SimpleClass {

    
    public static void main(String[] args) {
        List<String> ar1 = Arrays.asList(args); //new ArrayList<String>();

        //Collections.shuffle(ar1);

        System.out.println("Hello world ");
        System.out.println(ar1.size());
        System.out.println();

        SimpleClass sss = new SimpleClass();

        BigDecimal bg  = new BigDecimal("10403508.771929824561403508771929824");
        System.out.println(new BigDecimal(Math.round(bg.divide(new BigDecimal(10)).doubleValue())).divide(new BigDecimal(100)) );

    }
}
