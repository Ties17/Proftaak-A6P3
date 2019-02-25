package tileMap;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.json.JsonObject;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class TileSet {

    private int firstgid;
    private String source;

    private int columns;
    private String image;
    private int imageHeight;
    private int imageWidth;
    private int margin;
    private String name;
    private int spacing;
    private int tileCount;
    private String tiledVersion;
    private int tileHeight;
    private int tileWidth;
    private String type;
    private String version;

    private ArrayList<Tile> tiles;

    public TileSet(JsonObject data){

        firstgid = data.getInt("firstgid");
        source = data.getString("source");


        JsonIO reader = new JsonIO(source);

        this.columns = reader.getIntFromTag("columns");
        this.image = reader.getStringFromTag("image");
        this.imageHeight = reader.getIntFromTag("imageheight");
        this.imageWidth = reader.getIntFromTag("imagewidth");
        this.margin = reader.getIntFromTag("margin");
        this.name = reader.getStringFromTag("name");
        this.spacing = reader.getIntFromTag("spacing");
        this.tileCount = reader.getIntFromTag("tileCount");
        this.tiledVersion = reader.getStringFromTag("tiledversion");
        this.tileHeight = reader.getIntFromTag("tileheight");
        this.tileWidth = reader.getIntFromTag("tilewidth");
        this.type = reader.getStringFromTag("type");
        this.version = reader.getStringFromTag("version");

        try {
            createTiles();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createTiles() throws IOException {

        Image tilesImage =  ImageIO.read(this.getClass().getResource(image));
        int stepSizeX = this.tileWidth;
        int stepSizeY = this.tileHeight;

        for(int i = 0; i < this.columns; i++){
            for(int j = 0; j < imageWidth/(tileWidth + spacing); j++){
                BufferedImage tileImage = ((BufferedImage) tilesImage).getSubimage(stepSizeX*j, stepSizeY*i, stepSizeX*j + stepSizeX,  stepSizeY*i + stepSizeY);
                tiles.add(new Tile(this.firstgid + i, tileImage));
            }
        }
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public int getMargin() {
        return margin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpacing() {
        return spacing;
    }

    public int getTileCount() {
        return tileCount;
    }

    public String getTiledVersion() {
        return tiledVersion;
    }

    public int getTileHeight() {
        return tileHeight;
    }

    public int getTileWidth() {
        return tileWidth;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    void setVersion(String version) {
        this.version = version;
    }
}
