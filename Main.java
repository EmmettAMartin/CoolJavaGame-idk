/*
 * 
 * The structure of the program:
 * Everything is a class (waow it's Java crazy :O)
 * Coin- class with public int coinX, coinY -> public functions randomCoinCoordinate(), isTouchingCoin()
 * Enemy- another class. Every time we collect a coin, we spawn an enemy. When the enemy is touching a player, we kill the player.
 *    Public variables enemyX, enemyY, isTouchingPlayer()
 * Player- another class (NO REALLY). Public variables playerX, playerY, score, name. Public functions movePlayer()
 *    private/static functions are checkPlayerX(), checkPlayerY()
 * 
 */

public class Main {
  static int map[][] = {{},{},{},{},{},{},{},{},{},{}};
  static int sizeOfMap = 10;
  static int[][] assembleMap(int givenMap[][]) {
    for (int i = 0; i < sizeOfMap; i++) {
      for (int j = 0; j < sizeOfMap; j++) {
        givenMap[i][j] = 0;
      }
    }
    return givenMap;
  }
  public static void main(String[] args) {
    map = assembleMap(map);
  }
}
