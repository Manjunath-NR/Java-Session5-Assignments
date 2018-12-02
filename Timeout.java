import java.util.Timer;
import java.util.TimerTask;

public class Timeout {

  public static void main(String[] args) throws InterruptedException {

     Timer timer = new Timer("cancel Timer");
     TimerTask task = new TimerTask() {

     public void run() {

     System.out.println("Time Out");

     }

   };

   
    long delay = 0;  
    long intevalPeriod = 1 * 1000; 

    // schedules the task to be run in an interval 

    timer.scheduleAtFixedRate(task, delay,

                                intevalPeriod);
    Thread.sleep(1000 * 10);
    task.cancel();
    timer.cancel();
    

  } // end of main

}
