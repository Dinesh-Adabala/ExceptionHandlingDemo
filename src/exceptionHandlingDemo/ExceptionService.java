package exceptionHandlingDemo;

import java.util.Locale;

public class ExceptionService {
    public String greet(String input){
        String upperCase = null;
        try {
             upperCase = input.toUpperCase();
        }finally {
            System.out.println("From Finally Block");
        }

        return upperCase;
    }
}
