package exo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Etape2 {
	
	public static void doWork() {
		for(int i=0;i<10;i++) {
			System.out.println("The Thread name is " + Thread.currentThread().getName());	
			try {
				int sec = 1;
				System.out.println("Waiting "+sec+" sec ...");
				Thread.sleep(sec*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("--------------");
		};
	}
		
	
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.submit(Etape2::doWork);
		service.submit(()->doWork());
		service.submit(new Runnable() {
			
			@Override
			public void run() {
				doWork();
				
			}
		});
		service.shutdown();


	}

}
