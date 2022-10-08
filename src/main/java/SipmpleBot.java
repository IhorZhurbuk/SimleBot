import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class SipmpleBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "@NothingToSay_bot";
    }

    @Override
    public String getBotToken() {
        return "5673206420:AAGLC4iDJUPHhEHx5cauENfONFNjbOVptE4";
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
