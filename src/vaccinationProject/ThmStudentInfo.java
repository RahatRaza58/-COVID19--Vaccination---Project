package vaccinationProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class ThmStudentInfo extends VaccinationDate{
    ThmStudentInfo() throws FileNotFoundException {

        VaccinationDate vaccinationDate = new VaccinationDate();
        System.out.println("\nData Input to Tourism and Hospitality Management Students-");
        int a = 0;
        String name, department,section;
        int id, batch;
        try {
            Formatter formatter2 = new Formatter("C:/-COVID19--Vaccination---Project/DataEntryList/THM Students Info.txt");
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Student ID: ");
            id = input.nextInt();
            System.out.print("Enter name: ");
            name = input.next();


            a = vaccinationDate.time(20);
            System.out.print("Enter Your Batch: ");
            batch = input.nextInt();
            if (batch == 19)
            {
                System.out.println("Your Vaccination Date is "+a+" October");
                System.out.println("You must be join this day 10.00am to 12.00am.");
            }
            else if (batch == 20)
            {
                System.out.println("Your Vaccination Date is "+a+" October");
                System.out.println("You must be join this day 01.00pm to 03.00pm.");
            }
            else {
                System.out.println("Sorry Your Department or  Batch number didn't match");
            }

            formatter2.format("%s %s ", id, name);
            formatter2.close();


        }

        catch(
                FileNotFoundException e){
            System.out.println(e);
        }

        try {
            File file = new File("C:/-COVID19--Vaccination---Project/DataEntryList/THM Students Info.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {



                String fullid = scanner.next();
                String fullname = scanner.next();


                System.out.println();
                System.out.println("******************************");
                System.out.println("Vaccine Application Card For THM Department -");
                System.out.println("Name: " + fullname);
                System.out.print("Student ID: " + fullid);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/YYYY");
                Date date=new Date();
                System.out.print("\nApplication Date: "+simpleDateFormat.format(date));
                System.out.println("\n\nVaccine Name: ");
                System.out.println("First Doze Received Date: ");
                System.out.println("Second Doze Received Date: ");
                System.out.println("Vaccine Sender Name: ");
                System.out.println("Vaccine Sender Signature: ");
                System.out.println("******************************");
                System.out.println("[N.B~ This Application card must be brought with you on the day of vaccination]");
            }

            scanner.close();

        } catch (FileNotFoundException e) {

            System.out.println(e);

        }

    }

}

