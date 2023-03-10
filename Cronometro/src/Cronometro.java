

import java.util.Scanner;

public class Cronometro {

    
    public static void main(String[] args) throws InterruptedException {
        int horas=0,minutos=0,segundos=0;
        int alarma=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de minutos para la alrma:");
        alarma=scanner.nextInt()*60;
        while(true){
            if(horas<10){
                System.out.print("0");
            }
            System.out.print(horas+":");
            if(minutos<10){
                System.out.print("0");
            }
              System.out.print(minutos+":");
               if(segundos<10){
                System.out.print("0");
            }
            System.out.println(segundos);
            segundos++;
            if(segundos==60){
               segundos=0;
               minutos++;
               if(minutos==60){
                   minutos=0;
                   minutos++;
                   if (horas==24){
                       horas=0;   
                   }
                   
               }
               
                
            }
            Thread.sleep(1000);
            if (alarma>0){
                alarma--;
                if(alarma==0)
                    System.out.println("¡ALARMA!");
            }
        }
       
    }
    
}
