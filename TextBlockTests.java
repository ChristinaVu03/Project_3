package lab.polymorphism;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TextBlockTests {

    @Test
    public void testTruncated() {
        TextBlock original = new TextLine("This is a long line.");
        try {
            TextBlock truncated = new Truncated(original, 9);
            assertEquals("This is a", truncated.row(0)); // Remove the double brackets around "This is a"
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testCentered() {
        TextBlock original = new TextLine(" Hello ");
        try {
            TextBlock centered = new Centered(original, 10);
            assertEquals("Hello", centered.row(0));
        } catch (Exception e) { 
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testRightJustified() {
        TextBlock original = new TextLine("Goodbye");
        try {
            TextBlock rightJustified = new RightJustified(original, 10);
            assertEquals("   Goodbye", rightJustified.row(0));
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    // Add more tests for HorizontallyFlipped, VerticallyFlipped, and DiagonalBlock

    @Test
    public void testEquality() {
        TextBlock block1 = new TextLine("Hello");
        TextBlock block3 = new TextLine("Hi");
        assertFalse(TBUtils.equal(block1, block3));
        assertFalse(TBUtils.eqv(block1, block3));
        assertFalse(TBUtils.eq(block1, block3));
    }
}
