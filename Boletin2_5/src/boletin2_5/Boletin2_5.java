package boletin2_5;
import java.util.Scanner;
public class Boletin2_5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float m=1852f, metros, millas;
       System.out.println("Escribe la distancia en millas");
       millas = sc.nextFloat();
       metros = millas * m;
       System.out.println("Distancia en Metros = "+ metros+"m");
       
    }
    
}
