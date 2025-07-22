import java.util.Scanner;
class AAF_run_time_value_assign_or_dynamic_programming {
    public static void main(String[] args) { 
       Scanner inputData = new Scanner(System.in);

       System.out.println("-------------Byte--------------");    
       byte varByte = inputData.nextByte();
       System.out.println(varByte);  
       System.out.println("-------------Short--------------");
       short varShort = inputData.nextShort();
       System.out.println(varShort);
       System.out.println("-------------Integer--------------");
       int varInt = inputData.nextInt();
       System.out.println(varInt); 
       System.out.println("-------------Long--------------"); 
       long varLong = inputData.nextLong();
       System.out.println(varLong);
       System.out.println("-------------Float--------------");
       float varFloat = inputData.nextFloat();
       System.out.println(varFloat);
       System.out.println("-------------Double--------------"); 
       double varDouble = inputData.nextDouble();
       System.out.println(varDouble);
       System.out.println("-------------char--------------"); 
       char varChar = inputData.next().charAt(0);
       System.out.println(varChar);
       inputData.nextLine();
       System.out.println("-------------String--------------");
       String varString = inputData.nextLine();
       System.out.println(varString);  
       System.out.println("-------------boolean--------------");
       boolean varBoolean = inputData.nextBoolean();
       System.out.println(varBoolean); 
    }
}
