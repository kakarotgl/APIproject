package refDemo;

public class Airplane {
        int x;
		int y;
		int width;
		int height;
	public Airplane(int x, int y, int width, int height) {
			super();
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
	@Override
	public String toString() {
		return "Airplane [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
}
