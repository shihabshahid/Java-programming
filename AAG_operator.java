import java.util.Scanner;
public class AAG_operator {
    public static void main(String[] args) {
       Scanner inputData = new Scanner(System.in);

       System.out.println("--------------Arithmatic Operator--------------");
       int firstValue,secondValue,result;
       float result1;
       System.out.print("Enter first value: ");
       firstValue = inputData.nextInt();
       System.out.print("Enter second value: ");
       secondValue = inputData.nextInt();
       result = firstValue+secondValue;
       System.out.println("Addition = "+result);
       result = firstValue-secondValue;
       System.out.println("Subtraction = "+result);
       result = firstValue*secondValue;
       System.out.println("Multiplication = "+result);
       result1 = firstValue/secondValue;
       System.out.println("Division = "+result1);
       result = firstValue%secondValue;
       System.out.println("Remainder = "+result);
        
       System.out.println("--------------Increment Operator--------------");
       System.out.print("Enter any value: ");
       firstValue = inputData.nextInt();       
       firstValue=firstValue+1;
       System.out.println("1st value is "+firstValue);
       firstValue++;
       System.out.println("2nd value is "+firstValue);
       ++firstValue;
       System.out.println("3rd value is "+firstValue);
       System.out.println("4th value is "+(firstValue++));
       System.out.println("5th value is "+(++firstValue));

       System.out.println("--------------Decrement  Operator--------------");
       System.out.print("Enter any value: ");
       secondValue = inputData.nextInt();
       secondValue=secondValue-1;
       System.out.println("1st value is "+secondValue);
       secondValue--;
       System.out.println("2nd value is "+secondValue);
       --secondValue;
       System.out.println("3rd value is "+secondValue);
       System.out.println("4th value is "+(secondValue--));
       System.out.println("5th value is "+(--secondValue));

       System.out.println("--------------Logical operators--------------");
       int thirdValue;
       boolean result2;
       System.out.print("Enter first value: ");
       firstValue = inputData.nextInt();
       System.out.print("Enter second value: ");
       secondValue = inputData.nextInt();
       System.out.print("Enter Third value: ");
       thirdValue = inputData.nextInt();
       result2 = (firstValue == secondValue);
       System.out.println("result == is "+result2);
       result2 = (firstValue > secondValue);
       System.out.println("result > is "+result2);
       result2 = (firstValue < secondValue);
       System.out.println("result < is "+result2);
       result2 = (firstValue != secondValue);
       System.out.println("result != is "+result2);
       result2 = !result2;
       System.out.println("result ! is "+result2);
       result2 = (firstValue == secondValue) && (firstValue == thirdValue);
       System.out.println("result && is "+result2);
       result2 = (firstValue == secondValue) || (firstValue == thirdValue);
       System.out.println("result || is "+result2);
        
       System.out.println("--------------Shifting Operators--------------");
       System.out.print("Enter any value: ");
       firstValue = inputData.nextInt();
       System.out.println("Value >>>3 is "+(firstValue>>>3));
       firstValue = firstValue>>2;
       System.out.println("Value >>2 is "+firstValue);
       firstValue = firstValue<<2;
       System.out.println("Value <<2 is "+firstValue);
       firstValue = firstValue>>>2;
       System.out.println("Value >>>2 is "+firstValue);

    }  
}
