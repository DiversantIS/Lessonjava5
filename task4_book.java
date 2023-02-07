import java.util.HashMap;

public class Phonebook {
    
    // HashMap to store the phonebook
    private HashMap<String, String[]> phonebook;
    
    // Constructor
    public Phonebook(){
        phonebook = new HashMap<>();
    }
    
    // Add a person to the phonebook
    public void addPerson(String name, String[] phones){
        phonebook.put(name, phones);
    }
    
    // Get the phones of a person
    public String[] getPhones(String name){
        return phonebook.get(name);
    }
    
    public static void main(String[] args){
        // Create a phonebook
        Phonebook book = new Phonebook();
        
        // Add some people to the phonebook
        book.addPerson("John", new String[]{"123456789", "987654321"});
        book.addPerson("Alice", new String[]{"567891234"});
        
        // Get the phones of John
        String[] phones = book.getPhones("John");
        // Print the phones of John
        for(String phone : phones){
            System.out.println(phone);
        }
    }
}