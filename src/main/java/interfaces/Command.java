package interfaces;

public interface Command {
    Command Command(String commandBody);

    void Process();

    String GetResponse();
}
