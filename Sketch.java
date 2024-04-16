/**
 * Processing Task 6 - Exploring methods and parameters within those methods
 * @author: P. Yip
 */
import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(112, 161, 160);
  }

  public void draw() {
    // Defining variables for level 3
    int intGrassLocationX;
    int intGrassLocationY;

    // Level 2 & 3 - house and tree respectively
    noStroke();
    drawHouse(50, 50);
    drawHouse(250, 50);
    drawHouse(150, 150);

    drawTree(20, 70, 40, 50, 91, 108, 176);
    drawTree(350, 70, 67, 60, 240, 199, 141);

    drawHouse(250, 250);
    drawHouse(50, 250);

    drawTree(20, 270, 40, 70, 158, 86, 179);
    drawTree(350, 210, 70, 100, 137, 173, 128);

    // Level 4 - Grass
    intGrassLocationX = grassLocationX(0);
    intGrassLocationY = grassLocationY(0);
    drawGrassBlades(intGrassLocationX, intGrassLocationY);

    intGrassLocationX = grassLocationX(45);
    intGrassLocationY = grassLocationY(-150);
    drawGrassBlades(intGrassLocationX, intGrassLocationY);
    
    intGrassLocationX = grassLocationX(-150);
    intGrassLocationY = grassLocationY(50);
    drawGrassBlades(intGrassLocationX, intGrassLocationY);

    intGrassLocationX = grassLocationX(-350);
    intGrassLocationY = grassLocationY(-150);
    drawGrassBlades(intGrassLocationX, intGrassLocationY);

  }

  /**
   * Description: Level Two, changing location of object (house).
   * 
   * @param: intHouseX; X coordinate
   * @param: intHouseY; Y coordinate
   * @return: void
   * @author: P. Yip
   */
    private void drawHouse(int intHouseX, int intHouseY) {
      fill(252, 206, 78);
      square(intHouseX, intHouseY, 100);
      fill(212, 204, 184);
      triangle(intHouseX + 100, intHouseY, intHouseX, intHouseY, intHouseX + 50, intHouseY - 50);
      rect(intHouseX + 40, intHouseY + 50, 40, 50);
      
    }

  /**
   * Description: Level Three, adding additional paramaters to a new object (tree).
   * 
   * @param: treeX; X coordinate
   * @param: treeY; Y coordinate
   * @param: treeSize; trunk size
   * @param: leafSize; size of leaves
   * @param: treeColourR; red colour of leaves
   * @param: treeColourG; green colour of leaves
   * @param: treeColourB; blue colour of leaves
   * @return: void
   * @author: P. Yip
   */
    private void drawTree(float treeX, float treeY, float treeSize, float leafSize, float treeColourR, float treeColourG, float treeColourB) {
      noStroke();
      fill(133, 112, 110);
      rect(treeX, treeY, treeSize, treeSize * 2);
      fill(treeColourR, treeColourG, treeColourB);
      ellipse(treeX, treeY, leafSize * 3 / 2, leafSize);
      ellipse(treeX + 20, treeY, leafSize, leafSize);
      ellipse(treeX + 20, treeY - 25, leafSize, leafSize);
      ellipse(treeX + 40, treeY - 15, leafSize, leafSize);
      ellipse(treeX, treeY - 20, leafSize, leafSize);

      }

  /**
   * Description: Level Four, using return method to obtain desired location of grass
   * 
   * @param: grassX; X coordinate
   * @param: grassY; Y coordinate
   * @return: int
   * @author: P. Yip
   */
    
   private int grassLocationX(int intGrassX) {
      return intGrassX + 50;
    }

    private int grassLocationY(int intGrassY) {
      return intGrassY + 150;
    }

    private void drawGrassBlades(int intGrassX, int intGrassY) {
      fill(103, 148, 86);
     for (int intGrassBlade = 1; intGrassBlade <= 10; intGrassBlade++) {
      triangle(intGrassX, intGrassY, intGrassX + 20, intGrassY, intGrassX + 10, intGrassY - 20);
        translate(10, 0);
      }
     translate(intGrassX, intGrassY);
  
    }
      
  }
  

 
    
      
  
 

  
  
