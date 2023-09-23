// HorizontallyFlipped.java
package lab.polymorphism;

public class HorizontallyFlipped implements TextBlock {
    private TextBlock input;

    public HorizontallyFlipped(TextBlock input) {
        this.input = input;
    }

    public String row(int i) throws Exception {
        String originalRow = input.row(i);
        return new StringBuilder(originalRow).reverse().toString();
    }

    public int height() {
        return input.height();
    }

    public int width() {
        return input.width();
    }
}