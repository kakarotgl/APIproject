package refDemo;

public class EqualsDemo {
	/*
	 * 测试Object提供的默认equals不能比较两个对象是否相等,
	 * 所以应该在子类中重写这个方法
	 */
    public static void main(String[] args) {
	   Point p1=new Point(5,6);
	   Point p2=new Point(7,9);
	   Point p3=new Point(7,9);
	   boolean b=p2.equals(p3);
	   System.out.println(b);
	   
	   Point1 px=new Point1(7,9);
	   Point1 py=new Point1(7,9);
	   b=px.equals(py);
	   System.out.println(b);
	   
    }

}

class Point{
	int x;
	int y;
	public Point(int x,int y) {
		super();
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

class Point1{
	int x;
	int y;
	public Point1(int x,int y) {
		super();
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point1 other = (Point1) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
