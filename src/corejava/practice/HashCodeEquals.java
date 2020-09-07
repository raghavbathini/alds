package corejava.practice;

import java.util.HashMap;

public class HashCodeEquals {

	public static void main(String[] args) {
		student s1 = new student(123);
		student s2 = new student(123);
		
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		
	
		HashMap<student, String> hm = new HashMap<student, String>();
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		hm.put(s1,"s1");
		hm.put(s2,"s2");
		
		hm2.put(i1, "s1");
		hm2.put(i2, "s2");
		
		System.out.println(hm.size());
		System.out.println(hm2.size());
	}

}


class student{
	private int rno;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	student(int rno){
		this.rno = rno;
	}
	

}