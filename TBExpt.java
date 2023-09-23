package lab.polymorphism;

import java.io.PrintWriter;
//import org.w3c.dom.Text;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2019
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    TextBlock block = new TextLine("This is a test.");

    // Print out the block
    /*TBUtils.print(pen, block);

    TextBlock tb = new BoxedBlock(new BoxedBlock(new BoxedBlock(new TextLine(" "))));
    TBUtils.print(pen, tb);*/

    // Clean up after ourselves.
    TextBlock b2 = new TextLine("Hello");
    TextBlock b1 = new TextLine("Goodbye");
    TextBlock b3 = new BoxedBlock(new VComposition(b2, b1));
    TBUtils.print(pen,b3);

    TextBlock b4 = new BoxedBlock(new TextLine("Hello"));
    TextBlock b5 = new BoxedBlock(new TextLine("Goodbye"));
    TextBlock b6 = new VComposition(b4, b5);
    TBUtils.print(pen,b6);
    TextBlock b7 = new HComposition(b4, b1);
    TBUtils.print(pen,b7);

    TextBlock b8= new HComposition(b1, b4);
    TBUtils.print(pen,b8);

    //TBUtils.print(pen, tb);
    pen.close();
  } // main(String[])
    
} // class TBExpt

