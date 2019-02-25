package tileMap;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.util.Arrays;

public class Layer {

        private JsonArray data;
        private int height;
        private int id;
        private String name;
        private int opacity;
        private String type;
        private boolean visible;
        private int width;
        private int x;
        private int y;

        public Layer(JsonObject layer) {

            this.data = layer.getJsonArray("data");
            this.height = layer.getInt("height");
            this.id = layer.getInt("id");
            this.name = layer.getString("name");
            this.opacity = layer.getInt("opacity");
            this.type = layer.getString("type");
            this.visible = layer.getBoolean("visible");
            this.width = layer.getInt("width");
            this.x = layer.getInt("x");
            this.y = layer.getInt("y");

        }

        @Override
        public String toString() {
            return "tileMap.Layer.Layer{" +
                    "data=" + data.toString() +
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
