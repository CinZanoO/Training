package Tasks;

public class Task6_30 {
	 public static int number = 5;

	    public static void main(String[] args) {
	        new Thread(new CountdownRunnable(), "Уменьшаем").start();
	        new Thread(new CountUpRunnable(), "Увеличиваем").start();
	    }

	    public static class CountUpRunnable implements Runnable{
	        private int countIndexUp;
	        public void run() {
	            try {
	                while(true) {
	                    countIndexUp += 1;
	                    System.out.println(toString());
	                    Thread.sleep(500);
	                    if(countIndexUp == Task6_30.number) return;  

	                }
	            } catch (InterruptedException e) {
	            }
	        }
	        public String toString() {
	            return Thread.currentThread().getName() + ": " + countIndexUp;
	        }
	    }


	    public static class CountdownRunnable implements Runnable {
	        private int countIndexDown = Task6_30.number;

	        public void run() {
	            try {
	                while (true) {
	                    System.out.println(toString());
	                    countIndexDown -= 1;
	                    if (countIndexDown == 0) return;
	                    Thread.sleep(500);
	                }
	            } catch (InterruptedException e) {
	            }
	        }

	        public String toString() {
	            return Thread.currentThread().getName() + ": " + countIndexDown;
	        }
	    }
	}

