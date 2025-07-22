import java.util.Scanner;

public class AAI_switch_statement {

    public static void main(String[] args) {
       Scanner inputData = new Scanner(System.in);

       char charValue;
       System.out.print("Enter any charecter: ");
       charValue = inputData.next().charAt(0);
       switch(charValue){
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
               System.out.println(charValue+" is a vowel");
               break;
           default :
               System.out.println(charValue+" is a consonant");
       } 
    }  
}
