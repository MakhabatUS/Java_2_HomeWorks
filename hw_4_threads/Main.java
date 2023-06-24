package hw_4_threads;

public class Main {

    public static void main(String[] args) {

        try {
            Runner thread = new Runner(1);
            System.out.println("START");
            Thread.sleep(2000);
            thread.start();
        } catch (InterruptedException ignored) { }
    }
}
