package comp110;

/*
 * The following problems are review over code seen in the second exam.
 * 
 * Your changes will primarily be in the Point and Path classes. There are
 * only a few problems that you'll need to modify code in this file for. They are:
 * 4, 8, 12, 16, 31
 * 
 * Each problem number corresponds to question numbers on the exam.
 */

public class FinalWorksheet {

  /*
   * Fix the setY() method in the Point class so that it is public, has no
   * errors, and the following code returns the string "(2, 2)".
   */
  public String p03SetY() {
    Point p1 = new Point(2, 3);
    p1.setY(2);
    return p1.toString();
  }

  /*
   * Without changing the Point class, add any arguments to the constructor
   * below so that the error goes away.
   */
  public Point p04Constructor() {
    return new Point(); // <-- add arguments to make this valid
  }

  /*
   * Change the arguments passed to the second call of move below such that the
   * returned coordinates of p1 are (6, 22).
   */
  public String p08Move() {
    Point p1 = new Point(2, 3);
    p1.move(0, -1);
    p1.move(0, 0); // <-- Change these arguments
    return p1.toString();
  }

  /*
   * Fix the flip() method in the Point class so that it actually flips its x
   * and y values.
   */
  public String p09Flip() {
    Point p1 = new Point(2, 3);
    p1.flip();
    p1.flip();
    return p1.toString();
  }

  /*
   * There is an error in the Path class related to the _points instance
   * variable. Fix that error so that the code below runs.
   * 
   * Hint - The options for this error on the exam were:
   * 
   * A. The constructor needs to declare: ArrayList<Point> _points
   * 
   * B. Change the _points variable name to not begin with an underscore
   * 
   * C. The _points instance variable should be made public.
   * 
   * D. The ArrayList class needs to be imported.
   */
  public String p11PathError() {
    Path p = new Path();
    return p.toString();
  }

  /*
   * Fix the syntax error in the incorrect method call below.
   */
  public String p12MoveArguments() {
    Path p = new Path();
    p.move(2, 3);
    p.move(-2, -3);
    p.move(int 2, int 3);
    p.move(1 + 1, 1 + 1 + 1);
    return p.toString();
  }

  /*
   * Add new Point instances to Path p and move the Path such that the String
   * returned by this method is: "[(3,3)(2,2)(0,0)]"
   */
  public String p16Output() {
    Path p = new Path();
    // TODO
    return p.toString();
  }

  /*
   * Rename the following methods in Path from => to:
   * 
   * mystery => swap
   * 
   * intrigue => maxYIndex
   * 
   * suspense => sortDescending
   * 
   * You will also need to fix the sortDescending method to call the renamed
   * methods instead.
   */
  public Path p24RenameMethods() {
    // Nothing to do here.
    return this.examplePath();
  }

  /*
   * Swap should switch the elements of indices i and j. Currently one of the
   * values is getting overwritten. Fix Path's swap method so that it swaps the
   * elements at indices i and j. (Note: Complete p24 above, first!)
   * 
   * You should not need to change anything in the code below. Just fix swap!
   */
  public String p17FixSwap() {
    Path p = this.examplePath();
    p.swap(0, 1);
    return p.toString();
  }

  /*
   * Change the following conditional so that there are no nested if statements.
   * 
   * Also change it so that all cases can be reached.
   * 
   * Specifically, when dollars is 0, the C string should be returned. For all
   * other dollar values the logic should remain the same.
   */
  public String p31ifIHad(int dollars, boolean youWantMonkey) {
    if (dollars <= 10) {
      return "A. I don't need no money, as long as I keep dancing -Sia";
    } else {
      if (dollars == 1000000 && youWantMonkey) {
        return "B) Well, I'd buy you a monkey. -Barenaked Ladies";
      } else if (dollars == 0) {
        return "C) No money, no problems. -Notorius BIG (by deduction)";
      } else if (dollars == 1000000) {
        return "D) I'd buy you an exotic pet, like a llama or an emu. -Barenaked";
      } else {
        return "E) I got money in the bank, money in the bank rn -T-Pain";
      }
    }

  }

  /* You can ignore the following code and do not need to change it. */

  private Path examplePath() {
    Path p = new Path();
    p.add(new Point(6, 1));
    p.add(new Point(0, 7));
    p.add(new Point(4, 3));
    p.add(new Point(2, 5));
    return p;
  }

}