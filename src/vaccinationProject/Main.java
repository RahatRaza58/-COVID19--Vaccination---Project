package vaccinationProject;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    String identity;

    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("Welcome to Vaccination Registration Process ");
        VaccinationDate vaccinationDate = new VaccinationDate();


        //int a = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("\nAre you member Of Leading University(Yes/No): ");
        String identity = input.next();

        if (identity.equals("Yes")) {
            System.out.println("Please select Your Occupation- ");
            System.out.println("1. Student");
            System.out.println("2. Teacher ");
            System.out.println("3. Employer");

            Scanner in = new Scanner(System.in);
            System.out.print("Enter your Choose (1-3): ");
            int n = in.nextInt();

            if (n == 1) {
                StudentInfo studentInfo1 = new StudentInfo();
            } else if (n == 2) {
                TeacherInfo teacherInfo = new TeacherInfo();
            } else if (n == 3) {
                EmployeeInfo employeeInfo = new EmployeeInfo();
            }
            else
            {
                System.out.println("*************Invalid Integer Value Selected*****************");
            }
        }
        else if (identity.equals("No"))
        {
            System.out.println("Sorry You are not Permit");
        }
        else
        {
            System.out.println("******************Invalid Input Type*****************************");
        }
    }
}

