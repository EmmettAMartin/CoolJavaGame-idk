import javax.swing.JFrame;
import java.awt.EventQueue;

public class WindowRenderer extends JFrame {
  public WindowRenderer() {
    initUI();
  }

  void initUI() {
    add(new GameBoard());
    setSize(1000, 750);
    setTitle("Testing Game");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      WindowRenderer window = new WindowRenderer();
      window.setVisible(true);
    }
    );
  }
}