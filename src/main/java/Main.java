public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("main group");

        final Thread thread1 = new Thread(mainGroup, new MyThread());
        final Thread thread2 = new Thread(mainGroup, new MyThread());
        final Thread thread3 = new Thread(mainGroup, new MyThread());
        final Thread thread4 = new Thread(mainGroup, new MyThread());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        mainGroup.interrupt();
    }

}
