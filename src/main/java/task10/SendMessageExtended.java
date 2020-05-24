package task10;

import task10.model.Statistic;
import task10.model.User;
import task10.service.MessageService;
import task10.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class SendMessageExtended {

    private final Map<String, String> toSend = new HashMap<>();
    private final UserService userService;
    private final MessageService messageService;

    public SendMessageExtended(UserService userService, MessageService messageService) {
        this.userService = userService;
        this.messageService = messageService;
    }

    public Statistic send(Map<String, String> toSend){
        Statistic statistic = new Statistic();
        for (Map.Entry<String, String> entry : toSend.entrySet()){
            boolean sent = sendMessage(entry.getValue(), entry.getKey());
            statistic.collect(sent);
        }
        return statistic;
    }

    private boolean sendMessage(String username, String message){
        if (userService.existByUsername(username)){
            User user = userService.getUserByName(username);
            return messageService.sendMessage(user.getEmail(), message);
        }
        return false;
    }

}
