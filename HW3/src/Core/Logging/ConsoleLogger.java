package Core.Logging;

public class ConsoleLogger implements ILogging{
    @Override
    public void log(){
        System.out.println("Console a loglandı");
    }
}
