public class Rectangle implements Polygon {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width; 
        this.height = height;
    }

    public int computeArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }
}