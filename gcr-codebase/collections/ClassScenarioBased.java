import java.util.*;
class Contact{
    String name;
    String phone;
    String email;
    
    Contact(String name,String phone ,String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }
}
//storage searching  duplicate prevention  delete dispaly contacts 
public class ClassScenarioBased {
    ArrayList<Contact> contact=new ArrayList<>();
    HashMap<String,Contact> map=new HashMap<>();
    HashSet<String> phoneSet=new HashSet<>() ;

    public void addContact(String name,String phone,String email){
        if(phoneSet.contains(phone)){
            System.out.println("Duplicate detected");
        }
        else{
            Contact c=new Contact(name,phone,email);
            contact.add(c);
            map.put(name,c);
            phoneSet.add(phone);
            System.out.println("Contact added");
            
        }
    }
    //search contact
    public void SearchContact(String name){
        Contact c=map.get(name);
        
    }  
}
