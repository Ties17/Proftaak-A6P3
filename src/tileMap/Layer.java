package tileMap;

import javax.json.JsonArray;
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

        public Layer(JsonArray layer) {
           
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
            return "tileMap.Layer.Layer{" +
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
