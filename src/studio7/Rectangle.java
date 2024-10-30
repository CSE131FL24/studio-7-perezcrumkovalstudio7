package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle (int intiwidth, int intilength) {
      
		length = intilength;
		width = intiwidth;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setLength(int L) {
		length = L;
	}
	
	public void setWidth(int W) {
		width = W;
	}
}

