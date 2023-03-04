package claseTres;

import java.util.Scanner;

public class ejerciciosClaseTres {

    public static void main(String[] args) {
    /**
     * Ejercicio A
       String palabra = "habia una vez";
       int comienzo = 0;
       int contador = 0;
       char letra = 'a';

       while(comienzo < palabra.length()) {
           if(palabra.charAt(comienzo) == letra){
               contador++;
           }
           comienzo++;
       }
       System.out.println( " la cantidad de veces que aparece la letra -" + letra + "- es" +contador);
     */
     /** Ejercicio b
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
         int[] vectorDeNumeros;
        System.out.println("Ingrese el primer numero");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = entrada.nextInt();
        System.out.println("Ingrese el tercer numero");
        numero3 = entrada.nextInt();
        vectorDeNumeros = ordenarNumerosDeMayorAmenor(numero1, numero2, numero3);
        imprimir(vectorDeNumeros);
      */

     /** ejercicio c
     int[] vectorNumeros = new int[5];
     vectorNumeros[0] = 100;
     vectorNumeros[1] = 20;
     vectorNumeros[2] = 40;
     vectorNumeros[3] = 10;
     vectorNumeros[4] = 80;

     int numeroReferencia;
     int sumaDeNumeros= 0;
     Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numeroReferencia = entrada.nextInt();

        for(int i = 0; i < vectorNumeros.length; i++){
            if(vectorNumeros[i] > numeroReferencia){
                sumaDeNumeros += vectorNumeros[i];
            }
        }
        System.out.println(sumaDeNumeros);
        */


        /** ejercicio 2
        int desplazamiento = 1;
        String palabra = "hola que tal";
        String cadena = "abcdefghijklmnopqrstuvwxyz";
        Scanner entrada = new Scanner(System.in);

             for(int i = 0; i < palabra.length(); i++){
                 for(int j = 0; j < cadena.length(); j++){
                     if(palabra.charAt(i) == cadena.charAt(j)){
                         System.out.println(palabra.charAt(i) +" -> " + cadena.charAt(j+desplazamiento));
                     }
                 }
             }

             */
     }



    public static int[] ordenarNumerosDeMayorAmenor(int num1, int num2, int num3){
        if (num1 >= num2 && num2 >= num3){
            return new int[]{num1, num2, num3};
        } else if ( num1 >= num3 && num3 >= num2){
            return new int[]{num1,num3,num2};
        } else if(num2 >= num1 && num1 >= num3){
            return new int[]{num2, num1, num3};
        } else if(num2 >= num3 && num3 >= num1){
            return new int[]{num2,num3,num1};
        } else if(num3 >= num2 && num2 >= num1){
            return new int[]{num3,num2,num1};
        } else if(num3 >= num1 && num1 >= num2){
            return new int[]{num3,num1,num2};
        }
        return null;
    }

    public static void imprimir(int[] vector){
        for(int vectorAimprimir : vector){
            System.out.println(vectorAimprimir);
        }
    }

}
