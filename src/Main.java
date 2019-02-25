import javax.json.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static final String Json_File = "src/jsonFiles/TI1.3Ontwerp5.json";

    public static void main(String[] args) {

        try (
                InputStream inputStream = new FileInputStream(Json_File);
                JsonReader jsonReader = Json.createReader(inputStream);
        ) {
            JsonObject jsonObject = jsonReader.readObject();


            for ( String name: jsonObject.keySet()){
                System.out.println(jsonObject.get(name));
                switch (jsonObject.get(name).getValueType()){
                    case ARRAY:
                    case NUMBER:
                    case OBJECT:
                    case STRING:
                    case NULL:
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
