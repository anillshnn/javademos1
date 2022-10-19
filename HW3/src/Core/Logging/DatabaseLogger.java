package Core.Logging;

public class DatabaseLogger implements ILogging{
    @Override
    public void log(){
        System.out.println("Database'e loglandı");
    }
}
