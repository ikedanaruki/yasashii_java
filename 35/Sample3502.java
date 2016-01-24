interface Movable {
  void move();
}

interface Stoppable {
  void stop();
}

class Car implements Movable, Stoppable {
  public void move() {
    System.out.println("動いています");
  }

  public void stop() {
    System.out.println("止まっています");
  }
}

class Sample3502 {
  public static void main(String[] args) {
    Car o = new Car();
    o.move();
    o.stop();
  }
}
