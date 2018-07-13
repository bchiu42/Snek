
public class Node {
// 3 types of nodes, empty, food, or snake
	private boolean food;
	private int  snakeStack;
	private boolean empty;
	public Node(){
		food = false;
		snakeStack =0;
		empty = true;
	}
	//runs if there is food on the node
	public void isFood(){
		food = true;
		snakeStack = 0;
		empty = false;
	}
	//runs if there is nothing on the node
	public void isEmpty(){
		food = false;
		snakeStack = 0;
		empty = true;
	}
	//runs if there is a snake on Node
	public void isSnake(int num){
		food = false;
		snakeStack = num;
		empty = false;
	}
	
	
	
}
