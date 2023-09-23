// RightJustified.java
package lab.polymorphism;

public class RightJustified implements TextBlock {
    public TextBlock input;
    public int width;

    public RightJustified(TextBlock input, int width) {
        this.input = input;
        this.width = width;
    }

    public String row(int i) throws Exception {
        String originalRow = input.row(i);
        int padding = width - originalRow.length();
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