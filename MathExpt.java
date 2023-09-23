package lab.polymorphism;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * A few simple experiments with our utilities.
 * Version 1.1 of February 2019.
 */
public class MathExpt {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    /* 
    // Print some square roots.
    for (int i = 2; i < 10; i++) {
      double root = MathUtils.squareRoot(i);
      pen.println("The square root of " + i + " seems to be " + root);
      pen.println(root + "^2 = " + (root * root));
    } // for i
    */

    int i = 17;
    double rootInt = MathUtils.squareRoot(i);
    pen.println("The square root of " + i + " seems to be " + rootInt);
    pen.println(rootInt + "^2 = " + (rootInt * rootInt));

    float j = 17.15f;
    double rootFloat = MathUtils.squareRoot(j);
    pen.println("The square root of " + j + " seems to be " + rootFloat);
    pen.println(rootFloat + "^2 = " + (rootFloat * rootFloat));

    Double k = 17.15;
    Double rootDouble = MathUtils.squareRoot(k);
    pen.println("The square root of " + k + " seems to be " + rootDouble);
    pen.println(rootDouble + "^2 = " + (rootDouble * rootDouble));

    BigInteger l = BigInteger.valueOf(17);
    double rootBigInt = MathUtils.squareRoot(l);
    pen.println("The square root of " + l + " seems to be " + rootBigInt);
    pen.println(rootBigInt + "^2 = " + (rootBigInt * rootBigInt));

    BigDecimal m = BigDecimal.valueOf(17.15);
    double rootBigDec = MathUtils.squareRoot(m);
    pen.println("The square root of " + m + " seems to be " + rootBigDec);
    pen.println(rootBigDec + "^2 = " + (rootBigDec * rootBigDec));

    double n = 17.15;
    double rootdouble = MathUtils.squareRoot(n);
    pen.println("The square root of " + n + " seems to be " + rootdouble);
    pen.println(rootdouble + "^2 = " + (rootdouble * rootdouble));

    // We're done. Clean up.
    pen.close();
  } // main(String[])
} // class MathExpt
