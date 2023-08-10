
import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {

    public static void main(String[] args) {
        startParrotPrinter();
    }

    public static void startParrotPrinter() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("parrot");
            }
        };

        timer.schedule(task, 0, 5000);
    }
}
