import java.util.Random;

/**
 * Created by tjm on 2019/12/27.
 */
public class HoldLockMain {

    public static Object[] locks = new Object[10];
    public static Random random = new Random();

    static {
        for (int i = 0; i < locks.length; i++) {
            locks[i] = new Object();
        }
    }

    public static class HoldTask implements Runnable {
        private int i;

        public HoldTask(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    synchronized (locks[i]) {
                        if (i % 2 == 0) {
                            locks[i].wait(1000);
                        } else {
                            locks[i].notify();
                        }
                    }
                }
            } catch (Exception e) {

            }

        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("大大大大大");
            new Thread(new HoldTask(i/2)).start();
        }
    }
}
