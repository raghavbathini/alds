package csdsp.arrays;

public class LeadersInArray {

	public static void main(String[] args) {
		int a[] = {7,10,4,10,6,5,2};
		findLeaders(a);
	}
	
	public static void findLeaders(int[] a) {
		int l = a.length;
		boolean isLeader = true;
		for(int i=0; i<l; i++) {
			isLeader = true;
			for(int j=i+1; j<l; j++)
			{
				if(a[j] >= a[i]) {
					isLeader=false;
					break;
				}
			}
			if(isLeader)
				System.out.println(a[i] +" is leader");
		}
	}

}
