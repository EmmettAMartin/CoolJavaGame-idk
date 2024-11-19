public class Player {
  int playerX, playerY;
  int score = 0;
  String name;

  private static int checkPlayerX(int playerX) {
    if (playerX > 9) {
      return 0;
    }
    else if (playerX < 0) {
      return 9;
    }
    else { return playerX; }
  }

  private static int checkPlayerY(int playerY) {
    if (playerY > 9) {
      return 0;
    }
    else if (playerY < 0) {
      return 9;
    }
    else { return playerY; }
  }

  public int[] movePlayer(int playerX, int playerY, char key) {
    switch (key) {
      case 'w':
        playerY--;
        break;

      case 's':
        playerY++;
        break;
      
      case 'a':
        playerX--;
        break;

      case 'd':
        playerX++;
        break;

      default:
        break;
    }
    playerX = checkPlayerX(playerX);
    playerY = checkPlayerY(playerY);
    int newPlayerPosition[] = {playerX, playerY};
    return newPlayerPosition;
  }
}
