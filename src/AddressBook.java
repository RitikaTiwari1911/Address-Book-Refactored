import java.util.ArrayList;
import java.util.Scanner;

class ContactCategories {
    Scanner input = new Scanner(System.in);
    //can store multiple contact details
    ArrayList<String> firstName = new ArrayList<String>();
    ArrayList<String> lastName = new ArrayList<String>();
    ArrayList<String> address = new ArrayList<String>();
    ArrayList<String> city = new ArrayList<String>();
    ArrayList<String> state = new ArrayList<String>();
    ArrayList<Integer> zipCode = new ArrayList<Integer>();
    ArrayList<Integer> phoneNumber = new ArrayList<Integer>();
    ArrayList<String> emailId = new ArrayList<String>();


    //creating methods for various sub sections of the contact
    public String first_Name() {
        System.out.print("Enter the first name: ");
        String firstNameInput = input.nextLine();
        return firstNameInput;
    }

    public String last_Name() {
        System.out.print("Enter the last name: ");
        String lastNameInput = input.nextLine();
        return lastNameInput;
    }

    public String address_() {
        System.out.print("Enter the address");
        String addressInput = input.nextLine();
        return addressInput;
    }

    public String city_Name() {
        System.out.print("Enter the name of the city: ");
        String cityInput = input.nextLine();
        return cityInput;
    }

    public String state_Name() {
        System.out.print("Enter the name of the state: ");
        String stateInput = input.nextLine();
        return stateInput;
    }

    public int zip_Code() {
        System.out.print("Enter the zip code: ");
        int zipInput = input.nextInt();
        return zipInput;
    }

    public int phone_Number() {
        System.out.print("Enter the phone number: ");
        int phoneNumberInput = input.nextInt();
        return phoneNumberInput;
    }

    public String email_Id() {
        System.out.print("Enter the email id: ");
        String emailIdInput = input.nextLine();
        return emailIdInput;
    }

    //Ability to add new contact to Address Book
    public void addPersonContactDetail(){
        System.out.println("Add a new person in the Address Book");
        firstName.add(first_Name());
        lastName.add(last_Name());
        address.add(address_());
        city.add(city_Name());
        state.add(state_Name());
        zipCode.add(zip_Code());
        phoneNumber.add(phone_Number());
        emailId.add(email_Id());
    }
}

public class AddressBook {
    public static void main(String args[]) {
        System.out.println("Welcome to the Address Book !!");
        ContactCategories contactCategories = new ContactCategories();
        contactCategories.addPersonContactDetail();
    }

}
