import java.util.Scanner;

public class AAJ_loop {

    public static void main(String[] args) {
       System.out.println("------------For------------");
       for(int i=1;i<10;i++){
           System.out.print(i);
       }
       System.out.println();
       System.out.println("------------While------------");
       int j=1;
       while(j<10){
           System.out.print(j);
           j++;
       }
       System.out.println();
       System.out.println("------------Do While------------");
       int k=1;
       do{
           System.out.print(k);
           k++;
       }while(k<10);
       System.out.println();
    }  
}
