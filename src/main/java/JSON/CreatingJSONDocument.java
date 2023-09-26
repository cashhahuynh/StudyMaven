package JSON;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class CreatingJSONDocument {

    public static void main(String args[]) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", "1");
        jsonObject.put("First_Name", "Cashlynn");
        jsonObject.put("Last_Name", "Huynh");
        jsonObject.put("Date_Of_Birth", "1996-06-25");
        jsonObject.put("Place_Of_Birth", "Dallas, Texas");
        jsonObject.put("Country", "USA");

        try {
            FileWriter file = new FileWriter("output.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("JSON file created: " + jsonObject);
    }

}
