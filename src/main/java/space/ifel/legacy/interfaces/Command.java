package space.ifel.legacy.interfaces;

public interface Command {
    Command process(String commandBody);

    Command buildMeaning();

    String getResponse();
}
