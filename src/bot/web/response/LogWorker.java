package bot.web.response;

public class LogWorker {
    public void ConsoleWorker(String module, boolean moduleState){
        String state;
        if (moduleState==true) {state = "work nice.";}
        else {state = "not work";}
        System.out.println(java.time.LocalDateTime.now() + " Module " + module +" "+ state);

    }
}
