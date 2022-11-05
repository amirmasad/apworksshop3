import java.util.Scanner;

public class phoneNumber{

Scanner in = new Scanner(System.in);

public String countrycode;
public String phoneNumber;

public phoneNumber(String countrycode,String phonenumber){

this.countrycode = countrycode;

while (phonenumber.length() != 12){

System.out.println("ENTER A VALID PHONE NUMBER WITH LENGTH OF 12...");
phonenumber = in.nextLine();

}

this.phoneNumber = phonenumber; 
 
}

public static String StringtoString(phoneNumber a){

String str1 = ("It's calling: +" + a.countrycode  + a.phoneNumber);

return str1;

}

}


