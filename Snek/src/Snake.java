import processing.core.PApplet;

public class Snake extends PApplet{
	private int length;
	//dir 0:up, 1:right, 2:down, 3:left
	private int direction;
	private int speed;
	public Snake() {
		length = 6;
		direction = 0;
		speed = 4;
	}
	public void eat(){
		length+=4;
		speed++;
	}
	public int getLength(){
		return length;
	}
}
