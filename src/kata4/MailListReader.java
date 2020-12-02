package kata4;

import model.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    static List<Mail> read(String fileName) throws FileNotFoundException {
        List<Mail> list = new ArrayList<>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while (true) {                
                String line = reader.readLine();
                if (line == null) break;
                if (Mail.isMail(line))
                list.add(new Mail(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error MailListReader::read (File not found)" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error MailListReader::read (IO)" + e.getMessage());
        }
        
        
        return list;
    }
}