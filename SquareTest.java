import org.junit.*;

public class SquareTest {
    @Test
    public void testSquare() {
        Square s = new Square(5);
        Assert.assertEquals(25, s.computeArea());
    }    
    @Test
    public void testSquareParameterChange() {
        Square s = new Square(4);
        Assert.assertEquals(4, s.getSide());
        s.setSide(12);
        Assert.assertEquals(12, s.getSide());
    }
}
