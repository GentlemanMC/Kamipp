package ssl.wastaken.kamipp.features.command.commands;

import ssl.wastaken.kamipp.Kami;
import ssl.wastaken.kamipp.features.command.Command;

public class ReloadCommand
        extends Command {
    public ReloadCommand() {
        super("reload", new String[0]);
    }

    @Override
    public void execute(String[] commands) {
        Kami.reload();
    }
}

