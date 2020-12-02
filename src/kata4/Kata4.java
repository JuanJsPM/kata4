package kata4;

import view.MailHistogramBuilder;
import view.HistogramDisplay;
import model.Mail;
import model.Histogram;
import java.io.FileNotFoundException;
import java.util.List;


public class Kata4 {


    public static void main(String[] args) throws FileNotFoundException {
        
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM...", mailHistogram);
        histogramDisplay.execute();
    }

}