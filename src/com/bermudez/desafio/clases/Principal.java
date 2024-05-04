package com.bermudez.desafio.clases;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Variables
        Scanner entrada = new Scanner(System.in);
        ArrayList<Productos> listaCompras = new ArrayList<>();
        double saldo = 0;
        int salir = 1;
        String nombre;
        double precio=0;

        //Logica
        System.out.println("Escriba el saldo de la tarjeta: ");
        saldo = entrada.nextDouble();
        do{
            entrada.nextLine();
            System.out.println("Escriba la descripcion de la compra:");
            nombre = entrada.nextLine();
            System.out.println("Escriba el valor de la compra:");
            precio = entrada.nextDouble();
            if(precio <= saldo){
                saldo-=precio;
                Productos producto = new Productos(nombre, precio);
                listaCompras.add(producto);
                System.out.println("Compra realizada con éxito");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = entrada.nextInt();
            }else{
                System.out.println("Saldo Insuficiente");
                break;
            }
        }while(salir!=0);

        System.out.println("**********************************");
        System.out.println("COMPRAS REALIZADAS: ");
        Collections.sort(listaCompras);
        for(Productos p : listaCompras){
            System.out.println(p.toString());
        }
        System.out.println("**********************************");

    }
}
