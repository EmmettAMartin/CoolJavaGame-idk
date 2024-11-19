import java.util.Random;

public class Coin {
  public int coinX, coinY;
  static Random rand = new Random();
  static int randomNum() {
    return rand.nextInt(10);
  }
  // public regenerateCoinPositions() {

  // }
}
