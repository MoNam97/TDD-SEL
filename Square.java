public class Square implements Polygon {
    private int side;
    public Square(int side) {
        this.side = side;
    }
    public int computeArea() {
        return side * side;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int s) {
        side = s;
    }
}
