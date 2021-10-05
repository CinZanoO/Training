package Tasks;

public class Task6_27 {
	static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
            System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(Integer.toString(++createdThreadCount));
            start();
        }
        public void run() {
            if (createdThreadCount < Task6_27.count) {
                System.out.println(new GenerateThread());
            }
        }
        
        @Override 
        public String toString() {
            return getName() + " created";
        }
    }
}