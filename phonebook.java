import java.util.Arrays;
import java.util.Scanner;

public class phonebook {

   private static int counter = 0;
   private static int order = 0;
    public static void addContact(Contact contact) {

        while (Contact.ContactList[counter] != null) {

            if ((Contact.ContactList[counter].group == contact.group) && (Contact.ContactList[counter].email == contact.email) && (Contact.ContactList[counter].group == contact.group) && (Contact.ContactList[counter].firstName == contact.firstName) && (Contact.ContactList[counter].lastName == contact.lastName) && (Contact.ContactList[counter].address.zipcode == contact.address.zipcode)) {

                break;
            }

            counter++;
        }


        if (counter <= 19) {

            Contact.ContactList[order] = contact;
            System.out.println("contact is created");
            System.out.println(contact.email);
            System.out.println(contact.group);
            System.out.println(contact.firstName);
            System.out.println(contact.lastName);
            System.out.println(contact.address.zipcode);
            System.out.println(contact.address.country);
            System.out.println(contact.address.city);
            System.out.println(contact.phonenumber.countrycode);
            System.out.println(contact.phonenumber.phoneNumber);
            order++;

        }


        if (counter == 20) {

            System.out.println("server is full!");

        }

    }

    private static int counter1 = 0;
    public static Contact findContact(String firstname, String lastname) {


        while ((Contact.ContactList[counter1].firstName != firstname) && (Contact.ContactList[counter1].lastName != lastname)) {

            counter1++;

        }

        return Contact.ContactList[counter1];
    }

    private static int order2 = 0;
    private static int counter2 = 0;
    public static Contact[] result = new Contact[20];
    public static Contact[] findContacts(String group) {



        while (counter2 != 20) {
            if (Contact.ContactList[counter2].group == group) {

                result[order2] = Contact.ContactList[counter2];
                order2++;

            }

            counter2++;
        }

        return result;
    }


    public static void printcontacts() {

        int counter = 0;
        while (Contact.ContactList[counter] != null) {

            System.out.println("contact name is " + Contact.ContactList[counter].firstName);
            System.out.println("contact sual is " + Contact.ContactList[counter].lastName);
            System.out.println("contact belongs to " + Contact.ContactList[counter].group);
            counter++;

        }

    }
}