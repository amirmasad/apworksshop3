import java.util.Scanner;
import java.util.Arrays;

public class Contact {

    String group;
    String email;
    String firstName;
    String lastName;
    Address address;
    phoneNumber phonenumber ;
    public static Contact[] ContactList = new Contact[20];

    public Contact(String group,String email,String firstName,String lastName, Address address , phoneNumber phonenumber) {

        this.group = group;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phonenumber =phonenumber;

    }


}



 
