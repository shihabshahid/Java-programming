import java.util.Scanner;

public class AAH_If_statement {

    public static void main(String[] args) {
       Scanner inputData = new Scanner(System.in);

       System.out.println("--------------If statement--------------");
       int firstValue,secondValue,thirdValue;
       System.out.print("Enter first value: ");
       firstValue = inputData.nextInt();
       System.out.print("Enter second value: ");
       secondValue = inputData.nextInt();
       if(firstValue>secondValue){
           System.out.println("Largest value is "+firstValue);
       }
       else{
           System.out.println("Largest value is "+secondValue);
       }
       System.out.println("--------------Nested If statement--------------");
       System.out.print("Enter first value: ");
       firstValue = inputData.nextInt();
       System.out.print("Enter second value: ");
       secondValue = inputData.nextInt();
       System.out.print("Enter Third value: ");
       thirdValue = inputData.nextInt();
       if(firstValue>secondValue && firstValue>thirdValue){
           System.out.println("Largest value is "+firstValue);
       }
       else if(secondValue>thirdValue){
           System.out.println("Largest value is "+secondValue);
       }
       else{
           System.out.println("Largest value is "+thirdValue);
       }
       System.out.println("--------------If statement with Multiple Check--------------");
       char charValue;
       System.out.print("Enter any charecter: ");
       charValue = inputData.next().charAt(0);
       if(charValue == 'a' || charValue == 'e' || charValue == 'i' || charValue == 'o' || charValue == 'u'){
           System.out.println(charValue+" is a vowel");
       }
       else{
           System.out.println(charValue+" is a consonant");
       }
    }  
}
