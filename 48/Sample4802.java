import javax.swing.*;
import java.awt.event.*;

class Sample4802 extends JFrame
    implements ActionListener {
  public Sample4802() {
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
    Sample4802 o = new Sample4802();
  }
}

class MyWindowAdapter extends WindowAdapter {
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }
}
