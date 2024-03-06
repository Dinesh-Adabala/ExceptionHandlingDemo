package Demos;

public class Demo1 {
    public static void main(String[] args) {
        String name = null;
        String fatherName = "A.V.N.MURTHY";
        System.out.println(name);
        System.out.println(fatherName);
        try {
            System.out.println(name.toUpperCase());
        }catch (Exception e){
            System.out.println("from catch block  : "+e.getMessage());
        }finally {
            System.out.println("Hai ADS ");
        }

        System.out.println(fatherName.toUpperCase());
    }
}
