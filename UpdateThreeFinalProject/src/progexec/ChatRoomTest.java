package progexec;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatRoomTest {
    @Test
    public void testAddParticipant() {
        ChatRoom chatRoom = new ChatRoom("Room1");
        User user = new User("JohnDoe", "Online", "001");
        chatRoom.addParticipant(user);
        assertTrue(chatRoom.getParticipants().contains(user));
    }

    @Test
    public void testAddMessage() {
        ChatRoom chatRoom = new ChatRoom("Room1");
        Message message = new Message("JohnDoe", "Hello!");
        chatRoom.addMessage(message);
        assertTrue(chatRoom.getMessages().contains(message));
    }
}
