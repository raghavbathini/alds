package corejava.practice;

public class A {
    private int a;
    protected int b;
    public int c;

    protected A() {  
    	System.out.println("worked");
        a = 10;
        b = 20;
        c = 30;
    }
    
    public static void main(String args[]) {
    	B b = new B();
    }
}

class B extends A{
	B(){
		super();
	}
}
