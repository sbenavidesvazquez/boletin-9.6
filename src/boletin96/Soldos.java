
package boletin96;

import java.util.Scanner;


public class Soldos {
    
    float s;
    int contador1=0, contador2=0;
    
    public Soldos(){
        
    }
    
    public void setSueldo(){
        Scanner dato=new Scanner(System.in);
        do{
        System.out.println("El sueldo es: ");
        s=dato.nextFloat();
        if(s>=1000 && s<=1750){
            contador1++;
        }
        else if(s<1000 && s>0){
            contador2++;
        }
        }while(s!=0);
        System.out.println("trabajadores entre 1000 y 1750: "+ contador1);
        System.out.println("trabajadores menor a 1000: "+contador2);
        
    }
    
    public void calcular(){
        
        System.out.println("trabajadores que cobran menos de 1000: "+ ((contador2*100)/(contador1+contador2)) +"%");
        
    }
       
        
}
