import tileMap.JsonIO;

public class Main {

    public static final String Json_File = "src/jsonFiles/TI1.3Ontwerp5.json";

    public static void main(String[] args) {
       JsonIO jsonIO = new JsonIO(Json_File);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(jsonIO.getJsonValueFromTag("height"));

    }



}
