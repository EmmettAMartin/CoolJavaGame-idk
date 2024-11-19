public class Enemy {
  int enemyX, enemyY;

  public boolean isTouchingPlayer(int playerX, int playerY, int enemyX, int enemyY) {
    if ((enemyX == playerX) && (enemyY == playerY)) {
      return true;
    }
    else { return false; }
  }

  private static int playerDirectionX(int playerX, int enemyX) {
    playerX += 1; // premature prevention of "division by 0" errors.
    enemyX += 1;
    int x_diff = (playerX/enemyX)/Math.abs(playerX/enemyX);
    return x_diff;
  }

  private static int playerDirectionY(int playerY, int enemyY) {
    playerY += 1;
    enemyY += 1;
    int y_diff = (playerY/enemyY)/Math.abs(playerY/enemyY);
    return y_diff;
  }
  
  public int[] enemyDestination(
    int playerX, int playerY, int enemyX, int enemyY
    ) {
    enemyX += playerDirectionX(playerX, enemyX);
    enemyY += playerDirectionY(playerY, enemyY);
    int enemyNewPosition[] = {enemyX, enemyY};
    return enemyNewPosition;
  }
}
