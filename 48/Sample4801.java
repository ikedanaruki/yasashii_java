import javax.swing.*;
import java.awt.event.*;

class Sample4801 extends JFrame {

  public Sample4801() {
    super("This is a test");
    setBounds(200,200,200,200);
    setVisible(true);
    addWindowListener(new MyWindowAdapter());
  }

  public static void main(String[] args) {
    Sample4801 o = new Sample4801();
  }
}

class MyWindowAdapter extends WindowAdapter {
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }
}
