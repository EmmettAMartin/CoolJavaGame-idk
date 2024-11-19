public class Enemy {
  int enemyX, enemyY;

  public int player_direction_x(int playerX, int enemyX) {
    int x_diff = (playerX/enemyX)/Math.abs(playerX/enemyX);
    return x_diff;
  }
  
}
