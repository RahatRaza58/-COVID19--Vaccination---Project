package vaccinationProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class TeacherInfo {
    TeacherInfo() throws FileNotFoundException   {

        VaccinationDate vaccinationDate = new VaccinationDate();
        System.out.println("\nTeacherInfo class-");
        int s=0;
        s = vaccinationDate.time(20);

        String NID,name,department;
        try{
            Formatter formatter =new Formatter("C:/COVID19  Vaccination  Project/DataEntryList/Teachers Info.txt");
            Scanner input=new Scanner (System.in);

            System.out.print("Enter NID:");
            NID=input.next();
            System.out.print("Enter name :");
            name=input.next();
            System.out.print("Enter  Department:");
            department=input.next();




            formatter.format("%s %s %s",NID,name,department);
            formatter.close();



        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        try{
            File file =new File ("C:/COVID19  Vaccination  Project/DataEntryList/Teachers Info.txt");
            Scanner scanner =new Scanner (file);
            while(scanner.hasNext()){
                String fullnid=scanner.next();
                String fullname =scanner.next();
                String fulldepartment=scanner.next();

                System.out.println();
                System.out.println("*********************************************************");
                System.out.println("Vaccine Application Card For Teachers-");
                System.out.println("Name: "+fullname );
                System.out.println("Department:"+fulldepartment);
                System.out.println("Date:"+s);
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/YYYY");
                Date date=new Date();
                System.out.print("Application Date: "+simpleDateFormat.format(date)+"");
                System.out.println("\n\nFirst Doze Vaccine Name: ");
                System.out.println("First Doze Received Date: ");
                System.out.println("Second Doze Vaccine Name: ");
                System.out.println("Second Doze Received Date: ");
                System.out.println("Vaccine Sender Name: ");
                System.out.println("Vaccine Sender Signature: ");
                System.out.println("\n************************************************************");
                System.out.println("[N.B~ This Application card must be brought with you on the day of vaccination]");

            }
            scanner.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
