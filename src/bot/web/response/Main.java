package bot.web.response;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Bot was started ...");
        //Start Logged module
        LogWorker lw = new LogWorker();
        PrintWriter writer = lw.CreateFile();
        writer.println(java.time.LocalDateTime.now() + " Main Store Logger is Started.");
        //Connect to DB
        DataBase db = new DataBase();
        Connection connection = db.createConnection(writer);
        connection.close();
        //Close Logger
        writer.println(java.time.LocalDateTime.now() + " Main, connection closed.");
        writer.close();
    }
}
