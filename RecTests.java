import org.junit.*;

public class RecTests{
    @Test
    public void testRec() {
        Rectangle r = new Rectangle(2, 5);
        Assert.assertEquals(10, r.computeArea());
    }
}