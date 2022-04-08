package com.company;



import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();
        System.out.println();


        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do{
            System.out.println("********* MENU ************");
            System.out.println("* 1. Opcion 1             *");
            System.out.println("* 2. Opcion 2             *");
            System.out.println("* 3. Opcion 3             *");
            System.out.println("* 0. Salir                *");
            System.out.println("***************************");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Option 1 Create Birds");
             int op=   Integer.parseInt(ask(sn,"opcion?"));
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                   // salir=true;
                    break;
                default:
                    System.out.println("Number distint 0 ");
            }
        }
        while(opcion != 0);


    }

    public static String ask(Scanner input, String option) {
        System.out.println(option);
         return input.nextLine();
        /*System.out.println("Name bird : ");
        String name=  input.nextLine();
        System.out.println("Input name latin bird : ");
        String namelatin=  input.nextLine();
        System.out.println("Input observation bird : ");
        int obs =  input.nextInt();*/


    }



    //method add()
    //method list()
}