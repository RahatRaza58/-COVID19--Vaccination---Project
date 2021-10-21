package vaccinationProject;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Formatter;
import java.util.Scanner;



public class EmployeeInfo {
    EmployeeInfo() throws FileNotFoundException {
        //int a = 0;
        VaccinationDate vaccinationDate = new VaccinationDate();
        System.out.println("EmployeeInfo class-");
        try {
            Formatter formatter = new Formatter("");
            Scanner input = new Scanner(System.in);

            System.out.print("Enter NID:");
            NID = input.next();
            System.out.print("Enter name :");
            name = input.next();


            formatter.format("%s %s ", NID, name);
            formatter.close();


        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try {
            File file = new File("");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {

                String fullname = scanner.next();


                System.out.println(" Name: " + fullname);
                System.out.println("");

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

