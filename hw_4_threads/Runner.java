package hw_4_threads;

public class Runner extends Thread {
    private final int ID;

    public Runner(int id) {
        this.ID = id;
    }

    @Override
    public void run() {
        String runnerNum = "Runner # ";
        String runsTo = " runs to Runner ";

        try {
            if (ID == 5) {
                currentRunnerInfo();
                System.out.println(runnerNum + ID + " runs to Finish");
                sleep(2000);
            } else {
                Runner runner = new Runner(ID + 1);
                currentRunnerInfo();
                System.out.println(runnerNum + ID + runsTo + (ID + 1));
                sleep(2000);
                runner.start();
                runner.join();
            }

            if (ID != 1) {
                currentRunnerInfo();
                System.out.println(runnerNum + ID + runsTo + (ID - 1));
                sleep(2000);

            } else {
                currentRunnerInfo();
                System.out.println("FINISH");
            }
        } catch (InterruptedException ignored) {
        }
    }


    public void currentRunnerInfo() {
        System.out.println(getClass().getSimpleName() + " " + ID + " gets the Baton");
    }
}
