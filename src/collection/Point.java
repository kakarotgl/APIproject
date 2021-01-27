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
	 * ʵ����Comparable�ӿں����ʵ������ķ���,compareTo������������
	 * �Ƚϵ��ڶ���(this)���������(o)�Ĵ�С��ϵ;
	 * ����ֵΪintֵ,��ֵ����ע����ȡֵ,ֻ��עȡֵ��Χ:
	 * ������ֵ>0:��ǰ������ڲ�������(this>o)
	 * ������ֵ<0:��ǰ����С�ڲ�������(this<o)
	 * ������ֵ=0:�����������(this=o);
	 */
	public int compareTo(Point o) {
		//�жϹ���:�㵽ԭ��ľ��볤�Ĵ�
		
		int len=this.x*this.x+this.y*this.y;
		int olen=o.x*o.x+o.y*o.y;
		return len-olen;
	}


}
