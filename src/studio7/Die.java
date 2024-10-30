package studio7;

public class Die {

	private int n;
	
	public Die (int initn) { //constructor method
		n = initn;
	}
	
	public String toString() {
		String result = "Number of sides: " + n;
		return result;
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int value) {
		n = value;
	}
	
	public int rollDie() {
		int value = (int)(Math.random()*n + 1);
		return value;
	}
}
