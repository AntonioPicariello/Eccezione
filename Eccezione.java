package vettore;
import java.util.Scanner;

public class Vettore {


    public static void main(String[] args) {
  
     int[]v = new int[10];
     int i;
     
     try{
     for(i=0;i<11;i++){
         System.out.println("Inserisci il numero = ");
         Scanner s = new Scanner(System.in);
         v[i] = s.nextInt();
             
     }
     } catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Errore, il vettore è composto solamente da 11 elementi");
     }
     catch(Exception e1){
         System.out.println("Errore");
     }
}
}