package java_class10;
class PrintThread extends Thread {
    private String threadName;

     PrintThread(String name) {
        threadName = name;
    }
    public synchronized void run() {
        String[] words = {"I", "Love", "java", "Very", "Much"};
        for (String word : words) {
            System.out.println(threadName + ": " + word);
        }
    }
    public static void main(String[] args) {
        PrintThread thread1 = new PrintThread("Thread 1");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        PrintThread thread2 = new PrintThread("Thread 2");
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        thread1.start();
        thread2.start();
    }
}