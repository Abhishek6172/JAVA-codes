
package java_class10;

class PrintTask implements Runnable {
    private final String threadName;
    public PrintTask(String name) {
        this.threadName = name;
    }
    public synchronized void printWords() {
        String[] words = {"I", "Love", "java", "Very", "Much"};
        for (String word : words) {
            System.out.println(threadName + ": " + word);
        }
    }
    @Override
    public void run() {
        printWords();
    }

    public static void main(String[] args) {
        PrintTask task1 = new PrintTask("Thread 1");
        PrintTask task2 = new PrintTask("Thread 2");
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        thread1.start();
        thread2.start();
    }
}
