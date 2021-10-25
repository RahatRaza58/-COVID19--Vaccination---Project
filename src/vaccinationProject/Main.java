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
            System.out.println("****************************************");



            Scanner in = new Scanner(System.in);
            System.out.print("Enter your Choose (1-3): ");
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
                        EEEStudentInfo studentInfo1 = new EEEStudentInfo();
                    }
                    else if (dept == 2)
                    {
                        CSEStudentInfo studentInfo2 = new CSEStudentInfo();
                    }
                    else if (dept == 3)
                    {
                        THMStudentInfo studentInfo3 = new THMStudentInfo();
                    }
                    else if (dept == 4)
                    {
                        BBAStudentInfo studentInfo4 = new BBAStudentInfo();
                    }
                    else if (dept == 5)
                    {
                        CEStudentInfo studentInfo5 = new CEStudentInfo();
                    }
                    else if (dept == 6)
                    {
                        ISStudentInfo studentInfo6 = new ISStudentInfo();
                    }
                    else if (dept == 7)
                    {
                        ARTStudentInfo studentInfo7 = new ARTStudentInfo();
                    }
                    else if (dept == 8)
                    {
                        PHStudentInfo studentInfo8 = new PHStudentInfo();
                    }
                    else if (dept == 9)
                    {
                        ENGGStudentInfo studentInfo9 = new ENGGStudentInfo();
                    }
                    else if (dept == 10)
                    {
                        BANStudentInfo studentInfo10 = new BANStudentInfo();
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



