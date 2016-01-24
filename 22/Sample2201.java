class Plane {
  public double length;
  public double weight;
  public double cruising_range;
  public int speed;
  public int fuel;
}

class Sample2201 {
  public static void main(String[] args) {
    Plane p = new Plane();
    p.length = 73.9;
    p.speed = 890;
    System.out.println("全長" + p.length + "m");
    System.out.println("速度" + p.speed + "km/h");
    System.out.println("航続距離" + p.cruising_range + "km");
  }
}
