package bot.web.response;

import java.io.*;

public class LogWorker {

    public static PrintWriter CreateFile(){
        PrintWriter writer = null;
        try {
            FileWriter file = new FileWriter("Log"+java.time.LocalDate.now()+".txt", true);
            writer = new PrintWriter(file, true);
            writer.println(java.time.LocalTime.now() + " Logger was started.");
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return writer;
    }
}
