// Truncated.java
package lab.polymorphism;

public class Truncated implements TextBlock {
    public TextBlock input;
    public int width;

    public Truncated(TextBlock input, int width) {
        this.input = input;
        this.width = width;
    }

    public String row(int i) throws Exception {
        String originalRow = input.row(i);
        return originalRow.substring(0, Math.min(originalRow.length(), width));
    }

    public int height() {
        return input.height();
    }

    public int width() {
        return width;
    }
}
