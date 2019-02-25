package tileMap;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.awt.*;
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

        public void draw(Graphics2D g2d){
            for(int i = 0; i < data.size(); i++){
                data.getInt(i);
            }
        }

    public JsonArray getData() {
        return data;
    }

    public void setData(JsonArray data) {
        this.data = data;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOpacity() {
        return opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
