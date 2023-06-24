package hw_5_semaphor_countdown.downloader;


import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Uploader {
    private int fileWeight = 0;

    public synchronized void upload() {
        try {
            System.out.println("File is uploading to server, please wait.");
            while (fileWeight != 500) {
                fileWeight += 20;
                printProgress( fileWeight);
                Thread.sleep(500);
            }
            Thread.sleep(1000);
            System.out.println("\nThe file is uploaded ✅");
        } catch (InterruptedException ignored) {
        }
    }

    private void printProgress( long current) {

        int percent = (int) (current * 100 / (long) 500);

        String progress  = '\r' +
                String.format(" %d%%,", percent) +
                String.format(" %d/%d Progress: ", current, (long) 500) +
                String.join("", Collections.nCopies(percent, "=")) + '>' +
                String.join("", Collections.nCopies(100 - percent, " "));

        System.out.print("File is uploading to server, please wait." + progress );
    }

}

