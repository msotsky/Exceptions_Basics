import java.util.*;
public class ContactDriver {
    
    public static void main(String[] args){ //throws InvalidInputException{

        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> list = new ArrayList<>();

        while(sc.hasNext()){
            String line = sc.nextLine();
            try{
                Scanner scLine = new Scanner(line);
                String name = scLine.next();
                int month = scLine.nextInt();
                int day = scLine.nextInt();
                /*
                if(month > 12){
                    throw new InvalidInputException();
                }
                */
                Contact contact = new Contact(name, month, day);
                list.add(contact);
            }catch(InputMismatchException e){
                //System.out.println(e.getMessage()); <- this has a blank message
                System.out.println("Error in data");
            }catch(InvalidInputException e){
                System.out.println(e.getMessage());
            }
        }

        for(Contact c : list){
            System.out.println(c);
        }
    }
}
