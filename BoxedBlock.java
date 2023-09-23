package lab.polymorphism;

/**
 * A text block surrounded by a box.
 *
 * @author Samuel A. Rebelsky
 * @version 1.2 of February 2019
 */
public class BoxedBlock implements TextBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The stuff in the box
   */
  TextBlock input;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new line with input _input.
   */
  public BoxedBlock(TextBlock _input) {
    this.input = _input;
  } // BoxedBlock(String)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   *
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    int h = this.input.height();
    // The top and bottom of the box
    if ((i == 0) || (i == h + 1)) {
      return "+" + TBUtils.dashes(this.input.width()) + "+";
    }
    // Stuff within the box
    else if ((i > 0) && (i <= h)) {
      return "|" + this.input.row(i - 1) + "|";
    }
    // Everything else
    else {
      throw new Exception("Invalid row " + i);
    }
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    return 2 + this.input.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return 2 + this.input.width();
  } // width()

} // class BoxedBlock
