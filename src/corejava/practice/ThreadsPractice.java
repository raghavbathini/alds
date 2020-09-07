package corejava.practice;

public class ThreadsPractice {

	public static void main(String[] args) {
		MyRunnableThread runnableThread = new MyRunnableThread();
		Thread t1 = new Thread(runnableThread, "t1");
		Thread t2 = new Thread(runnableThread, "t2");
		Thread t3 = new Thread(runnableThread, "t3");
		MyExtendsThread extendsthread = new MyExtendsThread();
		extendsthread.setName("extendsthread");
		extendsthread.start();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class MyRunnableThread implements Runnable {
	public void run() {
		System.out.println("Current Thread is--->" + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "--> " + i);
		}
	}
}

class MyExtendsThread extends Thread{
	public void run() {
		System.out.println("Current Thread is--->"+ Thread.currentThread().getName());
		for(int i=0; i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"--> "+ i);
		}
	}	
}


