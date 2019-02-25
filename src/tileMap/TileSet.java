package tileMap;

public class TileSet {

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

    public TileSet(String filename){
        JsonIO reader = new JsonIO(filename);

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
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
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

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
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

    public void setSpacing(int spacing) {
        this.spacing = spacing;
    }

    public int getTileCount() {
        return tileCount;
    }

    public void setTileCount(int tileCount) {
        this.tileCount = tileCount;
    }

    public String getTiledVersion() {
        return tiledVersion;
    }

    public void setTiledVersion(String tiledVersion) {
        this.tiledVersion = tiledVersion;
    }

    public int getTileHeight() {
        return tileHeight;
    }

    public void setTileHeight(int tileHeight) {
        this.tileHeight = tileHeight;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
