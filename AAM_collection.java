import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
public class AAM_collection {

    public static void main(String[] args){
        System.out.println("==========ArrayList============");
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
        list.add("Ravi");//Adding object in arraylist  
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay");  
        //Traversing list through Iterator  
        Iterator itr=list.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
        System.out.println("===========LinkedList===========");
        LinkedList<String> al=new LinkedList<String>();  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ravi");  
        al.add("Ajay");  
        Iterator<String> itr1=al.iterator();  
        while(itr1.hasNext()){  
            System.out.println(itr1.next());  
        }  
        System.out.println("===========HashSet===========");
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("===========TreeSet===========");
        TreeSet<String> cars1 = new TreeSet<>();
        cars1.add("Volvo");
        cars1.add("BMW");
        cars1.add("Ford");
        cars1.add("BMW");  // Duplicate
        cars1.add("Mazda");
        System.out.println(cars1);
        System.out.println("===========LinkedHashSet===========");
        LinkedHashSet<String> cars2 = new LinkedHashSet<>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("BMW");  // Duplicate
        cars2.add("Mazda");
        System.out.println(cars2);
        System.out.println("===========HashMap===========");
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println("===========TreeMap===========");
        TreeMap<String, String> capitalCities1 = new TreeMap<>();
        capitalCities1.put("England", "London");
        capitalCities1.put("India", "New Dehli");
        capitalCities1.put("Austria", "Wien");
        capitalCities1.put("Norway", "Oslo");
        capitalCities1.put("Norway", "Oslo"); // Duplicate
        capitalCities1.put("USA", "Washington DC");
        System.out.println(capitalCities1);
        System.out.println("===========LinkedHashMap===========");
        LinkedHashMap<String, String> capitalCities2 = new LinkedHashMap<>();
        capitalCities2.put("England", "London");
        capitalCities2.put("India", "New Dehli");
        capitalCities2.put("Austria", "Wien");
        capitalCities2.put("Norway", "Oslo");
        capitalCities2.put("Norway", "Oslo"); // Duplicate
        capitalCities2.put("USA", "Washington DC");
        System.out.println(capitalCities2);
        System.out.println("===========Vector===========");
        Vector<String> v=new Vector<String>();  
        v.add("Ayush");  
        v.add("Amit");  
        v.add("Ashish");  
        v.add("Garima");  
        Iterator<String> itr2=v.iterator();  
        while(itr2.hasNext()){  
        System.out.println(itr2.next());  
        }  
        System.out.println("==========Stack============");
        Stack<String> stack = new Stack<String>();  
        stack.push("Ayush");  
        stack.push("Garvit");  
        stack.push("Amit");  
        stack.push("Ashish");  
        stack.push("Garima");  
        stack.pop();  
        Iterator<String> itr3=stack.iterator();  
        while(itr3.hasNext()){  
            System.out.println(itr3.next());  
        }  
        System.out.println("==========Queue============");
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());
        
    }
    
}
