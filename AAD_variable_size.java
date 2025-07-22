
class AAD_variable{
    public static void main(String[] args) { 
       System.out.println("-------------Byte--------------");         
       byte varByte = -128;
       System.out.println("Value: "+varByte); 
       System.out.println("Byte Size: "+Byte.BYTES); 
       System.out.println("-------------Short--------------");         
       short varShort = -32768;
       System.out.println("Value: "+varShort); 
       System.out.println("Byte Size: "+Short.BYTES); 
       System.out.println("-------------Integer--------------"); 
       int varInt = -2147483648;
       System.out.println("Value: "+varInt); 
       System.out.println("Byte Size: "+Integer.BYTES); 
       System.out.println("-------------Long--------------"); 
       long varLong = -9223372036854775808L;
       System.out.println("Value: "+varLong); 
       System.out.println("Byte Size: "+Long.BYTES); 
       System.out.println("-------------Float--------------"); 
       float varFloat = -3.40282347E+38F;
       System.out.println("Value: "+varFloat); 
       System.out.println("Byte Size: "+Float.BYTES); 
       System.out.println("-------------Double--------------"); 
       double varDouble = -1.79769313486231570E+308;
       System.out.println("Value: "+varDouble); 
       System.out.println("Byte Size: "+Double.BYTES); 
       System.out.println("-------------char--------------"); 
       char varChar = 'A';
       System.out.println("Value: "+varChar); 
       System.out.println("Byte Size: "+Character.BYTES); 
       System.out.println("-------------String--------------"); 
       String varString = "Java";
       System.out.println("Value: "+varString);
       System.out.println("Byte Size: "+ (8 + varString.length() * Character.BYTES));
       System.out.println("-------------boolean--------------"); 
       boolean varBoolean = true;
       System.out.println("Value: "+varBoolean); 
       System.out.println("Byte Size: "+ 1); 

    }
    
}