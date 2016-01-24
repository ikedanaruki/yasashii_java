import javax.swing.*;
import java.awt.event.*;

public class Sample4902 extends JFrame
    implements ActionListener {
  public Sample4902() {
    super("This is a test");
    setBounds(200,200,200,200);
    JPanel pnl = new JPanel();
    JButton btn = new JButton("このボタンを押して！");
    pnl.add(btn);
    getContentPane().add(pnl,"Center");
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        outputMessage();
        System.exit(0);
      }
    });
    btn.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    System.out.println("ボタン押されましたっ");
  }

  public static void main(String[] args) {
    Sample4902 o = new Sample4902();
  }

  private void outputMessage() {
    System.out.println("これで終わります");
  }
}
