
class AAC_variable_address{
    public static void main(String[] args) {   
       System.out.println("-------------Byte--------------");  
       byte varByte = -128;
       System.out.println("Value: "+varByte); 
       System.out.println("Address: "+System.identityHashCode(varByte));
       System.out.println("-------------Short--------------");        
       short varShort = -32768;
       System.out.println("Value: "+varShort);
       System.out.println("Address: "+System.identityHashCode(varShort));
       System.out.println("-------------Integer--------------"); 
       int varInt = -2147483648;
       System.out.println("Value: "+varInt);
       System.out.println("Address: "+System.identityHashCode(varInt));
       System.out.println("-------------Long--------------"); 
       long varLong = -9223372036854775808L;
       System.out.println("Value: "+varLong);
       System.out.println("Address: "+System.identityHashCode(varLong));
       System.out.println("-------------Float--------------"); 
       float varFloat = -3.40282347E+38F;
       System.out.println("Value: "+varFloat);
       System.out.println("Address: "+System.identityHashCode(varFloat));
       System.out.println("-------------Double--------------"); 
       double varDouble = -1.79769313486231570E+308;
       System.out.println("Value: "+varDouble);
       System.out.println("Address: "+System.identityHashCode(varDouble));
       System.out.println("-------------char--------------"); 
       char varChar = 'A';
       System.out.println("Value: "+varChar);
       System.out.println("Address: "+System.identityHashCode(varChar));
       System.out.println("-------------String--------------"); 
       String varString = "Java";
       System.out.println("Value: "+varString);
       System.out.println("Address: "+System.identityHashCode(varString));      
       System.out.println("-------------boolean--------------"); 
       boolean varBoolean = true;
       System.out.println("Value: "+varBoolean);
       System.out.println("Address: "+System.identityHashCode(varBoolean));    

    }
    
}