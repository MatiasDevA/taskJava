package ClaseSeis;

public class Calculadora {

    public static void main(String[] args) {
     sumar(1,3);
    }



    public static double sumar(double d1, double d2){
        System.out.println(d1 + d2);
        return d1 +d2;
    }

    public static double restar (double d1, double d2){
        System.out.println(d1 - d2);
        return d1 - d2;
    }

    public static double multiplicar(double d1, double d2){
        System.out.println(d1 * d2);
        return d1*d2;
    }

    public static double dividir (double d1, double d2){
        System.out.println(d1/d2);
        return d1/d2;
    }
}
