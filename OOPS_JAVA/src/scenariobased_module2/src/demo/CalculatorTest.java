package demo;

public class CalculatorTest {

    @TestCase
    public void testAdd() {
        int a = 2 + 3;
        if (a != 5) throw new AssertionError("2+3 should be 5");
    }

    @TestCase
    public void testMul() {
        int m = 4 * 6;
        if (m != 24) throw new AssertionError("4*6 should be 24");
    }

    public void helperNotATest() {
        // not annotated
    }
}
