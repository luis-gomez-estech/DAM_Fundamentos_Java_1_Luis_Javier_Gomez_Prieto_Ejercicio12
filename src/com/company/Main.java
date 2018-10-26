package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 9999");
        int numero = escaner.nextInt();
        escaner.close();

        //En primer lugar con un primer if le digo que si el numero introducido noe sta en el rango de 0-9999, pues que imprimar el aviso
        if (numero<0||numero>9999) {
            System.out.println("El numero introducido esta fuera del rango 0-9999");
        }

        // En caso de introducir un numero que esta dentro del rango hacemos lo siguiente
        //Para numeros de 4 cifras, por ejemplo 1234:

        else if (numero > 999){

            int a = numero /10;  // int a = 1234 / 10 = 123 ya que al tenerlo dentro de un int, el numero es sin decimales
            int b = a /10;  // int b = 123 / 10 = 12
            int c = b/10;  // int c = 12 / 10 = 1

            //Ahora extraemos digitos

            int d= numero % 10;  //Con este codigo, lo que hacemos es extraer a un numero su ultimo digito por tanto para 1234, nos queda un 4
            int e= a % 10; //Con este codigo, a=123 por tanto, nos queda un 3
            int f= b % 10; //Con este codigo, b=12 por tanto, nos queda un 2
            int g= c % 10; //Con este codigo, c=1 por tanto, nos queda un 1

            // Ahora lo que hacemos es comparar el primer digito con el ultimo

            if (g==d){

                System.out.println("El numero " + numero + " es capicúa");
            }

            else {
                System.out.println("El numero " + numero + " no es capicúa");
            }

        }

        //Para numeros de 3 cifras, por ejemplo 123, empleo el mismo planteamento que para cuatro cifras:


        else if (numero > 99){
            int a = numero /10;
            int b = a /10;

            //Ahora extraigo digitos

            int c= numero % 10;
            int d= a % 10;
            int e= b % 10;

            // Ahora lo que hacemos es comparar el primer digito con el ultimo

            if (e==c){

                System.out.println("El numero " + numero + " es capicúa");
            }

            else {
                System.out.println("El numero " + numero + " no es capicúa");
            }

        }

        //y por ultimo para numeros de 2 cifras, por ejemplo 12, empleo el mismo planteamento que para cuatro cifras:

        else if (numero > 9){
            int a = numero /10;

            //Ahora extraigo digitos

            int b= numero % 10;
            int c= a % 10;


            // Ahora lo que hacemos es comparar el primer digito con el ultimo

            if (c==b){

                System.out.println("El numero " + numero + " es capicúa");
            }

            else {
                System.out.println("El numero " + numero + " no es capicúa");
            }

        }

        else if (numero < 10){

            System.out.println("Introduce minimo dos cifras");
        }



    }

}
