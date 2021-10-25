package vaccinationProject;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("Welcome to Vaccination Registration Process ");
        VaccinationDate vaccinationDate = new VaccinationDate();
        vaccinationDate.versity();


        Scanner input = new Scanner(System.in);
        System.out.print("Are you member Of Leading University(Y/N): ");
        char identity = input.next().charAt(0);

        //if (identity.equals("Y")) {
        if (identity=='Y') {
            System.out.println("****************************************");
            System.out.println("Current Status of Profession- ");
            System.out.println("1. Student");
            System.out.println("2. Teacher ");
            System.out.println("3. Employer");
            System.out.println("4. FAQ about covid-19");
            System.out.println("****************************************");



            Scanner in = new Scanner(System.in);
            System.out.print("Enter your Choose (1-4): ");
            int n = in.nextInt();

        switch (n) {
          case 1:
              System.out.println("\nPlease select Your Dept- ");
              System.out.println("*******************************************************");
              System.out.println("1.EEE Department\t\t 2.CSE Department");
              System.out.println("3.THM Department\t\t 4.BBA Department");
              System.out.println("5.CE Department\t\t\t 6.IS Department");
              System.out.println("7.ART Department\t\t 8.PH Department");
              System.out.println("9.ENG Department\t\t 10.BAN Department");
              System.out.println("11.LAW Department");
              System.out.println("***************************************************");


                    Scanner inp = new Scanner(System.in);
                    System.out.print("Select your Department (1-11): ");
                    int dept = inp.nextInt();
                    if (dept == 1)
                    {
                        EeeStudentInfo studentInfo1 = new EeeStudentInfo();
                    }
                    else if (dept == 2)
                    {
                        CseStudentInfo studentInfo2 = new CseStudentInfo();
                    }
                    else if (dept == 3)
                    {
                        ThmStudentInfo studentInfo3 = new ThmStudentInfo();
                    }
                    else if (dept == 4)
                    {
                        BbaStudentInfo studentInfo4 = new BbaStudentInfo();
                    }
                    else if (dept == 5)
                    {
                        CsetudentInfo studentInfo5 = new CsetudentInfo();
                    }
                    else if (dept == 6)
                    {
                        IsStudentInfo studentInfo6 = new IsStudentInfo();
                    }
                    else if (dept == 7)
                    {
                        ArtStudentInfo studentInfo7 = new ArtStudentInfo();
                    }
                    else if (dept == 8)
                    {
                        PhStudentInfo studentInfo8 = new PhStudentInfo();
                    }
                    else if (dept == 9)
                    {
                        EngStudentInfo studentInfo9 = new EngStudentInfo();
                    }
                    else if (dept == 10)
                    {
                        BanStudentInfo studentInfo10 = new BanStudentInfo();
                    }
                    else if (dept == 11)
                    {
                        LawStudentInfo studentInfo11 = new LawStudentInfo();
                    }
                    break;

           case 2:
                    TeacherInfo teacherInfo = new TeacherInfo();
                    break;
           case 3:
                    EmployeeInfo employeeInfo = new EmployeeInfo();
                    break;
            case 4:
                    FAQ faq =new FAQ ();
                    break;

           default:
                    System.out.println("*************Your Selected Option is Invalid*****************");

            }
        }

        else if (identity=='N')
        {
            System.out.println("\t\t\t\tSorry, You are not Permit to registration this from");
        }
        else
        {
            System.out.println("******************Invalid Input Type*****************************");
        }

    }
}



