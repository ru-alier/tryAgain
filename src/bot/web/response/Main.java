package bot.web.response;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bot started ...");
        LogWorker LW = new LogWorker();
        LW.ConsoleWorker("Main", true);
    }
}
