package map;
/**
 * HashMap散列表是当今查询速度最快的数据结构.其内部由数组实现,
 * 但是HashMap是根据key通过算列算法计算出其在数组的位置,
 * 这就避免了对数组的遍历.从而查询速度不受数据多少而变化
 * 由于Key在HashMap中决定位置,所以其hashCode方法与
 * equals方法要妥善处理.Object中定义的这两个方法符合hashMap
 * 使用规则.否则可能会在hashMap中产生链表而影响查询速度
 * 当key的hashCode值相同,但是equals比较不为true时
 * 就会在HashMap中产生链表
 * @author uid
 *API手册中Object类对这两个方法的重写有明确的说明:
 *1: 成对重写
 *   当我们需要重写一个类的equals方法就应当连同重写hashCode方法
 *2:一致性
 *  当两个对象equals比较为true时,那么hashCode方法返回的数字必须相同
 *  反之亦然,虽然不是必须的,但是应当尽量保证两个对象hashCode相同时equals也为true,
 *  否则会在HashMap中产生链表,影响查询性能
 *3:稳定性
 *  当一个对象参与equals比较的属性值没有发生改变的前提下多次调用hashCode方法
 *  返回的数字应当不变.
 */

public class Key {
	private int x;
	private int y;
	
	
	
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
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}



	public static void main(String[] args) {
		
	}
	
	

}
