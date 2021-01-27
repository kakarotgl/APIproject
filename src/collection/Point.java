package collection;

public class Point implements Comparable<Point>{
	private int x;
	private int y;
	
	public Point() {
		
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	/*
	 * 实现了Comparable接口后必须实现下面的方法,compareTo方法的作用是
	 * 比较档期对象(this)与参数对象(o)的大小关系;
	 * 返回值为int值,该值不关注具体取值,只关注取值范围:
	 * 当返回值>0:当前对象大于参数对象(this>o)
	 * 当返回值<0:当前对象小于参数对象(this<o)
	 * 当返回值=0:连个对象相等(this=o);
	 */
	public int compareTo(Point o) {
		//判断规则:点到原点的距离长的大
		
		int len=this.x*this.x+this.y*this.y;
		int olen=o.x*o.x+o.y*o.y;
		return len-olen;
	}


}
