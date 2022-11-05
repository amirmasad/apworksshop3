public class Address{

String zipcode;
String country;
String city;

public Address (String zipcode,String country,String city){

this.zipcode = zipcode;
this.country = country;
this.city = city;

}

public String StirngtoString(){

String str1 = ("Address is: " + this.zipcode + "\n" + "Country is: " + this.country + "\nCity is: " + this.city);
return str1;

}

}

   