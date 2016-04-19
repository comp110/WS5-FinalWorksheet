package comp110;

public class Point {

  private int _x;
  private int _y;

  public Point(int x, int y) {
    _x = x;
    _y = y;
  }

  public void move(int dx, int dy) {
    _x = _x + dx;
    _y = _y + dy;
  }

  public void flip() {
    _x = _y;
    _y = _x;
  }

  private void setY() {
    _x = x;
  }

  public int getY() {
    return _y;
  }

  public String toString() {
    return "(" + _x + ", " + _y + ")";
  }

}