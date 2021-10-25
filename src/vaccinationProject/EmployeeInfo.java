package vaccinationProject;
import java.io.File;
import java.io.FileNotFoundException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;



public class EmployeeInfo {

    EmployeeInfo() throws FileNotFoundException {
        VaccinationDate vaccinationDate = new VaccinationDate();
        System.out.println("****************************************");
        System.out.println("Employee Information Input -");
        int s=0;
        s = vaccinationDate.time(20);

        String NID,name,department,age;
        //int age;
        try{
            Formatter formatter =new Formatter("C:/COVID19  Vaccination  Project/DataEntryList/Employee Info.txt");
            Scanner input=new Scanner (System.in);

            System.out.print("Enter NID:");
            NID=input.next();
            System.out.print("Enter name :");
            name=input.next();
            System.out.print("Enter Age :");
            age=input.next();
            System.out.println("****************************************");




            formatter.format("%s %s %s",NID,name,age);
            formatter.close();



        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        try{
            File file =new File ("C:/COVID19  Vaccination  Project/DataEntryList/Employee Info.txt");
            Scanner scanner =new Scanner (file);
            while(scanner.hasNext()){
                String fullnid=scanner.next();
                String fullname =scanner.next();
                String currentage=scanner.next();


                System.out.println();
                System.out.println("****************************************");
                System.out.println("Vaccine Application Card For Employee-");
                System.out.println("Name: "+fullname );
                System.out.println("Current Age:"+currentage);
                Address address=new Address();
                address.display();
                System.out.println("1st Doze taken Date:"+s);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/YYYY");
                Date date=new Date();
                System.out.print("Application Date: "+simpleDateFormat.format(date)+"");
                System.out.println("\n\nFirst Doze Vaccine Name: ");
                System.out.println("First Doze Received Date: ");
                System.out.println("Second Doze Vaccine Name: ");
                System.out.println("Second Doze Received Date: ");
                System.out.println("Vaccine Sender Name: ");
                System.out.println("Vaccine Sender Signature: ");
                System.out.println("\n****************************************");
                System.out.println("[N.B~ This Application card must be brought with you on the day of vaccination]");

            }
            scanner.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }


    }


