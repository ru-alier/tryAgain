package bot.web.response;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import static sun.plugin.javascript.navig.JSType.URL;

public class DataBase {

    public Connection createConnection(PrintWriter writer){
        //Get Variable for connection ti DBase from file "env"
        String URL="";
        String USERNAME="";
        String PASSWORD="";
        try {
            JSONParser parser = new JSONParser();
            JSONObject data = (JSONObject) parser.parse(
                    new FileReader("env"));//path to the JSON file.
            URL = (String) data.get("URL");
            USERNAME = (String) data.get("USERNAME");
            PASSWORD = (String) data.get("PASSWORD");

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        //Create connection
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            writer.println(java.time.LocalDateTime.now() + " DataBase. Connection was create.");
        } catch (Exception e) {
            e.printStackTrace();
            writer.println(java.time.LocalDateTime.now());
            writer.println(e.toString());
        }
        return connection;

    }

}
