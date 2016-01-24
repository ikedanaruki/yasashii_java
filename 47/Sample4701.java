import javax.swing.*;
import java.awt.event.*;

public class Sample4701 extends JFrame
    implements WindowListener {

  public Sample4701() {
    super("This is a test");
    setBounds(200,200,200,200);
    setVisible(true);
    addWindowListener(this);
  }

  public static void main(String[] args) {
    Sample4701 o = new Sample4701();
  }

  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }

  public void windowOpened(WindowEvent e) {}
  public void windowClosed(WindowEvent e) {}
  public void windowActivated(WindowEvent e) {}
  public void windowDeactivated(WindowEvent e) {}
  public void windowIconified(WindowEvent e) {}
  public void windowDeiconified(WindowEvent e) {}

}
