import View.Log;
import View.LogConsole;

public class Main {
    public static void main(String[] args) {

        Presenter control = new Presenter(new Log(new LogConsole()));
        control.start();

    }
}
