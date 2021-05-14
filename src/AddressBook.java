import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

class ContactCategories {
    Scanner input = new Scanner(System.in);
    //can store multiple contact details
    ArrayList<String> firstName = new ArrayList<>();
    ArrayList<String> lastName = new ArrayList<>();
    ArrayList<String> address = new ArrayList<>();
    ArrayList<String> city = new ArrayList<>();
    ArrayList<String> state = new ArrayList<>();
    ArrayList<String> emailId = new ArrayList<>();
    ArrayList<Integer> zipCode = new ArrayList<>();
    ArrayList<Integer> phoneNumber = new ArrayList<>();


    //creating methods for various sub sections of the contact
    public String first_Name() {
        System.out.print("Enter the first name: ");
        String firstNameInput = input.next();
        boolean duplicateNameCheck=checkDuplicate(firstNameInput);
        if(duplicateNameCheck == true)
            System.out.println("The name already exists!");
        return firstNameInput;
    }

    public String last_Name() {
        System.out.print("Enter the last name: ");
        String lastNameInput = input.next();
        return lastNameInput;
    }

    public String address_() {
        System.out.print("Enter the address");
        String addressInput = input.next();
        return addressInput;
    }

    public String city_Name() {
        System.out.print("Enter the name of the city: ");
        String cityInput = input.next();
        return cityInput;
    }

    public String state_Name() {
        System.out.print("Enter the name of the state: ");
        String stateInput = input.next();
        return stateInput;
    }

    public String email_Id() {
        System.out.print("Enter the email id: ");
        String emailIdInput = input.next();
        return emailIdInput;
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

    //Ability to add new contact to Address Book
    public void addPersonContactDetail() {
        System.out.println("Add a new person in the Address Book");
        firstName.add(first_Name());
        lastName.add(last_Name());
        address.add(address_());
        city.add(city_Name());
        state.add(state_Name());
        emailId.add(email_Id());
        zipCode.add(zip_Code());
        phoneNumber.add(phone_Number());
    }


    //Ability to edit the details of the contact
    public void editDetails() {
        System.out.println("Enter the name of the contact you want to edit");
        String editName = input.next();
        int firstNameIndex = firstName.indexOf(editName);
        int pos = firstNameIndex;
        if (firstName.contains(editName)) {

            firstName.set(pos, first_Name());
            lastName.set(pos, last_Name());
            address.set(pos, address_());
            city.set(pos, city_Name());
            state.set(pos, state_Name());
            emailId.set(pos, email_Id());
            zipCode.set(pos, zip_Code());
            phoneNumber.set(pos, phone_Number());

            System.out.println("Contact added successfully");
        } else {
            System.out.println("The name does not exist !!");
        }
    }

    //Ability to delete a contact detail
    public void deleteDetails() {
        System.out.println("Enter the name of the contact you want to delete: ");
        String deleteName = input.next();
        int firstNameIndex = firstName.indexOf(deleteName);
        int pos = firstNameIndex;
        if (firstName.contains(deleteName)) {
            firstName.remove(pos);
            lastName.remove(pos);
            address.remove(pos);
            city.remove(pos);
            state.remove(pos);
            emailId.remove(pos);
            zipCode.remove(pos);
            phoneNumber.remove(pos);

            System.out.println("Contact detail has been successfully deleted !!");
        } else {
            System.out.println("The name does not exist!!");
        }
    }

    // Ability to display the contact details
    public void displayDetails() {
        System.out.println("First Name: " + firstName + " Last Name: " + lastName + " Address: " + address + " State: " + state + " Zip Code: " + zipCode + " Phone Number: " + phoneNumber + " Email Id:  " + emailId);
    }

    // Ability to provide user with various options
    public void options() {
        while (true) {
            System.out.println("========================================\n Enter 1 to add new contact \n Enter 2 to add edit contact \n Enter 3 to delete a contact \n Enter 4 to exit the address book \n=======================================");
            int chooseOption = input.nextInt();
            switch (chooseOption) {
                case 1:
                    //Ability to add new contact
                    addPersonContactDetail();
                    break;

                case 2:
                    editDetails();
                    break;

                case 3:
                    deleteDetails();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter the correct option!!");
                    break;
            }
            displayDetails();
        }
    }

    //method to prevent any duplicate name
    public boolean checkDuplicate(String name){
        if(firstName.contains(name))
            return true;
        else
            return false;
    }
}

    //main method
    public class AddressBook {
        public static void main(String args[]) {
            System.out.println("Welcome to the Address Book !!");
            ContactCategories contactCategories = new ContactCategories();
            contactCategories.addPersonContactDetail();
            contactCategories.options();
        }
    }


