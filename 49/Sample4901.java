import javax.swing.*;
import java.awt.event.*;

public class Sample4901 extends JFrame
    implements ActionListener {
  public Sample4901() {
    super("This is a test");
    setBounds(200,200,200,200);
    JPanel pnl = new JPanel();
    JButton btn = new JButton("このボタンを押して！");
    pnl.add(btn);
    getContentPane().add(pnl,"Center");
    addWindowListener(new MyWindowAdapter());
    btn.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("ボタン押されましたっ");
  }

  public static void main(String[] args) {
    Sample4901 o = new Sample4901();
  }

  private void outputMessage() {
    System.out.println("これで終わります");
  }

  class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
      outputMessage();
      System.exit(0);
    }
  }
}
