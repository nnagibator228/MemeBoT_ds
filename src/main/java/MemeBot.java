import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class MemeBot {
    public static void main(String[] args) {
        // Insert your bot's token here
        String token = "NzE4NDUxMTE0MDA1MjMzNzM1.XtpENA.vA7SafqxQ4p1rxWMKPYJLe0PGvQ";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();

        // Add a listener which answers with "Pong!" if someone writes "!ping"
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("Pong!");
            }
        });
    }
}
