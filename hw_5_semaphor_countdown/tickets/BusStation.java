package hw_5_semaphor_countdown.tickets;

import java.util.concurrent.CountDownLatch;

public class BusStation {

    public static void main(String[] args) {

        MySemaphore cashBox1 = new MySemaphore(1, "cashBox:2");
        MySemaphore cashBox2 = new MySemaphore(1, "cashBox:1");

        CountDownLatch cdl = new CountDownLatch(100 + 2);
        try {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0)
                    new Passenger(cashBox1, cdl, i).start();
                else
                    new Passenger(cashBox2, cdl, i).start();
            }
            while (cdl.getCount() > 2) {
                Thread.sleep(100);
            }

            System.out.println("All the passengers, please take your seats!");
            cdl.countDown();
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("We're moving to Osh!");
        cdl.countDown();


    }

}

