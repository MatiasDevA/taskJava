package claseUno;

import java.util.Scanner;

public class ejercicios {

    public static void main(String[] args) {


        /**
         int numeroInicio = 4;
         int numeroFinal = 14;
         boolean mostrar = false;
         while(numeroInicio <= numeroFinal){
         if(numeroInicio % 2 == 0 && mostrar == true){
         System.out.println(numeroInicio);

         } else {
             System.out.println(numeroInicio);
         }
         numeroInicio++;
         }
         */
         for(int ultimo = 14; ultimo>= 4; ultimo--){
         if (ultimo  %2 == 0){
         System.out.println(ultimo);
         }
         }

        double ingresoMensualMaximo = 489.083;
        double ingresoMensual;
        int vehiculosMaximos = 3;
        int vehiculos;
        int antiguedadMaxima = 5;
        int antiguedad;
        int inmueblesMaximo = 3;
        int inmuebles;
        char capacidadEconomica;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el ingreso mensual");
        ingresoMensual = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de vehiculos que posee");
        vehiculos = entrada.nextInt();
        System.out.println("Ingrese la antiguedad de los mismos");
        antiguedad = entrada.nextInt();
        System.out.println("Ingrese la cantidad de inmuebles");
        inmuebles = entrada.nextInt();
        System.out.println("Posee una embarcación, una aeronave de lujo o es titular de activos societarios que demuestree capacidad económica plena");
        System.out.println("S  o  N");
        capacidadEconomica = entrada.next().charAt(0);

        if(ingresoMensual > ingresoMensualMaximo && vehiculos >= vehiculosMaximos && antiguedad <= antiguedadMaxima
                && inmuebles >= inmueblesMaximo && capacidadEconomica == 'S'){
            System.out.println("Usted pertenece a la clase alta");
        } else {
            System.out.println("Usted no pertenece a la clase alta");
        }
    }
    }
