// DiagonalBlock.java
package lab.polymorphism;

public class DiagonalBlock implements TextBlock {
    public int size;
    public char diagonalChar;

    public DiagonalBlock(int size, char diagonalChar) {
        this.size = size;
        this.diagonalChar = diagonalChar;
    }

    public String row(int i) throws Exception {
        StringBuilder rowBuilder = new StringBuilder();
        for (int j = 0; j < size; j++) {
            if (j == i) {
                rowBuilder.append(diagonalChar);
            } else {
                rowBuilder.append(' ');
            }
        }
        return rowBuilder.toString();
    }

    public int height() {
        return size;
    }

    public int width() {
        return size;
    }
}
