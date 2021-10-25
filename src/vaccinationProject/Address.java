package vaccinationProject;

import java.util.Scanner;

public class Address {


    String country;
    String city;
    int houseNo;

    //Address(String country,String city,int houseNo)
    Address()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Country: ");
        country=input.next();
        System.out.print("Enter Your Current City: ");
        city=input.next();
        System.out.print("Enter Your House No: ");
        houseNo = input.nextInt();


    }
    void display()
    {
        System.out.println("Country: "+country);
        System.out.println("City: "+city);
        System.out.println("House No: "+houseNo);

    }


}