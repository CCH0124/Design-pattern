package design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Mediator
 */
public class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : users) {
            // 訊息不發送給發送者本人
            if (u != user) {
                u.receive(msg);
            }
        }
    }
}
