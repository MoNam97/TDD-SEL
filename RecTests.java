import org.junit.*;

public class RecTests{
    @Test
    public void testRec() {
        Rectangle r = new Rectangle(2, 5);
        Assert.assertEquals(10, r.computeArea());
    }
    @Test
    public void testRecParameterChange() {
        Rectangle r = new Rectangle(4, 6);
        Assert.assertEquals(4, r.getWidth());
        Assert.assertEquals(6, r.getHeight());
        r.setWidth(8);
        r.setHeight(10);
        Assert.assertEquals(8, r.getWidth());
        Assert.assertEquals(10, r.getHeight());
    }
}