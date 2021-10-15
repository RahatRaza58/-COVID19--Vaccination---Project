package vaccinationProject;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    String identity;

    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("Welcome to Vaccination Registration Process ");
        VaccinationDate vaccinationDate = new VaccinationDate();


        Scanner input = new Scanner(System.in);
        System.out.print("Are you member Of Leading University(Y/N): ");
        String identity = input.next();

        if (identity.equals("Y")) {
            System.out.println("****************************************");
            System.out.println("Please select Your Occupation- ");
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
                 /*   System.out.println("1.Electrical and Electronic Engineering-(EEE) ");
                    System.out.println("2.Computer Science and Engineering-(CSE)");
                    System.out.println("3.Tourism & Hospitality Management-(THM) ");
                    System.out.println("4.Business Administration-(BBA)");
                    System.out.println("5.Civil Engineering-(CE) ");
                    System.out.println("6.Islamic Studies-(IS) ");
                    System.out.println("7.Architecture-(AT) ");
                    System.out.println("8.Public Health-(PH) ");
                    System.out.println("9. English-(ENG) ");
                    System.out.println("10.Bangla-(BAN) ");
                    System.out.println("11.Law-(LAW) ");*/
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
                        CeStudentInfo studentInfo5 = new CeStudentInfo();
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

           default:
                    System.out.println("*************Invalid Integer Value Selected*****************");

            }
        }
        else if (identity.equals("N"))
        {
            System.out.println("Sorry You are not Permit");
        }
        else
        {
            System.out.println("******************Invalid Input Type*****************************");
        }
    }
}



        /*    if (n == 1) {
                System.out.println("\nPlease select Your Dept- ");
                System.out.println("1. CSE");
                System.out.println("2. Eee ");

                Scanner inp = new Scanner(System.in);
                System.out.print("Enter your Choose (1-3): ");
                int dept = inp.nextInt();
                if (dept == 1) {
                    StudentInfo studentInfo1 = new StudentInfo();
                } else if (dept == 2) {
                    EeeStudentInfo eeestudentInfo1 = new EeeStudentInfo();

                }
            }

             else if (n == 2) {
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
}*/
