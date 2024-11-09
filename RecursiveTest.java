import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveTest {

    @Test
    public void testCount8() {
        assertEquals(1, Recursive.count8(8));
        assertEquals(2, Recursive.count8(818));
        assertEquals(4, Recursive.count8(8818));
        assertEquals(6, Recursive.count8(88188));
        assertEquals(0, Recursive.count8(343));
    }

    @Test
    public void testCountHi() {
        assertEquals(1, Recursive.countHi("xxhixx"));
        assertEquals(2, Recursive.countHi("xhixhix"));
        assertEquals(1, Recursive.countHi("hi"));
        assertEquals(0, Recursive.countHi("xsdf"));
        assertEquals(1, Recursive.countHi("fdsaihhix"));
    }

    @Test
    public void testCountHi2() {
        assertEquals(1, Recursive.countHi2("ahixhi"));
        assertEquals(2, Recursive.countHi2("ahibhi"));
        assertEquals(0, Recursive.countHi2("xhixhi"));
        assertEquals(1, Recursive.countHi2("hixx"));
        assertEquals(1, Recursive.countHi2("xhixxfhi"));
    }

    @Test
    public void testStrCount() {
        assertEquals(2, Recursive.strCount("catcowcat", "cat"));
        assertEquals(1, Recursive.strCount("catcowcat", "cow"));
        assertEquals(0, Recursive.strCount("catcowcat", "dog"));
        assertEquals(2, Recursive.strCount("catcowcatdogdog", "dog"));
        assertEquals(1, Recursive.strCount("catdogcowcat", "dog"));
    }

    @Test
    public void testStringClean() {
        assertEquals("yza", Recursive.stringClean("yyzzza"));
        assertEquals("abc", Recursive.stringClean("aabbcc"));
        assertEquals("x", Recursive.stringClean("xxxxxx"));
        assertEquals("fsafdsfdfd", Recursive.stringClean("fsafdsfdfddd"));
        assertEquals("fdfdasd", Recursive.stringClean("fddfdaasd"));
    }
}
