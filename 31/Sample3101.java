class Vehicle {

  private double speed;

  protected void changeSpeed(double s) {
    speed = s;
  }

  protected double getSpeed() {
    return speed;
  }
}

class Plane extends Vehicle {

  private double altitude;

  protected void takeOff() {
    if(getSpeed() >= 300.0) {
      System.out.println("離陸します");
    }
    else {
      System.out.println("離陸できる速度に達していません");
    }
  }

  protected void land() {
    altitude = 0.0;
  }
}

class Sample3101 {
  public static void main(String[] args) {
    Plane o = new Plane();
    o.changeSpeed(0.0);
    for(int i = 0; i <= 300; i+=50) {
      o.takeOff();
    }
    System.out.println("離陸しました");
  }
}
