package Core.Logging;

public class MailLogger implements ILogging {
    @Override
    public void log(){
        System.out.println("Mail'e loglandı");
    }
}
