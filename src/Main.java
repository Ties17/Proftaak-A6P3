import javax.json.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static final String Json_File = "C:\\Users\\tiest\\Documents\\School\\Periode 3\\Proftaak FP\\Code via Git\\ProftaakA6P3-JsonReader\\Proftaak-A6P3\\src\\jsonFiles\\Yowhatup.json";

    public static void main(String[] args) {

        try (
                InputStream inputStream = new FileInputStream(Json_File);
                JsonReader jsonReader = Json.createReader(inputStream);
        ) {
            JsonObject jsonObject = jsonReader.readObject();

            for ( String name: jsonObject.keySet()){

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
