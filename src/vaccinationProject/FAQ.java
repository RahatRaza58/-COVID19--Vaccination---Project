package vaccinationProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FAQ {
    FAQ() throws FileNotFoundException {
        try {
            File file = new File("C:/COVID19  Vaccination  Project/DataEntryList/FAQ.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String Line = scanner.next();
                System.out.println(Line);
            }
            scanner.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}