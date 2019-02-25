package tileMap;

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
        this.infinite = infinite;
        this.layers = layers;
        this.nextLayerId = nextLayerId;
        this.nextObjeectId = nextObjeectId;
        this.orientation = orientation;
        this.renderorder = renderorder;
        this.tiledVersipn = tiledVersipn;
        this.tileHeight = tileHeight;
        this.tileSets = tileSets;
        this.tileWidth = tileWidth;
        this.type = type;
        this.version = version;
        this.width = width;

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





}
