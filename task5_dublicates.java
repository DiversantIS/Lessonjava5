import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 
  
public class DuplicateNames { 
  
    public static void main(String[] args) { 
  
        //List of names 
        String[] names = { "Ivan Ivanov", "Petr Petrov", "Ivan Ivanov" }; 
  
        // Creating a HashMap containing name as key and its count as value 
        Map<String, Integer> nameAndCount = new HashMap<>(); 
  
        // Iterating through the names array 
        for (String name : names) { 
  
            // If name is present in nameAndCount put count + 1 
            if (nameAndCount.containsKey(name)) { 
  
                // Getting the current count 
                int count = nameAndCount.get(name); 
  
                // Adding 1 in the current count 
                nameAndCount.put(name, count + 1); 
            } 
  
            // If name is not present in nameAndCount put count as 1 
            else { 
                nameAndCount.put(name, 1); 
            } 
        } 
  
        printDubs(nameAndCount);
    }
    
    public static void printDubs(Map<String,Integer> m){
        // Iterating through the HashMap 
        for (Entry<String, Integer> entry : m.entrySet()) { 
            
            if (entry.getValue() > 1)
            // Printing name and count 
                System.out.println("Name: " + entry.getKey() + ", Count: "
                                + entry.getValue()); 
        } 
    }
} 