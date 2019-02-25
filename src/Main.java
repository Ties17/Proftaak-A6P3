import javax.json.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class Main {

    public static final String Json_File = "src/jsonFiles/TI1.3Ontwerp5.json";

    public static void main(String[] args) {

        try (
                InputStream inputStream = new FileInputStream(Json_File);
                JsonReader jsonReader = Json.createReader(inputStream);
        ) {
            JsonObject jsonObject = jsonReader.readObject();

            IteratingTroughJsonObject(jsonObject);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void IteratingTroughJsonObject(JsonObject jsonObject){

        for (String name : jsonObject.keySet()){
            switch (jsonObject.get(name).getValueType()){
                case ARRAY:
                    JsonArray jsonArray = (JsonArray)jsonObject.get(name);
                    System.out.println(name + ": " );
                    jsonObjectReadingOutArray(jsonArray);
                    break;
                case NUMBER:
                    System.out.println(name + ": " + jsonObject.get(name));
                    break;
                case OBJECT:
                    System.out.println(name + ": ");
                    IteratingTroughJsonObject((JsonObject)jsonObject.get(name));

                    break;
                case STRING:
                    System.out.println(name + ": " + jsonObject.get(name));
                    break;
                case NULL:
                    System.out.println(name + ": " + jsonObject.get(name));
                    break;
                case TRUE:
                    System.out.println(name + ": " + jsonObject.get(name));
                    break;
                case FALSE:
                    System.out.println(name + ": " + jsonObject.get(name));
                    break;
                default:
                    System.out.println("Jo boi dr gaat iets mis");
                    break;
            }
        }
    }

    public static void jsonObjectReadingOutArray(JsonArray jsonArray){
        for (JsonValue jsonValue : jsonArray){
            if (jsonValue.getValueType().equals("OBJECT")){
                IteratingTroughJsonObject((JsonObject) jsonValue);
            } else {
                System.out.println(jsonValue);
            }
        }
    }

}
