package exceptionHandlingDemo;

public class CustomExceptionService {
    public String checkedException(){
        try {
            throw new Exception("Throw Exception");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public String checkedException2() throws Exception {
        throw new Exception("Throw Exception");
    }
    public String unCheckedException(){
        throw new RuntimeException("Throw Exception");
    }
}
