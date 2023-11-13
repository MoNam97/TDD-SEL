import org.junit.*;

public class SquareTest {
    @Test
    public void testSquare() {
        Square s = new Square(5);
        Assert.assertEquals(25, s.computeArea());
    }    
}
