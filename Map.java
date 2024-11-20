public class Map {
  static int sizeOfMap = 10;
  public int[][] map = new int[sizeOfMap][sizeOfMap];
  
  public int[][] assembleMap(int givenMap[][]) {
    for (int i = 0; i < sizeOfMap; i++) {
      for (int j = 0; j < sizeOfMap; j++) {
        givenMap[i][j] = 0;
      }
    }
    return givenMap;
  }

  public char determineCharacter(int givenChar) {
    if (givenChar == 1) {
      return '0';
    }
    else if (givenChar == 2) {
      return '?';
    }
    else if (givenChar == 3) {
      return '1';
    }
    else { return 'x'; }
  }

  public void printMap(int[][] givenMap) {
    for (int i = 0; i < sizeOfMap; i++) {
      for (int j = 0; j < sizeOfMap; j++) {
        if (givenMap[i][j] != 0) {
          System.out.print(" "+determineCharacter(givenMap[i][j])+" ");
        }
        else { System.out.print("   ");}
      }
      System.out.print("\n");
    }
  }

  public int[][] setPositionOnMap(int[][] givenMap, int givenX, int givenY, int value) {
    givenMap[givenY][givenX] = value;
    return givenMap;
  }

}
