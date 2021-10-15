package vaccinationProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class TeacherInfo {
    TeacherInfo() throws FileNotFoundException {

        VaccinationDate vaccinationDate = new VaccinationDate();
        System.out.println("TeacherInfo class-");
        int s=0;
        s = vaccinationDate.time(20);

        String NID,name,department;
        try{
            Formatter formatter =new Formatter("");
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
            File file =new File ("");
            Scanner scanner =new Scanner (file);
            while(scanner.hasNext()){
                String fullnid=scanner.next();
                String fullname =scanner.next();
                String fulldepartment=scanner.next();

                System.out.println( " Name: "+fullname );
                System.out.println("Department:"+fulldepartment);
                System.out.println("Date:"+s);

            }
            scanner.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
