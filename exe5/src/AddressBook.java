//Dominic Cruz / 11/2/25 / Exercise 5
//ADD ROBLOXXXXXXX
import java.util.*;//ADD ROBLOXXXXXXX
public class AddressBook {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Person> blackBook = new ArrayList<>();
    public static void main(String[] args) {
        int exit = 1;
        while (exit != 0) {
            System.out.println("Name:");
            String name = input.nextLine();
            System.out.println("Email;");
            String email = input.nextLine();
            blackBook.add(new Person(name, email));
            System.out.println("do you wanna exit? Y/N: ");
            String userIn = input.nextLine();
            if(userIn.equalsIgnoreCase("Y")){
                exit = 0;
            }else{
                System.out.println("add a new person!");
            }
        }
        System.out.println(blackBook);
        System.out.println("bye bye!!!");
        input.nextLine();
    }//ADD ROBLOXXXXXXX
}//ADD ROBLOXXXXXXX
