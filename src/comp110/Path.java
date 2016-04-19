package comp110;

public class Path {

  private ArrayList<Point> _points;

  public Path() {
    _points = new ArrayList<Point>();
  }

  public void add(Point point) {
    _points.add(point);
  }

  public void move(int dx, int dy) {
    for (int i = 0; i < _points.size(); i++) {
      _points.get(i).move(dx, dy);
    }
  }

  public String toString() {
    String result = "[";
    for (int i = 0; i < _points.size(); i++) {
      result += _points.get(i).toString();
    }
    return result + "]";
  }

  public void mystery(int i, int j) {
    Point point = _points.get(i);
    _points.set(j, point);
    _points.set(i, _points.get(j));
  }

  public int intrigue(int start) {
    int y = _points.get(start).getY();
    int yIndex = start;

    for (int i = start; i < _points.size(); i++) {
      if (_points.get(i).getY() > y) {
        y = _points.get(i).getY();
        yIndex = i;
      }
    }
    return yIndex;
  }

  public void suspense() {
    for (int i = 0; i < _points.size(); i++) {
      this.mystery(i, this.intrigue(i));
    }
  }

}