package csdsp.arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int a[] = {1, 2, 0, 4, 3, 0, 5, 0};
		movezerosend(a);
		
		}
	
	static void movezerosend(int[] a) {
		int len = a.length;
		int count = 0;
		
		for(int i=0; i<len; i++) {
			if(a[i]>0 ) 
				a[count++] = a[i];
		}
		
		while(count < len) {
			a[count++] = 0;
		}
		
		for(int i=0; i<len; i++)
			System.out.print(a[i]+" ");
		
	}

}
