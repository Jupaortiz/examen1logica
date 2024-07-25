package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        //Declaracion variables

        Double distancia;
        Double consumoPor100km;
        Double precioPorLitro;
        String nombreConductor;
        String modelosAuto;

        //Asignando variables

        System.out.println("ingrese su nombre: ");
        nombreConductor=entradaTeclado.nextLine();

        System.out.println("ingrese el modelo del auto: ");
        modelosAuto=entradaTeclado.nextLine();

        System.out.println("ingrese el total de la distancia recorrida: ");
        distancia=entradaTeclado.nextDouble();

        System.out.println("ingrese el consumo de combustible del coche (litro por cada 100km): ");
        consumoPor100km=entradaTeclado.nextDouble();

        System.out.println("ingrese el precio por litro del combustible: ");
        precioPorLitro=entradaTeclado.nextDouble();

        //calcular el total de litros de combustible necesarios para el viaje
        Double litrosNecesairos=(distancia/100)*consumoPor100km;

        //calcular el costo total del combustible necesario
        Double costoTotal=litrosNecesairos*precioPorLitro;

        System.out.println("Señor conductor: "+nombreConductor);
        System.out.println("Su modelos de auto: "+modelosAuto);
        System.out.println("Para la ditancia total: "+distancia);
        System.out.println("Tiene un consumo de combustible (litros por 100 metros): "+consumoPor100km);
        System.out.println("El precio por litro de combustible es: "+precioPorLitro);
        System.out.println("El total de litros necesarios es: "+litrosNecesairos);
        System.out.println("El costo total de combustible necesario es: "+costoTotal);

    }
}