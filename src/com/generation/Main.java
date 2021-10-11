package com.generation;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //Estructura if
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad=sc.nextInt();
        sc.nextLine();
        System.out.println("¿Cuál es tu nombre?");
        String nombre=sc.nextLine();
        if (edad>18){
            System.out.println("Felicitaciones "+ nombre+", usted puede votar");
        } else{
            System.out.println("Hola"+ nombre+"siga participando");
        }
        sc.close();*/


        /*Solicitar al usuario 3 ángulos de un triángulo y determinar si el triángulo es valido*/
        /*Scanner sc=new Scanner(System.in);  //creamos instancia de la utilidad scanner
        System.out.println("Averigüemos si tu triangulo puede existir");    //texto
        System.out.println("Ingresa el primer ángulo");
        int ang1=sc.nextInt();                                            //creamos variable para almacenar información
        System.out.println("Ingresa el segundo ángulo");
        int ang2=sc.nextInt();
        System.out.println("Ingresa el tercer ángulo");
        int ang3=sc.nextInt();
        sc.close();                           //Si le pedimos String es necesario limpiar el scanner porque el "intro"
                                                // también lo considera cadena en números no es necesario

        if (ang1+ang2+ang3==180){
            System.out.println("Estos ángulos si pueden formar un triángulo");
        } else{
            System.out.println("Estos ángulos no formaran un triángulo sobre un plano");
        }*/

        //Ejercicio2

        /*pedir al usuario el año y determinar si es bisiesto*/

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Dame un año:");
        int year=sc.nextInt();

        if (year%4==0&&(year%100!=0||year%400==0)){
            System.out.println("El año "+year+" es bisiesto");
        }else{
            System.out.println("El año "+year+" no es bisiesto");
        }*/



        //Ejercicio3
        //Estructura Switch-case
        //Calculadora simple
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero:");
        float num1= sc.nextFloat();
        System.out.println("Ingresa otro numero");
        float num2=sc.nextFloat();
        System.out.println("¿Que operación deseas realizar:\n1) Suma \n2) Resta" +
                "\n3) Producto \n4) Division");
        int opc=sc.nextInt();
        sc.close();
        switch(opc){
            case 1:
                System.out.println("La suma es: " +(num1+num2));
                break;
            case 2:
                System.out.println("La resta es: "+(num1-num2));
                break;
            case 3:
                System.out.println("El producto es: "+(num1*num2));
                break;
            case 4:
                System.out.println("El cociente es:"+(num1/num2));
                break;
            default:
                System.out.println("Elija una opción valida");
        }*/


        //Ejercicio4
        //Pedir un numero al usuario y dar como respuesta un numero de la semana 1=Domingo
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero:");
        int dia= sc.nextInt();
        sc.close();
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("¿Tu semana tiene más de siete dias?");
        }



    }
}
