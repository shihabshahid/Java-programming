import java.util.Scanner;
public class AAO_function {

    public static void main(String[] args){
        Scanner inputData = new Scanner(System.in);
        

       int firstValue, secondValue;
       String myString;
       System.out.println("Enter your name");
       myString = inputData.nextLine();
       System.out.println("Enter first value");      
       firstValue = inputData.nextInt();
       System.out.println("Enter second value");
       secondValue = inputData.nextInt();
      
       

       System.out.println(Addition(firstValue,secondValue));
       System.out.println(Subtraction(firstValue,secondValue));
       System.out.println(Multiplication(firstValue,secondValue));
       System.out.println(Division(firstValue,secondValue));
       System.out.println(Remainder(firstValue,secondValue));

       
       System.out.print(ShowGreed());
       ShowText();
       System.out.println();
       System.out.println(ShowMyName(myString));
        
       myString = "Hello ";
       String myString1 = " Shihab";
       System.out.println(myString);
       StringBuffer inputData1 = new StringBuffer(myString);
       System.out.println(inputData1);
       inputData1.append(" world");
       System.out.println(inputData1);
       inputData1.append(myString1);
       System.out.println(inputData1);
        System.out.println(Math.abs(-55));  
        System.out.println(Math.sin(90));
        System.out.println(Math.pow(4,2));
        System.out.println(Math.max(52,12));
        
    }
    public static int Addition(int a,int b) {
        return a+b;
    }
    public static int Subtraction(int a,int b) {
        return a-b;
    }
    public static int Multiplication(int a,int b) {
        return a*b;
    }
    public static int Division(int a,int b) {
        return a/b;
    }
    public static int Remainder(int a,int b) {
        return a%b;
    }
    public static String ShowGreed() {
        return "Welcome";
    }
    public static void ShowText() {
         System.out.print(" to ");
         System.out.print("IBBPLC ");
    }
    public static String ShowMyName(String a) {
        return "Mr "+a;
    }
    
}
