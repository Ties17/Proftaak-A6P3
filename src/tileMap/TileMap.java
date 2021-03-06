package tileMap;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import java.util.ArrayList;


public class TileMap {

    private JsonIO jsonIO;

    private int height;
    private boolean infinite;
    private ArrayList<Layer> layers;
    private int nextLayerId;
    private int nextObjeectId;
    private String orientation;
    private String renderorder;
    private String tiledVersipn;
    private int tileHeight;
    private ArrayList<TileSet> tileSets;
    private int tileWidth;
    private String type;
    private double version;
    private int width;

    public TileMap(JsonIO jsonIO) {
        this.jsonIO = jsonIO;
        this.height = jsonIO.getIntFromTag("height");
        this.infinite = jsonIO.getBooleanFromTag("infinite");
        JsonArray layers = jsonIO.getJsonArrayFromTag("layers");
        ArrayList<Layer> layerArrayList = new ArrayList<>();
        for (JsonValue jsonValue : layers){
            JsonObject jsonObject = (JsonObject) jsonValue;
            layerArrayList.add(new Layer(jsonObject));
        }
        this.layers = layerArrayList;
        this.nextLayerId = jsonIO.getIntFromTag("nextlayerid");
        this.nextObjeectId = jsonIO.getIntFromTag("nextobjectid");
        this.orientation = jsonIO.getStringFromTag("orientation");
        this.renderorder = jsonIO.getStringFromTag("renderorder");
        this.tiledVersipn = jsonIO.getStringFromTag("tiledversion");
        this.tileHeight = jsonIO.getIntFromTag("tileheight");

        JsonArray tilesetsJsonArray = jsonIO.getJsonArrayFromTag("tilesets");
        ArrayList<TileSet> tileSetArrayList = new ArrayList<>();
        for (JsonValue jsonValue : tilesetsJsonArray){
            JsonObject jsonObject = (JsonObject) jsonValue;
            tileSetArrayList.add(new TileSet(jsonObject));
        }

        this.tileSets = tileSetArrayList;
        this.tileWidth = jsonIO.getIntFromTag("tilewidth");
        this.type = jsonIO.getStringFromTag("map");
        this.version = jsonIO.getDoubleFromTag("version");
        this.width = jsonIO.getIntFromTag("width");

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isInfinite() {
        return infinite;
    }

    public void setInfinite(boolean infinite) {
        this.infinite = infinite;
    }

    public ArrayList<Layer> getLayers() {
        return layers;
    }

    public void setLayers(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public int getNextLayerId() {
        return nextLayerId;
    }

    public void setNextLayerId(int nextLayerId) {
        this.nextLayerId = nextLayerId;
    }

    public int getNextObjeectId() {
        return nextObjeectId;
    }

    public void setNextObjeectId(int nextObjeectId) {
        this.nextObjeectId = nextObjeectId;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getRenderorder() {
        return renderorder;
    }

    public void setRenderorder(String renderorder) {
        this.renderorder = renderorder;
    }

    public String getTiledVersipn() {
        return tiledVersipn;
    }

    public void setTiledVersipn(String tiledVersipn) {
        this.tiledVersipn = tiledVersipn;
    }

    public int getTileHeight() {
        return tileHeight;
    }

    public void setTileHeight(int tileHeight) {
        this.tileHeight = tileHeight;
    }

    public ArrayList<TileSet> getTileSets() {
        return tileSets;
    }

    public void setTileSets(ArrayList<TileSet> tileSets) {
        this.tileSets = tileSets;
    }

    public int getTileWidth() {
        return tileWidth;
    }

    public void setTileWidth(int tileWidth) {
        this.tileWidth = tileWidth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "TileMap{" +
                "jsonIO=" + jsonIO +
                ", height=" + height +
                ", infinite=" + infinite +
                ", layers=" + layers +
                ", nextLayerId=" + nextLayerId +
                ", nextObjeectId=" + nextObjeectId +
                ", orientation='" + orientation + '\'' +
                ", renderorder='" + renderorder + '\'' +
                ", tiledVersipn='" + tiledVersipn + '\'' +
                ", tileHeight=" + tileHeight +
                ", tileSets=" + tileSets +
                ", tileWidth=" + tileWidth +
                ", type='" + type + '\'' +
                ", version=" + version +
                ", width=" + width +
                '}';
    }
}
