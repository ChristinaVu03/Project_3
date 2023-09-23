// Centered.java
package lab.polymorphism;

public class Centered implements TextBlock {
    public TextBlock input;
    public int width;

    public Centered(TextBlock input, int width) {
        this.input = input;
        this.width = width;
    }

    public String row(int i) throws Exception {
        String originalRow = input.row(i);
        int padding = (width - originalRow.length()) / 2;
        String paddedRow = TBUtils.spaces(padding) + originalRow;
        return paddedRow.substring(0, width);
    }

    public int height() {
        return input.height();
    }

    public int width() {
        return width;
    }
}
