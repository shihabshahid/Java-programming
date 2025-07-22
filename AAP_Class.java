public class AAP_Class {
    public static void main(String[] args) {
        Student s1=new Student();  
        System.out.println(s1.id);  
        System.out.println(s1.name); 
        
        //Initialization through reference
        s1.id=101;  
        s1.name="Shihab";  
        System.out.println(s1.id+" "+s1.name);  
        
        //create multiple objects and store information in it through reference variable.
        Student s2=new Student();  
        Student s3=new Student();  
        s2.id=102;  
        s2.name="Uddin";  
        s3.id=103;  
        s3.name="Shahid";  
        System.out.println(s2.id+" "+s2.name);  
        System.out.println(s3.id+" "+s3.name);  
        
        //Initialization through method
        Student s4=new Student();  
        s4.setData(104, "Tanvir");
        s4.displayInformation();
        
        //Initialization through a constructor
        Student s5=new Student(105,"Sharif");  
        s5.displayInformation();
        
        //Inheritance
        //Single Inheritance
        //Multilevel Inheritance
        //Hierarchical Inheritance
        //multiple inheritance is not supported in java
        //hybrid inheritance is not supported in java
        Programmer p1=new Programmer();  
        System.out.println("Programmer salary is:"+p1.salary);  
        System.out.println("Bonus of Programmer is:"+p1.bonus);  
        
        
        //Polymorphism in Java
        //Upcasting 
        //class A{}  
        //class B extends A{}  
        //A a=new B();//upcasting  
        BDBank b;  
        b=new IBBL();  
        System.out.println("IBBL Rate of Interest: "+b.getRateOfInterest());  
        b=new SBL();  
        System.out.println("SBL Rate of Interest: "+b.getRateOfInterest());  
        b=new EBL();  
        System.out.println("EBL Rate of Interest: "+b.getRateOfInterest()); 
        
        Bike obj=new Honda();  
        System.out.println(obj.speedlimit);//90  
        
        //every non-static method in JAVA is by default virtual method except final and private methods
        
    }
}
 class BDBank {
    float getRateOfInterest()
    {
        return 0;
    }
}
 class EBL extends BDBank{
    float getRateOfInterest()
    {
        return 9.7f;
    }  
}
 class IBBL extends BDBank {
    float getRateOfInterest()
    {
        return 8.4f;
    }  
}
 class SBL extends BDBank{
    float getRateOfInterest()
    {
        return 7.3f;
    }  
}
 class Bike{
    int speedlimit=90;  
}

 class Honda extends Bike{
     int speedlimit=150;  
}
 class Employee {
    float salary=40000;  
}

 class Programmer extends Employee {
    int bonus=10000;  
}
 class Student {
    int id;
    String name;
    Student()
    {
        this.id=0;
        this.name=null;
    }
    Student(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    void setData(int id, String name){  
        this.id=id;  
        this.name=name;  
    }  
    void displayInformation()
    {
        System.out.println(id+" "+name);
    }  
}