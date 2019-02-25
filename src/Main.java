import javax.json.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static final String Json_File = "src/jsonFiles/TI1.3Ontwerp5.json";

    public static void main(String[] args) {

       Reader.readJsonFile(Json_File);

    }



}
