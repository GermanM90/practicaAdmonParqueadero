
package com.mycompanyprimeraweb.admonparqueadero;

import java.util.Scanner;

public class AdmonParqueadero {

    public static void main(String[] args) {
        /*
        El programa debe solicitar por teclado dos datos:
        1. La placa del vehiculo
        2. El tipo de estacionamiento
        */
        String placa="";
        int tipoServicio, cantHoras, cont1=0, cont2=0,cont3=0;
        double total,totaldia=0,dscto;
        
        Scanner teclado = new Scanner(System.in);
        /* El programa debe calcular el monto a pagar para cada cliente
            en funcion del tipo de estacionamiento seleccionado. la 
            carga de datos termina cuando ingresan la palabra "FIN"
            */
        
        while(!placa.equalsIgnoreCase("fin")){
            System.out.println("ingrese la placa del vehiculo: ");
            placa = teclado.nextLine();
            if(!placa.equalsIgnoreCase("fin")){
            System.out.println("Ingrese el tipo de servicio: ");
            System.out.println("1. Por hora");
            System.out.println("2. Media jornada");
            System.out.println("3. Jornada completa");
            teclado = new Scanner(System.in);
            tipoServicio = teclado.nextInt();
            
            if (tipoServicio >3 || tipoServicio <=0){
                System.out.println("No ingreso un tipo de servicio correcto");
            }
            else{
                /*
                valores
                1. Hora : 3US
                2. Midday: 15 usd + dscto 5%
                3. fullDay: 30 usd + dscto 10%
                */
            if (tipoServicio ==1){
                System.out.println("Ingrese cantidad de horas que deseas parquear: ");
                cantHoras = teclado.nextInt();
                total = cantHoras *3;
                System.out.println("Total a pagar es de: " +total );
                cont1++;
                totaldia= totaldia + total;
            }else{
            if (tipoServicio == 2){
                System.out.println("Servicio midday = 5horas + dscto 5%");
                dscto = 15 * 0.05;
                total = 15 - dscto;
                System.out.println("El total a pagar es " +total+ "luego de aplicar un dscto de: "+dscto);
                cont2++;
                totaldia= totaldia + total;
            }
            else{
                System.out.println("Servicio fullday = 10horas + dscto 10%");
                dscto = 30 * 0.10;
                total = 30 - dscto;
                System.out.println("El total a pagar es " +total+ "luego de aplicar un dscto de: "+dscto); 
                cont3++;
                totaldia= totaldia + total;
            } 
            
                
          }  
        }
            teclado = new Scanner(System.in);
            System.out.println("**Muchas gracias por su compra**");    
      }
        }
        System.out.println("_______________________");
                System.out.println("Totales ventas de día");
                System.out.println("Cantidad servicios por horas del día = " +cont1);
                System.out.println("Cantidad servicios por medios día =" +cont2);
                System.out.println("Cantidad servicios fullday =" +cont3);
                System.out.println("Total día: " +totaldia+ "USD");
    }
}
