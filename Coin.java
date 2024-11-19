import java.util.Random;

public class Coin {
  public int coinX, coinY;

  static Random rand = new Random();

  public int[] randomCoinCoordinate() {
    int x = rand.nextInt(10);
    int y = rand.nextInt(10);
    int[] position = {x,y};
    return position;
  }

  public boolean isTouchingPlayer(int playerX, int playerY, int coinX, int coinY) {
    if ((coinX == playerX) && (coinY == playerY)) {
      return true;
    }
    else { return false; }
  }
}
