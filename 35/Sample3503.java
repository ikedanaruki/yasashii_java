interface Movable {
  void move();
}

interface Walkable extends Movable {
  void walk();
}

class Runner implements Walkable {
  public void move() {
    System.out.println("動いています");
  }

  public void walk() {
    System.out.println("歩いています");
  }
}

class Sample3503 { 
  public static void main(String[] args) {
    Runner o = new Runner();
    o.move();
    o.walk();
  }
}

