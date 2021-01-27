package socket2;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] array= {1,5,8,7,9,6,3,4,2};
		System.out.println(Arrays.toString(array));
		//½«Êý×Ö6É¾µô
		int d=6;
		int index=0;
		int t;
		for(int i=0;i<array.length;i++) {
			if(d==array[i]&&i<array.length-1) {
				t=array[i];
				array[i]=array[i+1];
				array[i+1]=t;				
			}
		}
		array=Arrays.copyOf(array, array.length-1);
		
		System.out.println(Arrays.toString(array));

	}

}
