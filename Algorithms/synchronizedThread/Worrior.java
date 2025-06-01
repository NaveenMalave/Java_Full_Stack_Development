package com.synchronizedThread;

public class Worrior implements Runnable {
String astra1 = "Sarpasthra";
String astra2 = "Bhramaasthra";
String astra3 = "Gardasthra";
@Override
	public void run() {
	String name = Thread.currentThread().getName();
	if(name.equals("Arjuna")) {
		argunaAquiredAstra();
	}else {
		KarnaAquiredAstra();
	}
	}
public void argunaAquiredAstra() {
	try {
		Thread.sleep(5000);
		synchronized(astra1){
			System.out.println(Thread.currentThread().getName()+"HAS AQUIRED RESOURSE-1:"+astra1);
			Thread.sleep(5000);
			synchronized(astra2){
				System.out.println(Thread.currentThread().getName()+"HAS AQUIRED RESOURSE-2:"+astra2);
				Thread.sleep(5000);
				synchronized(astra3){
					System.out.println(Thread.currentThread().getName()+"HAS AQUIRED RESOURSE-3:"+astra3);
					Thread.sleep(5000);
				}
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
public void KarnaAquiredAstra() {
	try {
		Thread.sleep(5000);
		synchronized(astra3){
			System.out.println(Thread.currentThread().getName()+"HAS AQUIRED RESOURSE-3:"+astra3);
			Thread.sleep(5000);
			synchronized(astra2){
				System.out.println(Thread.currentThread().getName()+"HAS AQUIRED RESOURSE-2:"+astra2);
				Thread.sleep(5000);
				synchronized(astra1){
					System.out.println(Thread.currentThread().getName()+"HAS AQUIRED RESOURSE-1:"+astra1);
					Thread.sleep(5000);
				}
			}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}

}
