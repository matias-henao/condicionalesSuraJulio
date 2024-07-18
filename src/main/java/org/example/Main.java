package org.example;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.DecimalFormatSymbols;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {


        Scanner entradaTeclado=new Scanner(System.in);

        int anioNacimientoCliente;
        int anioActual;
        String nombresCompletosCliente;
        double salarioCliente;
        String licorFavoritoCLiente;
        String cantanteFavoritoCliente;
        double valorIva;
        byte numeroMesa;
        double valorDescuento;

        //ASIGNANDO VARIABLES
        System.out.print("Digita tus nombres y apellidos: ");
        nombresCompletosCliente=entradaTeclado.nextLine();

        System.out.print("Digita tu licor favorito: ");
        licorFavoritoCLiente=entradaTeclado.nextLine();

        System.out.print("Digita tu cantante favorito: ");
        cantanteFavoritoCliente=entradaTeclado.nextLine();


        System.out.print("Digite su año de nacimiento: ");
        anioNacimientoCliente=entradaTeclado.nextInt();

        System.out.print("Digite el año actual: ");
        anioActual=entradaTeclado.nextInt();

        System.out.print("Digita el salario del cliente: ");
        salarioCliente=entradaTeclado.nextInt();

        System.out.print("Valor del IVA: ");
        valorIva=entradaTeclado.nextDouble();

        System.out.print("valor del descuento: ");
        valorDescuento=entradaTeclado.nextDouble();

        System.out.print("Numero de la mesa del cliente: ");
        numeroMesa=entradaTeclado.nextByte();

        //PROCEOS DEL ALGORITMO

        //1. CALCULAR LA EDAD DEL USUARIO
        int edadUsusario=anioActual-anioNacimientoCliente;
        System.out.println("Apreciado "+nombresCompletosCliente+" usted tiene "+edadUsusario+" años.");

        //2. Comparar y decidir sobre el salario
        final double valorSalariominimo=1300000;

        double numeroSalarios=salarioCliente/valorSalariominimo;
        System.out.println("Usted gana "+numeroSalarios+" SMLV.");

        String formatoDos=String.format("%.2f",numeroSalarios);
        System.out.println("Usted gana: "+formatoDos+" SMLV");

        //Condicion para validar si tiene platica
        if (numeroSalarios>=3.0){
            //camino de verdad
            System.out.println("bienvenido patron");
        }else{
            //Camino negación
            System.out.println("Chao pirobito");
        }






    }
}