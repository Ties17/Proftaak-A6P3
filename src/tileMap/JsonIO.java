package tileMap;

import javax.json.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JsonIO {

    private  JsonObject jsonObject;

    public JsonIO(String filename) {
        readJsonFile(filename);
    }

    public void readJsonFile(String filename){
        try (
                InputStream inputStream = new FileInputStream(filename);
                JsonReader jsonReader = Json.createReader(inputStream);
        ) {
           jsonObject = jsonReader.readObject();

            IteratingTroughJsonObject(jsonObject);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void IteratingTroughJsonObject(JsonObject jsonObject){

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

    public void jsonObjectReadingOutArray(JsonArray jsonArray){
        for (JsonValue jsonValue : jsonArray){
            if (jsonValue.getValueType().equals("OBJECT")){
                IteratingTroughJsonObject((JsonObject) jsonValue);
            } else {
                System.out.println(jsonValue);
            }
        }
    }

    public JsonValue getJsonValueFromTag(String tag){
        return this.jsonObject.get(tag);
    }

    public int getIntFromTag(String tag){
        return this.jsonObject.getInt(tag);
    }

    public boolean getBooleanFromTag(String tag){
        return this.jsonObject.getBoolean(tag);
    }

    public JsonArray getJsonArrayFromTag(String tag){
        return this.jsonObject.getJsonArray(tag);
    }

    public String getStringFromTag(String tag){
        return this.jsonObject.getString(tag);
    }

    public double getDoubleFromTag(String tag){
        return Double.parseDouble(this.jsonObject.getString(tag));
    }


}
