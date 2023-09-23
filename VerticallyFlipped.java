// VerticallyFlipped.java
package lab.polymorphism;

public class VerticallyFlipped implements TextBlock {
    private TextBlock contents;

    public VerticallyFlipped(TextBlock contents) {
        this.contents = contents;
    }

    public String row(int i) throws Exception {
        return contents.row(contents.height() - i - 1);
    }

    public int height() {
        return contents.height();
    }

    public int width() {
        return contents.width();
    }
}