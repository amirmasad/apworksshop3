import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void acontact(String firstname,String lastname) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter contacts's group!");
        String group = in.nextLine();
        System.out.println("Enter contacts's Email");
        String email = in.nextLine();
        System.out.println("Enter contacts's country code!");
        String countrycode = in.nextLine();
        System.out.println("Enter contacts's phonenumber!");
        String phonenumber = in.nextLine();
        System.out.println("Enter contacts's Address");
        String zipcode = in.nextLine();
        System.out.println("Enter contacts's country");
        String country = in.nextLine();
        System.out.println("Enter contacts's city");
        String city = in.nextLine();
        Address address = new Address(zipcode, country, city);
        phoneNumber number = new phoneNumber(countrycode, phonenumber);
        Contact person = new Contact(group, email, firstname, lastname, address, number);
        phonebook.addContact(person);

    }

    public static void showg(String group){

        int counter3 = 0;
        while (phonebook.findContacts(group)[counter3] != null){

            System.out.println(phonebook.findContacts(group)[counter3].email);
            System.out.println(phonebook.findContacts(group)[counter3].firstName);
            System.out.println(phonebook.findContacts(group)[counter3].lastName);
            System.out.println(phonebook.findContacts(group)[counter3].address.zipcode);
            System.out.println(phonebook.findContacts(group)[counter3].address.country);
            System.out.println(phonebook.findContacts(group)[counter3].address.city);
            System.out.println(phonebook.findContacts(group)[counter3].phonenumber.countrycode);
            System.out.println(phonebook.findContacts(group)[counter3].phonenumber.phoneNumber);
            counter3++;
        }
    }

    public static void showc(String firstname , String lastname ){

        System.out.println("contact email is : " + phonebook.findContact(firstname,lastname).email);
        System.out.println("contact firstname is : " + phonebook.findContact(firstname,lastname).firstName);
        System.out.println("contact lastname is : " + phonebook.findContact(firstname,lastname).lastName);
        System.out.println("contact address is : " + phonebook.findContact(firstname,lastname).address.zipcode);
        System.out.println("contact country is : " + phonebook.findContact(firstname,lastname).address.country);
        System.out.println("contact city is : " + phonebook.findContact(firstname,lastname).address.city);
        System.out.println("contact countrycode is : " + phonebook.findContact(firstname,lastname).phonenumber.countrycode);
        System.out.println("contact phonenumber is : " + phonebook.findContact(firstname,lastname).phonenumber.phoneNumber);

    }

    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        int operand = -1;
        while (operand != 6) {

            System.out.println("enter a number to continue operations: \n");
            System.out.println("1)a-contact");
            System.out.println("2)rcontact");
            System.out.println("3)showc");
            System.out.println("4)showg");
            System.out.println("5)print all");
            System.out.println("6)exit");
            operand = in.nextInt();

            switch (operand) {

                case 1:
                    System.out.println("enter firstname");
                    String firstname = in.nextLine();
                    System.out.println("enter lastname");
                    String lastname = in.nextLine();
                    acontact(firstname, lastname);

                case 3:
                    firstname = in.nextLine();
                    lastname = in.nextLine();
                    showc(firstname, lastname);

                case 4:
                    String group = in.nextLine();
                    showg(group);


            }

            System.out.println("enter a number to continue operations: \n");
            System.out.println("1)a-contact");
            System.out.println("2)rcontact");
            System.out.println("3)showc");
            System.out.println("4)showg");
            System.out.println("5)print all");
            System.out.println("6)exit");
            operand = in.nextInt();

        }
    }

}
