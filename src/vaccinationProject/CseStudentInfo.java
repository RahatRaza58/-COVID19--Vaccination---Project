package vaccinationProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class CseStudentInfo {
    CseStudentInfo() throws FileNotFoundException {

        VaccinationDate vaccinationDate = new VaccinationDate();
        System.out.println("\nData Input to CSE Students- ");
        int a = 0;
        String name,section;
        int id, batch;

        try {
            Formatter formatter2 = new Formatter("C:/COVID19  Vaccination  Project/DataEntryList/CSE Student Info.txt");
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Student ID: ");
            id = input.nextInt();
            System.out.print("Enter name: ");
            name = input.next();

// Computer Science & Engineering


         a = vaccinationDate.time(20);
         System.out.print("Enter Your Batch: ");
         batch = input.nextInt();
         if (batch == 53) {
              System.out.print("Enter Your Section: ");
                 section = input.next();
                    if (section.equals("A"))
                    {
                        System.out.println("\nThank You," + name + " .\nYou Registration is now complete.");
                        System.out.println("Your Vaccination Date is 25 October");
                        System.out.println("You must be join this day 08.00am to 08.30am.");
                    }
                    else if (section.equals("B"))
                    {
                        System.out.println("\nThank You," + name + ".\nYou Registration is complete");
                        System.out.println("Your Vaccination Date is 25 October");
                        System.out.println("You must be join this day 08.30pm to 09.00pm.");
                    }
                    else if (section.equals("C")) {
                        System.out.println("\nThank You," + name + ".You Registration is complete");
                        System.out.println("Your Vaccination Date is 26 October");
                        System.out.println("You must be join this day 09.00am to 09.30am.");
                    }
                    else if (section.equals("D")) {
                        System.out.println("\nThank You," + name + " .You Registration is complete");
                        System.out.println("Your Vaccination Date is "+a+" October");
                        System.out.println("You must be join this day 09.30pm to 10.00pm.");
                    }
                    else if (section.equals("E")) {
                        System.out.println("\nThank You," + name + " .You Registration is complete");
                        System.out.println("Your Vaccination Date is 27 October");
                        System.out.println("You must be join this day 10.00am to 10.30am.");
                    }
                    else if (section.equals("F")) {
                        System.out.println("\nThank You," + name + " .You Registration is complete");
                        System.out.println("Your Vaccination Date is 27 October");
                        System.out.println("You must be join this day 10.30pm to 11.00pm.");
                    }
                    else if (section.equals("G")) {
                        System.out.println("\nThank You," + name + " .You Registration is complete");
                        System.out.println("Your Vaccination Date is 28 October");
                        System.out.println("You must be join this day 11.00am to 11.30am.");
                    }
                    else {
                        System.out.println("Sorry Section didn't match");
                    }
         }
         else if (batch == 52)
                {
                    System.out.println("\nThank You," +name+ ".You Registration is complete");
                    System.out.println("Your Vaccination Date is "+a+" October");
                    System.out.println("You must be join this day 12.00am to 12.30am.");
                }
                else if (batch==51)
                {
                    System.out.println("\nThank You," +name+ ".You Registration is complete");
                    System.out.println("Your Vaccination Date is "+a+" October");
                    System.out.println("You must be join this day 12.30am to 01.00am.");

                }
         else if (batch==50)
                {
                    System.out.println("\nThank You," +name+ ".You Registration is complete");
                    System.out.println("Your Vaccination Date is "+a+" October");
                    System.out.println("You must be join this day 01.30am to 02.00am.");

                }
         else if (batch==49)
                {
                    System.out.println("\nThank You," +name+ ".You Registration is complete");
                    System.out.println("Your Vaccination Date is "+a+" October");
                    System.out.println("You must be join this day 02.00am to 02.30am.");
                }
         else
                {
                    System.out.println("Sorry Your Department or  Batch number didn't match");
                }


            formatter2.format("%s %s ", id, name);
            formatter2.close();


        } catch(
                FileNotFoundException e){
            System.out.println(e);
        }
        try {
            File file = new File("C:/COVID19  Vaccination  Project/DataEntryList/CSE Student Info.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {


              //  String fulldepartment = scanner.next();
                String fullid = scanner.next();
                String fullname = scanner.next();


                System.out.println();
                System.out.println(" *****************************");
                System.out.println("Vaccine Application Card");
                System.out.println("Name: " + fullname);
             //   System.out.print("Department: " + fulldepartment);
                System.out.print("Student ID: " + fullid);
                //System.out.println("\nDate:" + a + "September");
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/YYYY");
                Date date=new Date();
                System.out.print("\nApplication Date: "+simpleDateFormat.format(date));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);

        }
    }

}


