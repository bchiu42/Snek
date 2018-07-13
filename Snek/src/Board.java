import processing.core.PApplet;

public class Board extends PApplet {
	private Node[][] board;
	private Snake Snek;
	private final static int height = 10;
	private final static int width = 10;

	public Board() {
		board = new Node[height][width];
		for (int k = 0; k < width; k++) {
			for (int z = 0; z < height; z++) {
				board[k][z].isEmpty();
			}
		}
		int fPosX;
		int sPosX;
		int fPosY;
		int sPosY = 7;
		do {
			fPosX = (int) (Math.random() * width);
			fPosY = (int) (Math.random() * height);
			sPosX = (int) (Math.random() * width);
			//sPosY = (int) (Math.random() * height);
		} 
		while (fPosX == sPosX || fPosY == sPosY);
		board[sPosX][sPosY].isSnake(Snek.getLength());
		board[fPosX][fPosY].isFood();
	}
}
