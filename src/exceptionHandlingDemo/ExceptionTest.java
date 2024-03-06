package exceptionHandlingDemo;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionService exceptionService = new ExceptionService();
        exceptionService.greet(null);
    }

}
