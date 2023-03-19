import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testNewArray {
    NewArray newArray;
    @Before
    public void setup() {
        newArray = new NewArray();
    }

    @Test
    public void testAdd() {
        newArray.add("Jason");
        Assert.assertEquals("Jason", newArray.get(0));
    }

    @Test
    public void testRemove() {
        newArray.add("Jason");
        newArray.removeByString("Jason");
        Assert.assertNull(newArray.get(0));
        newArray.add("Gillian");
        newArray.removeByPosition(0);
        Assert.assertNull(newArray.get(0));
    }

    @Test
    public void testPosition() {
        newArray.add("Jason");
        newArray.add("Gillian");
        newArray.add("Sean");
        newArray.add("Tanis");
        Assert.assertEquals(4, newArray.length());
        newArray.removeByPosition(0);
        Assert.assertEquals(3, newArray.length());
    }

    @Test
    public void testFullArray() {
        newArray.add("Jason");
        newArray.add("Gillian");
        newArray.add("Sean");
        newArray.add("Tanis");
        newArray.add("Jake");
        newArray.add("Recce");
        newArray.add("Spencer");
        newArray.add("Oats");
        newArray.add("Rebeca");
        newArray.add("Chris");
        Assert.assertEquals(10, newArray.length());
        newArray.removeByString("Rebeca");
        Assert.assertEquals(9, newArray.length());
    }

    @Test
    public void testExpand() {
        newArray.add("Jason");
        newArray.add("Gillian");
        newArray.add("Sean");
        newArray.add("Tanis");
        newArray.add("Jake");
        newArray.add("Recce");
        newArray.add("Spencer");
        newArray.add("Oats");
        newArray.add("Rebeca");
        newArray.add("Chris");
        Assert.assertEquals(10, newArray.length());
        newArray.add("John");
        Assert.assertEquals(11, newArray.length());
    }
}
