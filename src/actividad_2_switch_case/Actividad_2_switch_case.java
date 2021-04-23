/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2_switch_case;

import java.util.Scanner;

/**
 *
 * @author RicardoMoo
 */
public class Actividad_2_switch_case {
    
    
    public static void validacion() {
           System.out.println("numero del 1 al 7");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        if (num<7 && num>0) {
            switch (num) {
                case 1:
                    System.out.println("correcto es el dia lunes");
                    break;
                case 2:
                    System.out.println("correcto es el dia martes");
                    break;
                case 3:
                    System.out.println("correcto es el dia miercoles");
                    break;
                case 4:
                    System.out.println("correcto es el dia jueves");
                    break;
                case 5:
                    System.out.println("correcto es el dia viernes");
                    break;
                case 6:
                    System.out.println("correcto es el dia sabado");
                    break;
                case 7:
                    System.out.println("correcto es el dia domingo");
                    break;
                default:
            }
        }else{
            System.out.println("incorrecto"); 
        }
    }
    public static void semana(){
        System.out.println("ingrese falso o verdadero"); 
        Scanner leer = new Scanner(System.in);
        boolean sem = leer.hasNext();
        if (sem=true) {
            System.out.println("semana Inglesa");
        }else{
            System.out.println("semana laborable");           
        }
    }
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("----------Ejercicio 1----------");
        System.out.println("ingrese un numero del 1 al 5");
        int opcion = leer.nextInt();
        switch(opcion)
        {
            case 1 :
                System.out.println("opcion 1");
                break;
            case 2 :
                System.out.println("opcion 2");
                break;
            case 3 :
                System.out.println("opcion 3");
                break;
            case 4:
                System.out.println("opcion 4");
                break;
            case 5:
                System.out.println("opcion 5");
                break;
                
            default :
                System.out.println("invalido");
        }
    
    System.out.println("----------Ejercicio 2----------"); 
    System.out.println("escriba alguna acción");
         String acción = leer.next();   
         switch(acción)
        {
            case "correr" :
                System.out.println("elegiste correr");
                break;
            case "mover" :
                System.out.println("elegiste mover");
                break;
            case "ver" :
                System.out.println("elegiste ver");
                break;
            case "saltar":
                System.out.println("elegiste saltar");
                break;
            case "caminar":
                System.out.println("elegiste caminar");
                break;
                
            default :
                System.out.println("no escogiste nada");
        }
    System.out.println("----------Ejercicio 3----------");
    System.out.println("ingrese una hora del 6 al 22");
         int hora = leer.nextInt();        
         switch (hora) {
            case 6:
                System.out.println("Despertarce");
                break;
            case 7:
                System.out.println("clase de Administración general");
                break;
            case 8:
                System.out.println("desayunar");
                break;
            case 9:
                System.out.println("Clases de algebraa lineal");
                break;
            case 11:
                System.out.println("Clase de organizacion de las computadoras");
                break;
            case 13:
                System.out.println("Clase de fisica");
                break;
            case 15:
                System.out.println("Comer");
                break;
            case 16:
                System.out.println("Realizar deberes");
                break;
            case 17:
                System.out.println("Descanso");
                break;
            case 18:
                System.out.println("realizar deberes");
                break;
            case 19:
                System.out.println("clase de lenguaje de la programación");
                break;
            case 22:
                System.out.println("dormir");
            default:
        }
    System.out.println("----------Ejercicio 4----------");
 
         validacion();
         
         semana();
                
           
    
    }
    
}
