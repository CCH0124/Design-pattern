package design.mediator;

import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    public void clientTest() {
        // 建立中介者
        ChatMediator chatRoom = new ChatRoom();

        // 建立多個使用者並加入中介者中
        User user1 = new ChatUser(chatRoom, "小明");
        User user2 = new ChatUser(chatRoom, "小華");
        User user3 = new ChatUser(chatRoom, "小強");
        User user4 = new ChatUser(chatRoom, "阿美");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        // 小明發送訊息，其他人會收到
        user1.send("大家好！今天天氣不錯。");

        System.out.println("-------------------------");

        // 小強發送訊息，其他人（包括小明）會收到
        user3.send("有人想去喝咖啡嗎？");
    }
}
