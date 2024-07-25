package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entradaTeclado= new Scanner(System.in);

        //1.Asignacion precios fijos

        final double heladoSimple=10000;
        final double heladoDoble=15000;
        final double heladoEspecial=20000;

        //2.Declaracion cantidad vendida cada tipo de helado

        int cantdiadSimples;
        int cantidadDobles;
        int cantidadEspeciales;

        System.out.println("ingrese las cantidades de vendidas de helados simples");
        cantdiadSimples=entradaTeclado.nextInt();

        System.out.println("Ingrese las cantidad vendida de helados dobles");
        cantidadDobles=entradaTeclado.nextInt();

        System.out.println("ingrese las cantidad vendida de helados especiales");
        cantidadEspeciales=entradaTeclado.nextInt();



        System.out.println("Recuerda que el costo del helado simple es: "+heladoSimple);
        System.out.println("Recuerda que el costo del helado doble es: "+heladoDoble);
        System.out.println("Recuerda que el costo del helado especial es: "+heladoEspecial);


        //3.Total de ventas de cada tipo de Helado
        Double totalSimples= heladoSimple*cantdiadSimples;
        Double totalDobles=heladoDoble*cantidadDobles;
        Double totalEspeciales=heladoEspecial*cantidadEspeciales;

        //4.Total venta generales en el dia
        Double totalVentasDia=totalSimples+totalDobles+totalEspeciales;

        System.out.println("El total de ventas Helado simple son: "+totalSimples);
        System.out.println("El total de ventas Helados doubles son: "+totalDobles);
        System.out.println("El total de ventas Helados especiales son: "+totalEspeciales);

        System.out.println("El total de ventas del dia es: "+totalVentasDia);



    }
}

