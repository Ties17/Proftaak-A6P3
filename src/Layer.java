import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import java.util.Arrays;

public class Layer {

    private int[] data;
    private int height;
    private int id;
    private String name;
    private int opacity;
    private String type;
    private boolean visible;
    private int width;
    private int x;
    private int y;

    public Layer(JsonArray data, int height, int id, String name, int opacity, String type, boolean visible, int width, int x, int y) {
        this.data = new int[data.size()];

        for (int i = 0; i < data.size(); i++){
            this.data[i] = data.getJsonNumber(i).intValue();
        }

        this.height = height;
        this.id = id;
        this.name = name;
        this.opacity = opacity;
        this.type = type;
        this.visible = visible;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Layer{" +
                "data=" + Arrays.toString(data) +
                "\n height=" + height +
                "\n id=" + id +
                "\n name='" + name + '\'' +
                "\n opacity=" + opacity +
                "\n type='" + type + '\'' +
                "\n visible=" + visible +
                "\n width=" + width +
                "\n x=" + x +
                "\n y=" + y +
                '}';
    }
}
