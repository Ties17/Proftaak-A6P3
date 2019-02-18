import javax.json.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static final String path = System.getProperty("user.dir");

    public static final String Json_File = path + "\\Yowhatup.json";

    public static void main(String[] args) {

        try (
                InputStream inputStream = new FileInputStream(Json_File);
                JsonReader jsonReader = Json.createReader(inputStream);
        ){



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
